package ejerciciosbucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio03 {

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
				System.out.println("Solo puede introducir números");
				sc.nextLine();
			}
		} while (base<0);
		
		//Creamos un bucle que salte cada linea
		for (int i=1;i<=base;i++) {
			
			if () {
				
			}
		};
		
		//Cerramos el escaner
		sc.close();
	}

}
