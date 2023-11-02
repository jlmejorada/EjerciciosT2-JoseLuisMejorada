package ejercicioscondicionales;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// Creamos una variable para almacenar el número entero y las dos cifras
		int num, cifra1, cifra2;
		
		//Creamos 2 variables string
		String num1, num2;
		
		//Creamos la variable escaner
		Scanner sc = new Scanner(System.in);
		
		// Pedimos y recogemos el número
		System.out.println("Dame un número entre el 1 y 99 escrito con 2 cifras. ej= 01, 22, 07");
		num=sc.nextInt();
		
		// Comprobamos que el número esté entre 1 y 99
		if (num>=1&&num<=99) {
			
			// Sacamos las dos cifras
			cifra1=num/10;
			cifra2=num%10;
			
			num1 = switch (cifra1) {
			case 1 -> "diceci" ;
			case 2 -> "veint" ;
			case 3 -> "trent" ;
			case 4 -> "cuarenti" ;
			case 5 -> "cinquenti" ;
			
			default -> 0;
			};
			
			
		} else System.out.println("El número no esta entre 1 y 99");
		
		//Cerramos la variable escaner
		sc.close();

	}

}
