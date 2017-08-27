package paqueteNegocio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Negocio {
	private LinkedList<Mesada> listaMesadas;

	public Negocio(String path) throws FileNotFoundException {
		Scanner sc = new Scanner(new File(path));
		listaMesadas = new LinkedList<Mesada>();
		int cant = sc.nextInt();
		for (int i = 0; i < cant; i++) {
			listaMesadas.add(new Mesada(sc.nextDouble(), sc.nextDouble()));
		}

		Collections.sort(listaMesadas);
		for (Mesada mesada : listaMesadas) {
			System.out.println(mesada);
		}
		sc.close();
	}

	public int apilar() {
		int apilados = 0;
		int cant;
		Mesada mesadaBase;
		while (listaMesadas.size() > 1) {
			mesadaBase = listaMesadas.removeFirst();
			cant = listaMesadas.size();
			
			for (int i = 0; i < cant; i++) {
				Mesada mesada = listaMesadas.get(i);
				
				if(mesada.entraEn(mesadaBase)){
					mesadaBase = mesada;
					this.listaMesadas.remove(i);
					i--;
					cant--;
				}
			}
			apilados ++;
		}
		return (this.listaMesadas.size() == 1)? ++apilados : apilados;
	}

}
