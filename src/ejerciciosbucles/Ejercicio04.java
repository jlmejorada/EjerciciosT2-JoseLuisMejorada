package ejerciciosbucles;

import java.util.InputMismatchException;
import java.util.Scanner; 

public class Ejercicio04 {

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
		
		//Vemos que número es el menor
		if (num1<num2) {
			nummax=num1;
		} else nummax=num2;
		
		// Se realiza el bucle hasta que se encuentra el M.C.D. de ambos números
		while(num1%nummax!=0||num2%nummax!=0){
			nummax--;
		} 
		System.out.println("El máximo comun divisor es " + nummax);
		
		//Cerramos el escaner
		sc.close();

	}

}
