package insercion;

class main {
	
	public void main(String[] arg) {
		
		int arreglo[]= {5,11,13,15,4,12,23,3,4,2,1,45,13};
		
		Ordenar o = new Ordenar();
		o.OrdenamientoInsercion(arreglo);
		
		for(int i = 0; i < arreglo.length; i++) {
			
			System.out.println(arreglo[i]);
		}
		
	}

}
