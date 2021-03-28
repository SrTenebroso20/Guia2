package com.senati.eti;

import java.util.Scanner;

public class Caso3puntoCinco {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese primer número: ");
		int n1 = sc.nextInt();
		
		System.out.print("Ingrese segundo número: ");
		int n2 = sc.nextInt();
		
		System.out.print("Ingrese tercer número: ");
		int n3 = sc.nextInt();
		
		String estado = "";
		
		if (n1 == n2 && n1 == n3)
			estado = "Los números son iguales";
		else if (n1 > n2 && n1 > n3)
			estado = "El primer número es mayor";
		else if (n2 > n1 && n2 > n3)
			estado = "El segundo número es mayor";
		else
			estado = "El tercer número es mayor";
		
		System.out.println("\n======== Resultados ========");
		System.out.println("Estado: " + estado);
		

	}

}
