package ejerciciosbucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio10 {
	/* 
	 * ENTRADA: -2   | RES. ESPERADO: error | RES. OBTENIDO: error
	 * ENTRADA: cuatro | RES. ESPERADO: error   | RES. OBTENIDO: error  
	 * ENTRADA: 0 | RES. ESPERADO: error   | RES. OBTENIDO: error  
	 * ENTRADA: 3234234 | RES. ESPERADO: no es capicua | RES. OBTENIDO: no es capicua
	 * ENTRADA: 32123 | RES. ESPERADO: es capicua | RES. OBTENIDO: es capicua
	 */
	public static void main(String[] args) {
		/* Creamos una variable para recoger el primer número,para tener este del reves,
		el último nº y una para operar*/
		int num=0, numReves=0, ultimoNum, operar;
		
		//Creamos el escaner
		Scanner sc = new Scanner(System.in);
		
		//Comprobamos que el número este en el rango correcto
		do {
			// Comprobamos que no nos han introducido otro tipo de caracter
			try {
				//Pedimos el  numero
				System.out.print("Dame un número (positivo y entero): ");
				num=sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("El tipo de dato introducido no es correcto");
				sc.nextLine();
			}
			
		} while (num<=0);

		// Registramos el número en operar
		operar=num;
		
		//Creamos un bucle que recorra los números hasta que el número entero es 0
		while(operar>0) {
			//Pillamos la última cifra haciendo el modulo del número
			ultimoNum=operar%10;
			//Le quitamos una cifra
			operar/=10;
			//y añadimos el número al número del reves
			numReves = numReves * 10 + ultimoNum;
		}
		
		//Comprobamos que el número del derecho sea igual que del reves
		if (num==numReves) {
			//Si lo es, es capicua
			System.out.println("Es capicua");
			//Si no, no lo es
		} else System.out.println("No es capicua");
		
		//Cerramos el escaner
		sc.close();
	}

}
