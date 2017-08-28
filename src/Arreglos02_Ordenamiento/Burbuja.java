package Arreglos02_Ordenamiento;

public class Burbuja {
	int a[] = {8,5,2,3,9,7,8,1,-10,30,33};
	
	public Burbuja(){
		mostrar("Arreglo Original:");
		ordenarAscendente(true);
		mostrar("Arreglo con orden ascendente:");
		ordenarDescendente(false);
		mostrar("Arreglo con orden descendente:");
	}
	
	public void mostrar(String titulo){
		System.out.println(titulo);
		for(int n: a){
			System.out.print(n + " ");
		}
		System.out.println();
	}
	
	public void ordenarAscendente(boolean usarTemporal){
		for(int i=0; i<(a.length-1); i++){
			for(int j=0; j<(a.length-1); j++){
				if(a[j] > a[j+1]){
					if(usarTemporal){
						int temp=a[j];
						a[j] = a[j+1];
						a[j+1] = temp;
					} else {
						a[j] = a[j] + a[j+1];
						a[j+1] = a[j] - a[j+1];
						a[j] = a[j] - a[j+1];
					}
				}
			}
		}
	}
	
	public void ordenarDescendente(boolean usarTemporal){
		for(int i=0; i<(a.length-1); i++){
			for(int j=0; j<(a.length-1); j++){
				if(a[j] < a[j+1]){
					if(usarTemporal){
						int temp=a[j];
						a[j] = a[j+1];
						a[j+1] = temp;
					} else {
						a[j] = a[j] + a[j+1];
						a[j+1] = a[j] - a[j+1];
						a[j] = a[j] - a[j+1];
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new Burbuja();

	}

}
