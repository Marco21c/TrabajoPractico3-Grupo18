package ar.edu.unju.fi.aplicacion.punto5;

import java.util.Scanner;

public class Punto5 {

	public static void main(String[] args) {
	 // TODO Auto-generated method stub
	 Scanner entrada= new Scanner(System.in);
     System.out.println("Ingrese Cadena de caracteres: ");     
     String cadena = entrada.nextLine(); 
     
     char[] arreglo = new char[cadena.length()];
     
     for(int i=0;i<arreglo.length;i++) {
	 arreglo[i]= cadena.charAt(i);
	 }
     
	 for(int i=arreglo.length-1;i>=0;i--) {
		 	System.out.println(arreglo[i]);
	 }
	
	}

}