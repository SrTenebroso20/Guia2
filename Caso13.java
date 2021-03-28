package com.senati.eti;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.0");
		
		System.out.print("Primer número: ");
		float num1 = sc.nextInt();
		
		System.out.print("Segundo número: ");
		float num2 = sc.nextInt();
		
		System.out.print("Número [1-6]: ");
		int n = sc.nextInt();
		
		String op = "";
		float rpta = 0;
		
		switch (n) {
			case 1:
			op = "Suma";
			rpta = num1 + num2;
			break;
			
		    case 2:
		    	op = "Resta";
		    	rpta = num1 - num2;
		    	break;
		    	
		    case 3:
				op = "Producto";
				rpta = num1 * num2;
				break;
				
		    case 4:
				op = "División";
				if (num1 == 0 &&  num2 == 0)
					System.out.println("No se puede dividir entre cero");
				else
					rpta = num1 / num2;
				break;
				
		    case 5:
				op = "Resto";
				if (num1 == 0 && num2 == 0)
					System.out.println("No es posible hallar el resto entero‬");
				else
					rpta = num1 % num2;
				break;
				
		    case 6:
				op = "Promedio";
				rpta = (num1 + num2) / 2;
				break;
		    default:
		    	op = "Desconocido";
		}
		
		System.out.println("------------------------");
		System.out.println("====== Resultados ======");
		System.out.println("------------------------");
		System.out.println("Número 1: " + num1);
		System.out.println("Número 2: " + num2);
		System.out.println("Operación: " + op);
		System.out.println("Resultado: " + df.format(rpta));
	}
}
