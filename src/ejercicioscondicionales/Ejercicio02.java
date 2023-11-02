package ejercicioscondicionales;

import java.util.Scanner;

public class Ejercicio02 {
	/*
	 * ENTRADA: 4567 | REL. ESPERADO: ERROR | REL. OBTENIDO: ERROR
	 * ENTRADA: 29538048 | REL. ESPERADO: 29538038N | REL. OBTENIDO: 29538038N
	 * ENTRADA: 00000000 | REL. ESPERADO: 00000000T | REL. OBTENIDO: 00000000T
	 * ENTRADA: 29538048 | REL. ESPERADO: 29538048E | REL. OBTENIDO: 29538048E
	 */
	public static void main(String[] args) {
		// Creamos una variable para almacenar el número y otra para la letra
		int num;
		char letra;
		
		//Creamos la variable escaner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos y guardamos el número de DNI
		System.out.println("Dame tu DNI sin letra");
		num = sc.nextInt();
		
		//Hacemos un if que compruebe que el número introducido es de 8 cifras y positivo
		if (num>999999999||num<=99999999) {
		
			//Creamos un switch que mire el modulo de 23 y le introduzca la letra oportuna
			letra = switch (num%23) {
			case 0->'T';
			case 1->'R';
			case 2->'W';
			case 3->'A';
			case 4->'G';
			case 5->'M';
			case 6->'Y';
			case 7->'F';
			case 8->'P';
			case 9->'D';
			case 10->'X';
			case 11->'B';
			case 12->'N';
			case 13->'J';
			case 14->'Z';
			case 15->'S';
			case 16->'Q';
			case 17->'V';
			case 18->'H';
			case 19->'L';
			case 20->'C';
			case 21->'K';
			case 22->'E';
			default -> 'ñ';
			};
			System.out.println("Tu DNI es " + num + letra);
		} else System.out.println("No es un número valido");
		
		//Cerramos el escaner
		sc.close();

	}

}
