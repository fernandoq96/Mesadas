package paqueteNegocio;

import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Negocio boliche = new Negocio("Lote2.txt");
		System.out.println(boliche.apilar());

	}

}
