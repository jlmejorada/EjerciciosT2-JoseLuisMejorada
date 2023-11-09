package ejerciciosbucles;

import java.util.InputMismatchException;
import java.util.Scanner; 

public class Ejercicio05 {
	/*
	 * ENTRADA: -2 | REL. ESPERADO: ERROR | REL. OBTENIDO: ERROR
	 * ENTRADA: cuatro | REL. ESPERADO: ERROR | REL. OBTENIDO: ERROR
	 * ENTRADA: num1=8 num2=12 | REL. ESPERADO: 4 | REL. OBTENIDO: 4
	 * ENTRADA: num1=100 num2=50 | REL. ESPERADO: 50 | REL. OBTENIDO: 50
	 */
	public static void main(String[] args) {
		//Creamos dos variables para los números introducidos y el número maximo de estos dos
		int num1=-1, num2=-1, nummax;
		
		//Creamos el escaner
		Scanner sc = new Scanner(System.in);
		
		//Comprobamos que sean números positivos
		do {
			try {
				//Pedimos un número y lo registramos
				System.out.println("Dame un número (que sean números enteros, sin letras)");
				num1=sc.nextInt();
				
			//Comprobamos que el cliente solo introduzca números
			} catch (InputMismatchException e) {
				System.out.println("El tipo de dato introducido no es correcto");
			}
			
		} while (num1<0); 
		
		//Comprobamos que sean números positivos
		do {
			try {
				//Pedimos otro número y lo registramos
				System.out.println("Dame otro número (que sean números enteros, sin letras)");
				num2=sc.nextInt();
				
			//Comprobamos que el cliente solo introduzca números
			} catch (InputMismatchException e) {
				System.out.println("El tipo de dato introducido no es correcto");
			}
			
		} while (num2<0); 
		
		//Vemos que número es el mayor
		if (num1>num2) {
			nummax=num1;
		} else nummax=num2;
		
		// Se realiza el bucle hasta que se encuentra el M.C.M. de ambos números
		while(nummax%num1!=0||nummax%num2!=0){
			nummax++;
		} 
		
		//Mostramos cual es el máximo comun divisor
		System.out.println("El mínimo comun multiplo es " + nummax);
		
		//Cerramos el escaner
		sc.close();

	}

}
