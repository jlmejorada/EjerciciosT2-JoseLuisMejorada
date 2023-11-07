package ejerciciosbucles;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// Creamos una variable para las horas, minutos, segundos y el incremento
		int horas, minutos, segundos, incremento;
		
		//Creamos un escaner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos las horas y registramos
		System.out.println("Dame el número de horas");
		horas=sc.nextInt();
		
		//Pedimos los minutos y registramos
		System.out.println("Dame el número de minutos");
		minutos=sc.nextInt();
		
		//Pedimos los segundos y registramos
		System.out.println("Dame el número de segundos");
		segundos=sc.nextInt();
		
		//Pedimos los segundos a incrementar y registramos
		System.out.println("Dame los segundos a incrementar");
		incremento=sc.nextInt();
		
		for (int i=1;i<=incremento;i++) {
			segundos++;
		}
		
		// Comprobamos que no hayan llegado a 60 segundos
		if (segundos>=60) {
			// Le quitamos 60 segundos y sumamos un minuto
			minutos+=(segundos/60);
			segundos%=60;
			}
				
		// Comprobamos que los minutos no hayan llegado a 60
		if (minutos>=60) {
			// Le quitamos 60 segundos y sumamos un minuto
			horas+=(minutos/60);
			minutos%=60;
		}
		// Comprobamos que las horas no hayan llegado a 24
		if (horas>=24) {
			horas%=24;
		}
				
		//Mostramos la hora modificada
		System.out.println(horas + ":" + minutos + ":" + segundos);
		
		//Cerramos el escaner
		sc.close();

	}

}