package ejercicioscondicionales;

import java.util.Scanner;

public class Ejercicio08 {
	/*
	 * ENTRADA: km=600 días=3 | REL. ESPERADO: precio=1500€ | REL. OBTENIDO:  precio=1500€
	 * ENTRADA: km=801 días=6 | REL. ESPERADO: precio=2002,5€ | REL. OBTENIDO:  precio=2002,5€
	 * ENTRADA: km=801 días=8 | REL. ESPERADO: precio=1401,75€ | REL. OBTENIDO:  precio=1401,75€
	 * ENTRADA: km=700 días=8 | REL. ESPERADO: precio=1750,0€ | REL. OBTENIDO:  precio=1750,0€
	 */
	public static void main(String[] args) {
		// Creamos una constante para el precio x km
		final float precio=2.5f, descuento=0.7f;
		
		// Creamos la variable para los km y los dias de estancia
		int km, dias;
		
		//Creamos una variable para el precio final
		float precioFinal;
		
		//Creamos el escaner 
		Scanner sc = new Scanner(System.in);
		
		// Pedimos el nº de km
		System.out.println("Dame el nº de km hasta tu destino");
		km=sc.nextInt();
		
		// Y los días de estancia
		System.out.println("Cuanto tiempo vas a estar");
		dias=sc.nextInt();
		
		//Calculamos el precio sin descuento
		precioFinal=precio*km;
		
		// Vemos si supera los 800km y los 7 días de estancia
		if(dias>7&&km>800) {
			precioFinal=precioFinal*descuento;
		}
		
		// Mostramos el precio final
		System.out.println("El precio final de su viaje es de " + precioFinal + "€");
		
		// Cerramos el escaner
		sc.close();
	}

}
