package Arreglos03_BusquedaLineal;

import java.util.Scanner;

public class Lineal {

	int a[] = new int[100];
	
	Scanner sc = new Scanner(System.in);
	int numero, indice;
	
	public Lineal(){
		poblar();
		mostrar();
		buscar();
	}
	
	public void buscar(){
		System.out.print("Ingrese el número a buscar: ");
		numero = sc.nextInt();
				
		indice = busquedaLineal(numero);
		if(indice >= 0){
			System.out.println("El valor "+ numero +" está en el indice " + indice);
		} else {
			System.out.println("No pude encontrar el valor " + numero + " en el arreglo");
		}
		System.out.println("La cantidad de elementos recorridos fueron: " + (indice+1));
	}
	
	public int busquedaLineal(int x){
		for(int i=0; i<a.length; i++){
			if(a[i]==x){
				return i;
			}
		}
		return -1;
	}
	
	public void poblar(){
		for(int i=0; i<a.length; i++){
			a[i] = (int)(Math.random()*100);
		}
	}
	
	public void mostrar(){
		for(int n: a){
			System.out.print(n + " ");
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		new Lineal();

	}

}
