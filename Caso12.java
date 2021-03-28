package com.senati.eti;

import java.util.Scanner;

public class Caso12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String empleado = "";
		int nivel = 0;
		int sueldo = 0;
		
		System.out.print("Nombre de empleado: ");
		empleado = sc.nextLine();
		
		System.out.print("Nivel [1-4]: ");
		nivel = sc.nextInt();
		
		System.out.print("Sueldo: ");
		sueldo = sc.nextInt();
		
		float inc = 0;
		
		switch (nivel) {
			case 1:
				inc = 0.045f;
				break;
			case 2:
				inc = 0.06f;
				break;
			case 3:
				inc = 0.085f;
				break;
			case 4:
				inc = 0.11f;
				break;
			default:
				inc = 0;
		}
		
		Float nuevo_sueldo = sueldo + (sueldo * inc);
		
		System.out.println("------------------------");
		System.out.println("====== Resultados ======");
		System.out.println("------------------------");
		System.out.println("Empleado......: " + empleado);
		System.out.println("Nivel.........: " + nivel);
		System.out.println("Sueldo........: " + "S/" +sueldo);
		System.out.println("Incremento....: " + inc * 100 + "%");
		System.out.println("Nuevo sueldo..: " + "S/" + nuevo_sueldo);
	}
}
