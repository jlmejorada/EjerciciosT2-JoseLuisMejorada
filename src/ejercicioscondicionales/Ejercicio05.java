package ejercicioscondicionales;

import java.util.Scanner;

public class Ejercicio05 {
	/*
	 * ENTRADA: numObtenido=-2 | REL. ESPERADO: |2| | REL. OBTENIDO: |2|
	 * ENTRADA: numObtenido=2 | REL. ESPERADO: |2| | REL. OBTENIDO: |2|
	 * ENTRADA: numObtenido=0 | REL. ESPERADO: |0| | REL. OBTENIDO: |0|
	 */
	public static void main(String[] args) {
		// Creamos una variable para recoger el número
		int num;
		
		// Creamos el escaner 
		Scanner sc = new Scanner(System.in);
		
		// Pedimos un número y lo recogemos
		System.out.println("Dame un número y te doy el valor absoluto");
		num=sc.nextInt();
		
		// Creamos un ternario para ver si el número es + o - y operar en cosecuencia
		num = (num<=0)? num*-1 : num ;
		
		//Mostrar por pantalla el valor absoluto
		System.out.println("Su valor absoluto es |" + num + "|");
		
		//Cerrar el escaner
		sc.close();
	}

}
