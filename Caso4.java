package com.senati.eti;

import java.util.Scanner;

public class Caso4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese primer n�mero: ");
		int n1 = sc.nextInt();
		
		System.out.print("Ingrese segundo n�mero: ");
		int n2 = sc.nextInt();
		
		String estado = "";
		
		if (n1 == n2)
			estado = "Ingrese n�meros diferentes";
		else if (n1 < n2)
			estado = "El n�mero " + n1 + " es menor";
		else
			estado = "El n�mero " + n2 + " es menor";
		
		System.out.println("------------------------------");
		System.out.println("========= Resultados =========");
		System.out.println("------------------------------");
		System.out.println("" + estado);
	}

}
