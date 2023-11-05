package ejercicioscondicionales;

import java.util.Scanner;

public class Ejercicio07 {
	/*
	 * ENTRADA: horas=1 minutos=59 segundos=59 | REL. ESPERADO: horas=2 minutos=0 segundos=0 | REL. OBTENIDO:  horas=2 minutos=0 segundos=0
	 * ENTRADA: horas=1 minutos=45 segundos=59 | REL. ESPERADO: horas=1 minutos=46 segundos=0 | REL. OBTENIDO:  horas=1 minutos=46 segundos=0
	 * ENTRADA: horas=1 minutos=59 segundos=45 | REL. ESPERADO: horas=1 minutos=59 segundos=46 | REL. OBTENIDO:  horas=2 minutos=59 segundos=46
	 */
	public static void main(String[] args) {
		// Creamos una variable para las horas minutos y segundo
		int horas, minutos, segundos;
		
		// Creamos el escaner
		Scanner sc= new Scanner(System.in);
		
		// Pedimos las horas
		System.out.println("Dame las horas");
		horas=sc.nextInt();
		
		// Pedimos los minutos
		System.out.println("Minutos");
		minutos=sc.nextInt();
		
		//Pedimos los segundos
		System.out.println("Segundos");
		segundos=sc.nextInt();
		
		// Le sumamos un segundo
		segundos++;
		
		// Comprobamos que no hayan llegado a 60 segundos
		if (segundos==60) {
			// Le quitamos 60 segundos y sumamos un minuto
			segundos=segundos-60;
			minutos++;
		}
		
		// Comprobamos que los minutos no hayan llegado a 60
		if (minutos==60) {
			// Le quitamos 60 segundos y sumamos un minuto
			minutos=minutos-60;
			horas++;
		}
		
		//Mostramos la hora modificada
		System.out.println(horas + " horas, " + minutos + " minutos, " + segundos + " segundos");
		
		// Cerramos el escaner
		sc.close();

	}

}