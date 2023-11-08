package ejerciciosbucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio02 {
	/*
	 * ENTRADA: -2 | REL. ESPERADO: ERROR | REL. OBTENIDO: ERROR
	 * ENTRADA: 0 | REL. ESPERADO: 0 | REL. OBTENIDO: 0
	 * ENTRADA: 1 | REL. ESPERADO: 0 | REL. OBTENIDO: 0
	 * ENTRADA: 50 | REL. ESPERADO: 15 | REL. OBTENIDO: 15
	 */
	public static void main(String[] args) {
		// Creamos las variables para el número máximo y un contador para saber el nº de primos que hay
		int num=-1, nPrimos=0;
		
		// Creamos una variable booleana que marque cuando un número es primo y cuando no, para summarlo
		boolean primo;
		
		// Creamos el escaner
		Scanner sc = new Scanner(System.in);
		
		//Comprobamos que nos han introducido un número valido
		do {
			try {
				//Pedimos el número hasta el que buscará primos
				System.out.println("Dame un número y te buscare números primos hasta él (tiene que ser positivo)");
				num=sc.nextInt();
			} catch(InputMismatchException e) {
				System.out.println("Solo se pueden introducir caracteres númericos");
				sc.nextLine();
			}
		} while (num<0);
		
		//Creamos un bucle que recorra todos los números hasta el especificado
		for (int i=2;i<=num;i++) {
			//Con esto se pone primo como true
			primo=true;
			//Creamos un bucle que recorra los números para buscar el primo
			for (int j=2;j<=(i-1);j++) {
				//Creamos una división que mire si el resto de una división da 0 y por lo tanto, no es primo
				if ((i%j)==0) {
					//Se pone primo como false
					primo=false;
					break;
				}
			}
			// Si primo es true, suma uno al contador
			if (primo) {
				nPrimos++;
			}
			
		}
		System.out.println("El número de primos es: " + nPrimos);
		
		//Cerramos el escaner
		sc.close();
	}

}
