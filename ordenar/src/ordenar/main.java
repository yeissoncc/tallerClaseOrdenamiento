package ordenar;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arreglo[] = {5,3,2,4,32,2,1,1,10};
		
		ordenamientoburbuja o = new ordenamientoburbuja();
		o.ordenamientoburbuja(arreglo);
		
		for(int i = 0; i < arreglo.length;i++){
			
			System.out.println(arreglo[i]);
			
		}
	}

}
