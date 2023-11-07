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
		
		// Comprobamos que nos hayan metido el tiempo dentro de los rangos necesarios 
		if ((horas<=23 && horas>=1)&&(minutos<=59 && minutos>=1)&&(segundos<=59 && segundos>=1)&&incremento>0) {
		
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
		
		} else System.out.println("Las horas, minutos, segundos o el incremento, no estan introducidos correctamente");
		
		//Mostramos la hora modificada
		System.out.println(horas + ":" + minutos + ":" + segundos);
		
		//Cerramos el escaner
		sc.close();

	}

}