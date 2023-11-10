package ejerciciosbucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio07 {
	/* 
	 * ENTRADA: 0   | RES. ESPERADO:  | RES. OBTENIDO: 
	 * ENTRADA: -8  | RES. ESPERADO: error | RES. OBTENIDO: error
	 * ENTRADA: tres | RES. ESPERADO: error   | RES. OBTENIDO: error             
	 * ENTRADA: 4   | RES. ESPERADO:  1       | RES. OBTENIDO: 1
	 *                                121                      121
	 *                                12321                    12321
	 *                                1234321                  1234321
	 * ENTRADA: 6   | RES. ESPERADO:  1           | RES. OBTENIDO: 1
	 *                                121                          121
	 *                                12321                        12321
	 *                                1234321                      1234321
	 *                                123454321                    123454321
	 *                                12345654321                  12345654321
	 */
	public static void main(String[] args) {
		// Creamos una variable para el número de la base de la piramide y un contador
		int base=-1;
		
		//Creamos el escaner
		Scanner sc = new Scanner(System.in);
		
		//Comprobamos que el número este en el rango correcto
		do {
			// Comprobamos que no nos han introducido texto
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
			
			//Con este bucle escribe los números aumentando los 1 hasta que llega al mismo número de la linea en la que está
			for (int j=1;j<=i;j++) {
				System.out.print(j);
			}
			//Y este hace lo mismo, pero alreves del anterior, disminuyendo 1 hasta 1
			for (int j=(i-1);j>=1;j--) {
				System.out.print(j);
			}
			System.out.println();		
		};
		
		//Cerramos el escaner
		sc.close();
	}
}
