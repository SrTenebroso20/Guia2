package com.senati.eti;

import java.util.Scanner;

public class Caso5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese precio: ");
		float precio = sc.nextFloat();
		
		System.out.print("Ingrese cantidad: ");
		int cantidad = sc.nextInt();
		
		float total = precio * cantidad;
		
		float dscto = 0;
		
		if (cantidad > 8)
			dscto = 0.1f * total;

		
		System.out.println("\n--------Resultados --------");
		System.out.println("Total......: " + total);
		System.out.println("Descuento..: " + dscto);
		System.out.println("Neto.......: " + (total - dscto));
		
		

	}

}
