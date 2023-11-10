package ejerciciosbucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio08 {
	/* 
	 * ENTRADA: 0   | RES. ESPERADO:  | RES. OBTENIDO: 
	 * ENTRADA: -2 1 5 7 2938 0 | RES. ESPERADO: nªintroducidos: 5 fallos:0 | RES. OBTENIDO: nªintroducidos: 5 fallos:0 
	 * ENTRADA: cuatro | RES. ESPERADO: error   | RES. OBTENIDO: error             
	 * ENTRADA: -2 1 5 -2 8 6 10 0 | RES. ESPERADO: nªintroducidos:7 fallos:1 | RES. OBTENIDO:  nªintroducidos:7 fallos:1 
	 */
	public static void main(String[] args) {
		// Creamos una variable para contar los números introducidos y de estos, los fallados
		int introducidos=1, fallados=0;
		
		//Creamos una variable para los dos números con los que estaremos trabajando
		int num1=0, num2=0;
		
		//Creamos la variable escaner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos el primer número
		System.out.print("Dame un número: ");
		num1=sc.nextInt();
		
		//Comprobamos que el número este en el rango correcto
		do {
			// Comprobamos que no nos han introducido otro tipo de caracter
			try {
				//Pedimos el nuevo numero
				System.out.print("Dame otro número: ");
				num2=sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("El tipo de dato introducido no es correcto");
				sc.nextLine();
			}
			
			//Comprobamos que el 2º número introducido es mayor que el primero
			if (num1<num2) {
				//Metemos el número 2 en la variable del número 1 y sumamos un número introducido
				num1=num2;
				introducidos++;
			// Si no es mayor
			} else if (num1>=num2&&num2!=0) {
				//Salta fallo
				System.out.println("Fallo, recuerda que los números deben ser mayores");
				//sumamos un número introducido
				introducidos++;
				//sumamos un fallo
				fallados++;
			}
			
		} while (num2!=0);

		//Mostramos el nº de números introducidos y de fallos
		System.out.println("Has introducido " + introducidos + " números y has tenido " + fallados + " fallos");
		
		sc.close();
	}

}
