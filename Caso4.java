package com.senati.eti;

import java.util.Scanner;

public class Caso4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese primer número: ");
		int n1 = sc.nextInt();
		
		System.out.print("Ingrese segundo número: ");
		int n2 = sc.nextInt();
		
		String estado = "";
		
		if (n1 == n2)
			estado = "Ingrese números diferentes";
		else if (n1 < n2)
			estado = "El número " + n1 + " es menor";
		else
			estado = "El número " + n2 + " es menor";
		
		System.out.println("------------------------------");
		System.out.println("========= Resultados =========");
		System.out.println("------------------------------");
		System.out.println("" + estado);
	}

}
