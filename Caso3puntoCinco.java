package com.senati.eti;

import java.util.Scanner;

public class Caso3puntoCinco {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese primer n�mero: ");
		int n1 = sc.nextInt();
		
		System.out.print("Ingrese segundo n�mero: ");
		int n2 = sc.nextInt();
		
		System.out.print("Ingrese tercer n�mero: ");
		int n3 = sc.nextInt();
		
		String estado = "";
		
		if (n1 == n2 && n1 == n3)
			estado = "Los n�meros son iguales";
		else if (n1 > n2 && n1 > n3)
			estado = "El primer n�mero es mayor";
		else if (n2 > n1 && n2 > n3)
			estado = "El segundo n�mero es mayor";
		else
			estado = "El tercer n�mero es mayor";
		
		System.out.println("\n======== Resultados ========");
		System.out.println("Estado: " + estado);
		

	}

}
