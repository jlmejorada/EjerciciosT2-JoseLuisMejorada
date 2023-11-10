package ejerciciosbucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio09 {
	/* 
	 * ENTRADA: -2   | RES. ESPERADO: error | RES. OBTENIDO: error
	 * ENTRADA: cuatro | RES. ESPERADO: error   | RES. OBTENIDO: error   
	 * ENTRADA: 3234234 | RES. ESPERADO: 7 | RES. OBTENIDO: 7
	 */
	public static void main(String[] args) {
		// Creamos una variable para el contador y otra para el número introducido
		int contador=0, num=0;
		
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
		
		//Hacemos un bucle que opere hasta que el número entero resultante a la operación sea 0
		while (num!=0) {
			//Divide entre 10 para quiatarle un número entero
			num=num/10;
			//Y lo contamos
			contador++;
		}
		
		//Decimos el número de caracteres del número
		System.out.println("El número tenia " + contador + " cifras");
		
		//Cerramos el escaner
		sc.close();
	}

}
