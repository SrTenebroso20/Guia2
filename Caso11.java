package com.senati.eti;
import java.util.Scanner;

public class Caso11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numerodia = 0;
		
		System.out.print("N?mero [1-7]: ");
		numerodia = sc.nextInt();
		
		String nombre_dia = "";
		
		switch (numerodia) {
			case 1:
			nombre_dia = "Domingo";
			break;
		    case 2:
		    	nombre_dia = "Lunes";
		    	break;
		    case 3:
				nombre_dia = "Martes";
				break;
		    case 4:
				nombre_dia = "Mi?rcoles";
				break;
		    case 5:
				nombre_dia = "Jueves";
				break;
		    case 6:
				nombre_dia = "Viernes";
				break;
		    case 7:
				nombre_dia = "S?bado";
				break;
		    default:
		    	nombre_dia = "Desconocido";   
		}
		
		System.out.println("\n======== Resultados ========");
		System.out.println("Nombre del d?a: " + nombre_dia);
		

	}

}
