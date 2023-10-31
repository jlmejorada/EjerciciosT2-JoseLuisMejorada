package ejercicioscondicionales;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// Creamos una variable para almacenar el número y otra para la letra
		int num;
		char letra;
		
		//Creamos la variable escaner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos y guardamos el número de DNI
		System.out.println("Dame tu DNI sin letra");
		num = sc.nextInt();
		
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
		
		//Cerramos el escaner
		sc.close();

	}

}
