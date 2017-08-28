package Arreglos04_BusquedaBinaria;

import java.util.Scanner;

public class Binaria {
	/**
	 * Para hacer una búsqueda binaria, el arreglo debe estar ordenado
	 */
	
	
	int a[] = {-9,-6,-3,-1,0,12,24,30,33,45,52,63,68,79,80,99};
	int numero,elemento,posInicial,posMedio,posFinal,contador;
	Scanner sc = new Scanner(System.in);
	
	public Binaria(){
		buscar();
	}
	
	public void buscar(){
		System.out.print("Digite el número a buscar: ");
		numero = sc.nextInt();
		elemento = busqueda(numero);
		if(elemento >= 0 ){
			System.out.println("El elemento está en el indice: " + elemento);
			System.out.println("La posicion del elemento es: " + (elemento+1));
		} else {
			System.out.println("No se encontro el elemento.");
		}
		System.out.println("Comparaciones: " + contador);
		
	}
	
	public int busqueda(int n){
		posInicial = 0;
		posFinal = a.length-1;
		
		if(n<a[posInicial] || n>a[posFinal]){
			return -1;
		}
		
		while(posInicial<=posFinal){
			contador++;
			posMedio = (posInicial + posFinal)/2;
			
			System.out.println(crearSalida(posInicial, posMedio, posFinal));
			
			if(n==a[posMedio]){
				return posMedio;
			} else if(n<a[posMedio]){
				posFinal = posMedio - 1;
			} else {
				posInicial = posMedio + 1;
			}
		}
		return -1;
	}
	
	public String crearSalida(int posIni, int posMed, int posFin){
		String salida = "";
		//Se recorre el arreglo
		for(int j=0; j<a.length; j++){
			// Si el intervalo está fuera del conjunto actual
			// se agregan espacios en la salida.
			if(j<posIni || j>posFin){
				salida += "   ";
			//Si es el elemento del medio, se agrega un * y espacios
			} else if(j == posMed){
				salida += a[j] + "* ";
			//De lo contrario, solo anexar el elemento con espacios
			} else {
				salida += a[j] + " ";
			}
		}
		return salida;
	}
	

	public static void main(String args[]){
		new Binaria();
	}
	
}
