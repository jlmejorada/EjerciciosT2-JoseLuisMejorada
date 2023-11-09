package ejerciciosbucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio03 {
	/* 
	 * ENTRADA: 0   | RES. ESPERADO: error | RES. OBTENIDO: error
	 * ENTRADA: -8  | RES. ESPERADO: error | RES. OBTENIDO: error
	 * ENTRADA: tres | RES. ESPERADO: rrror | RES. OBTENIDO: error             
	 * ENTRADA: 4   | RES. ESPERADO:  *   | RES. OBTENIDO: *
	 *                               * *                  * *
	 *                              * * *                * * *
	 *                             * * * *              * * * *
	 * ENTRADA: 5   | RES. ESPERADO:  *   | RES. OBTENIDO: *
	 *                               * *                  * *
	 *                              * * *                * * *
	 *                             * * * *              * * * *
	 *                            * * * * *            * * * * *
	 */
	public static void main(String[] args) {
		// Creamos una variable para el número de la base de la piramide y otra para los espacios
		int base=-1;
		
		//Creamos el escaner
		Scanner sc = new Scanner(System.in);
		
		//Comprobamos que el número este en el rango correcto
		do {
			// Comprobamos que no nos han introducido texto
			try {
				//Pedimos el número de la base del triangulo
				System.out.println("Dame el número de * que tendra la base del triangulo (tiene que ser positivo)");
				base=sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("El tipo de dato introducido no es correcto");
				sc.nextLine();
			}
		} while (base<0);
		
		//Creamos un bucle que salte cada linea
		for (int i=1;i<=base;i++) {
			for (int j=1;j<=(base-i);j++) {
				System.out.print(" ");
			}
			
			for (int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			
			System.out.println();		
		};
		
		//Cerramos el escaner
		sc.close();
	}

}
