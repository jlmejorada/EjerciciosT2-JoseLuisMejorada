package ejerciciosbucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio01 {
	/*
	 * ENTRADA: hora=24 | REL. ESPERADO: ERROR | REL. OBTENIDO: ERROR
	 * ENTRADA: minutos=64 | REL. ESPERADO: ERROR | REL. OBTENIDO: ERROR
	 * ENTRADA: segundos=72 | REL. ESPERADO: ERROR | REL. OBTENIDO: ERROR
	 * ENTRADA: incremento=-6 | REL. ESPERADO: ERROR | REL. OBTENIDO: ERROR
	 * ENTRADA: hora=minuto=segundo=incremento="texto" | REL. ESPERADO: ERROR | REL. OBTENIDO: ERROR
	 * ENTRADA: hora=23 minutos=50 segundos=37 incremento=2173 | REL. ESPERADO: 0:26:50 | REL. OBTENIDO: 0:26:50
	 * ENTRADA: hora=12 minutos=35 segundos=59 incremento=23 | REL. ESPERADO: 12:36:22 | REL. OBTENIDO: 12:36:22
	 */
	public static void main(String[] args) {
		// Creamos una variable para las horas, minutos, segundos y el incremento
		int horas=-1, minutos=-1, segundos=-1, incremento=-1;
		
		//Creamos un escaner
		Scanner sc = new Scanner(System.in);
		
		//Con este bucle nos aseguramos que el número introducido está en el rango
		do {
			try {
			//Pedimos las horas y registramos
			System.out.println("Dame el número de horas (entre 0 y 23)");
			horas=sc.nextInt();
			//Si la hora introducida es un String salta un error
			} catch (InputMismatchException e) {
				System.out.println("El tipo de dato introducido no es correcto");
				sc.nextLine();
			}
		} while (horas<0||horas>23);
		
		//Con este bucle nos aseguramos que el número introducido está en el rango
		do {
			try {
			//Pedimos los minutos y registramos
			System.out.println("Dame el número de minutos (entre 0 y 59)");
			minutos=sc.nextInt();
			//Si los minutos introducidos es un String salta un error
			} catch (InputMismatchException e) {
				System.out.println("El tipo de dato introducido no es correcto");
				sc.nextLine();
			}
		} while (minutos<0||minutos>59);
		
		//Con este bucle nos aseguramos que el número introducido está en el rango
		do {
			try {
			//Pedimos los segundos y registramos
			System.out.println("Dame el número de segundos (entre 0 y 59)");
			segundos=sc.nextInt();
			//Si los segundos introducidos es un String salta un error
			} catch (InputMismatchException e) {
				System.out.println("Solo se pueden introducir caracteres númericos");
				sc.nextLine();
			}
		} while (segundos<0||segundos>59);
		
		//Con este bucle nos aseguramos que el número introducido está en el rango
		do {
			try {
			//Pedimos el incremento y registramos
			System.out.println("Dame el incremento de segundos (tiene que ser positivo)");
			incremento=sc.nextInt();
			//Si el incremento es un String salta un error
			} catch (InputMismatchException e) {
				System.out.println("Solo se pueden introducir caracteres númericos");
				sc.nextLine();
			}
		} while (incremento<0);
		
		for (int i=1;i<=incremento;i++) {
			segundos++;
			// Comprobamos que no hayan llegado a 60 segundos			
			if (segundos>=60) {
				minutos++;
				segundos=0;
			// Comprobamos que los minutos no hayan llegado a 60
			} else if (minutos>=60) {
				horas++;
				minutos=0;	
			// Comprobamos que las horas no hayan llegado a 24
			} else if (horas>=24) {
				horas =0;
			}
		}
		
		//Mostramos la hora modificada
		System.out.println(horas + ":" + minutos + ":" + segundos);
		
		//Cerramos el escaner
		sc.close();

	}

}