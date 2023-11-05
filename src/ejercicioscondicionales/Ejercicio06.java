package ejercicioscondicionales;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio06 {
	/*
	 * ENTRADA: num1=27 num2=13 suma=40 | REL. ESPERADO: correcta | REL. OBTENIDO: correcta
	 * ENTRADA: num1=27 num2=13 suma=35 | REL. ESPERADO: incorrecta | REL. OBTENIDO: incorrecta
	 */
	public static void main(String[] args) {
		// Creamos una variable para cada número aleatorio y otra para las sumas
		int num1, num2, sumaPc, suma;

		// Creamos la variable escaner
		Scanner sc = new Scanner(System.in);
		
		// Creamos la variable que para el n aleatorio
		Random r = new Random();
		
		// Creamos num aleatorio y los mostramos por pantalla
		num1 = r.nextInt(1,100);
		System.out.println("El primer número es " + num1);
		
		// Creamos otro
		num2 = r.nextInt(1,100);
		System.out.println("El segundo número es " + num2);
		
		// Los sumamos
		sumaPc=num1+num2;
		
		// Pedimos por pantalla la suma de los números y lo recogemos
		System.out.println("Dame la suma de los números");
		suma=sc.nextInt();
		
		// Comparamos
		if (suma==sumaPc) {
			System.out.println("El resultado es correcto");
		} else System.out.println("El resultado es incorrecto");
		
		// Cerramos el escaner
		sc.close();
	}

}
