package com.senati.eti;

import java.util.Scanner;

public class Caso4conCuatro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese primer n�mero: ");
		int n1 = sc.nextInt();
		
		System.out.print("Ingrese segundo n�mero: ");
		int n2 = sc.nextInt();
		
		System.out.print("Ingrese tercer n�mero: ");
		int n3 = sc.nextInt();
		
		System.out.print("Ingrese cuarto n�mero: ");
		int n4 = sc.nextInt();
		
		String estado = "";
		
		if (n1 == n2 && n1 == n3 && n1 == n4)
			estado = "TODOS los n�meros son iguales";
		else if (n1 < n2 && n1 < n3 && n1 < n4)
			estado = "El primer n�mero es menor";
		else if (n2 < n1 && n2 < n3 && n2 < n4)
			estado = "El segundo n�mero es menor";
		else if (n3 < n1 && n3 < n2 && n3 < n4)
			estado = "El tercer n�mero es menor";
		else
			estado = "El cuarto n�mero es menor";
		
		System.out.println("------------------------------");
		System.out.println("========= Resultados =========");
		System.out.println("------------------------------");
		System.out.println("" + estado);


	}

}
