package ejerciciosbucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio06 {
	/* 
	 * ENTRADA: 0   | RES. ESPERADO:  | RES. OBTENIDO: 
	 * ENTRADA: -8  | RES. ESPERADO: error | RES. OBTENIDO: error
	 * ENTRADA: tres | RES. ESPERADO: error | RES. OBTENIDO: error             
	 * ENTRADA: 4   | RES. ESPERADO:  1   | RES. OBTENIDO: 1
	 *                                22                   22
	 *                                333                  333
	 *                                4444                 4444
	 * ENTRADA: 6   | RES. ESPERADO:  1   | RES. OBTENIDO: 1
	 *                                22                   22
	 *                                333                  333
	 *                                4444                 4444
	 *                                55555                55555
	 *                                666666               666666
	 */
	public static void main(String[] args) {
		// Creamos una variable para el número de la base de la piramide
		int base=-1;
		
		//Creamos el escaner
		Scanner sc = new Scanner(System.in);
		
		//Comprobamos que el número este en el rango correcto
		do {
			// Comprobamos que no nos han introducido otro tipo de caracter
			try {
				//Pedimos el número de la base del triangulo
				System.out.println("Dame el número de números que tendra la base del triangulo (tiene que estar entre 0 y 20)");
				base=sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("El tipo de dato introducido no es correcto");
				sc.nextLine();
			}
		} while (base<0||base>20);
		
		//Creamos un bucle que salte cada linea
		for (int i=1;i<=base;i++) {
			
			for (int j=1;j<=i;j++) {
				System.out.print(i);
			}
			
			System.out.println();		
		};
		
		//Cerramos el escaner
		sc.close();

	}

}
