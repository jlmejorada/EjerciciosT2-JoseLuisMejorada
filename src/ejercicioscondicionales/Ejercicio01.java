package ejercicioscondicionales;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		//Creamos una variable para recoger el número
		int num;
		
		//Creamos variables para cada digito
		int dig1, dig2, dig3, dig4;
		
		//Creamos una variable boolean
		boolean capicua=true;
		
		//Creamos una variable escaner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos el número comprendido entre 0 y 9999 y lo recogemos
		System.out.println("Dame un número entre 0-9999 y te digo si es capicua");
		num=sc.nextInt();
		
		//Nos aseguramos de que el número esté en el rango
		if(num>=0&&num<=9999) {
			
			//Si es menor o igual que 9 es capicua siempre
			if (num<=9) {
				capicua=true;
				
			//Si es menor o igual que 99 
			} else if (num<=99) {
				// y su modulo de 11 es igual a 0, es capicua
				if ((num%11)==0) {
					capicua=true;
				} else capicua=false;
				
			//Si es menor o igual que 999
			} else if (num<=999) {
				dig1=num%10;
				dig3=num/100;
				// y su primer y tercer digito son iguales, es capicua
				if (dig1==dig3) {
					capicua=true;
				} else capicua=false;
				
			//Al ser un numero de 4 cifras
			} else {
				dig1=num%10;
				dig2=(num/10)%10;
				dig3=(num/100)%10;
				dig4=num/1000;
				
				// y empezando por la , su (1 y 4), y (2 y 3) son iguales, es capicua
				if (dig1==dig4&&dig2==dig3) {
					capicua=true;
				} else capicua=false;
				
			}
			
			if (capicua) {
				System.out.println(num + " es capicua");
			} else System.out.println(num + " no es capicua");
			
			
		} else System.out.println("El número introducido no es correcto");
		
		// Cerramos el escaner
		sc.close();

	}

}
