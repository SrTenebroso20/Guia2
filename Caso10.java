package com.senati.eti;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.0");
		
		System.out.print("Nombre del colaborador: ");
		String nombre = sc.nextLine();
		
		System.out.print("Horas trabajadas: ");
		float ht = sc.nextFloat();
		
		System.out.print("Tarifa por hora: ");
		float tfh = sc.nextFloat();
		
		System.out.print("Tardanza(en minutos): ");
		float min = sc.nextFloat();
		
		float importe = ht * tfh;
		float bono = 0;
		float descuento = 0; 
		
		if (ht > 60)
			bono = importe * 0.13f;
		else
			bono = importe * 0.04f;
		
		if (min > 15)
			descuento = importe * 0.03f;
		else
			descuento = 0;
		
        float alcanzado = (ht * 100) / 70;
        
        System.out.println("------------------------------");
        System.out.println("========= Resultados =========");
        System.out.println("------------------------------");
        System.out.println("Colaborador.......: " + nombre);
        System.out.println("Horas trabajadas..: " + df.format(ht));
        System.out.println("Tarifa por horas..: " + "S/" + df.format(tfh));
        System.out.println("Importe...........: " + "S/" + df.format(importe));
        System.out.println("Bono..............: " + "S/" + df.format(bono));
        System.out.println("Descuento.........: " + "S/" + df.format(descuento));
        System.out.println("Meta alcanzada....: " + df.format(alcanzado) + "%");
	}

}
