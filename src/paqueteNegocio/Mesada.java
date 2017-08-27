package paqueteNegocio;


public class Mesada implements Comparable<Mesada> {
	private double largo,
				   ancho;
	
	public Mesada(double l, double a){
		this.largo = l;
		this.ancho = a;
	}
	
	public boolean entraEn(Mesada that){
		// PREGUNTO SI ENTRA COMO VIENE, SINO LA ROTO Y PREGUNTO
		return ((this.ancho <= that.ancho && this.largo <= that.largo) || (this.ancho <= that.largo && this.largo <= that.ancho));
	}
	
	@Override
	public int compareTo(Mesada that) {
		
		if(this.largo < that.largo)
			return 1;
		
		//SI SON IGUALES PREGUNTO POR EL ANCHO
		if(this.largo == that.largo){
			//SI ES IGUAL TANTO ANCHO COMO LARGO, ORDENA POR ORDEN DE LECTURA
			if(this.ancho <= that.ancho)
				return 1;
		}
		
		return -1;
		
	}

	@Override
	public String toString() {
		return "Mesada [largo=" + largo + ", ancho=" + ancho + "]";
	}
	
	

}
