package ejercicioscondicionales;

import java.util.Scanner;

public class Ejercicio04 {
	/*
	 * ENTRADA: comidaTotal=0 comidaAnimal=3 nAnimal=4 | REL. ESPERADO: ERROR | REL. OBTENIDO: ERROR
	 * ENTRADA: comidaTotal=12 comidaAnimal=0 nAnimal=4 | REL. ESPERADO: ERROR | REL. OBTENIDO: ERROR
	 * ENTRADA: comidaTotal=12 comidaAnimal=3 nAnimal=0 | REL. ESPERADO: ERROR | REL. OBTENIDO: ERROR
	 * ENTRADA: comidaTotal=12 comidaAnimal=0 nAnimal=0 | REL. ESPERADO: HAS COMPRADO 12KG | REL. OBTENIDO: HAS COMPRADO 12KG
	 * ENTRADA: comidaTotal=12 comidaAnimal=3 nAnimal=4 | REL. ESPERADO: CANTIDAD JUSTA | REL. OBTENIDO: CANTIDAD JUSTA
	 * ENTRADA: comidaTotal=12 comidaAnimal=4 nAnimal=2 | REL. ESPERADO: SOBRA 2KG | REL. OBTENIDO: SOBRA 2KG
	 * ENTRADA: comidaTotal=12 comidaAnimal=5 nAnimal=4 | REL. ESPERADO: SOBRA 2KG | REL. OBTENIDO: FALTA 2KG
	 */
	public static void main(String[] args) {
		// Creamos una variable para almacenar el número entero y las dos cifras
		int num, cifra1, cifra2;
		
		//Creamos 2 variables string
		String num1="", num2="";
		
		//Creamos la variable escaner
		Scanner sc = new Scanner(System.in);
		
		// Pedimos y recogemos el número
		System.out.println("Dame un número entre el 1 y 99");
		num=sc.nextInt();
		
		// Comprobamos que el número esté entre 1 y 99
		if (num>=1&&num<=99) {
			
			// Sacamos las dos cifras
			cifra1=num/10;
			cifra2=num%10;
			
			// Con esto imprimimos las decenas y las escepciones de las decenas
			num1 = switch (cifra1) {
			case 0 -> "";
			case 1 -> switch (cifra2) {
							case 0 ->"diez";
							case 1 ->"once";
							case 2 ->"doce";
							case 3 ->"trece";
							case 4 ->"catorce";
							case 5 ->"quince";
							default ->"dieci";
						};
			case 2 -> switch (cifra2) {
							case 0 ->"veinte";
							default ->"veinti";
						};
			case 3 -> switch (cifra2) {
							case 0 ->"treinta";
							default ->"treinta y ";
						};
			case 4 -> switch (cifra2) {
							case 0 ->"cuarenta";
							default ->"cuarenta y ";
						}; 
			case 5 -> switch (cifra2) {
							case 0 ->"cincuenta";
							default ->"cincuenta y ";
						};  
			case 6 ->  switch (cifra2) {
							case 0 ->"sesenta";
							default ->"sesenta y ";
						};
			case 7 ->  switch (cifra2) {
							case 0 ->"setenta";
							default ->"setenta y ";
						};
			case 8 ->  switch (cifra2) {
							case 0 ->"ochenta";
							default ->"ochenta y ";
						};
			case 9 ->  switch (cifra2) {
							case 0 ->"noventa";
							default ->"noventa y ";
						};
						
			default -> "";
			};
			
			// Con esto podemos imprimir los números del 1-9
			num2 = switch (cifra2) {
			case 1 ->"uno";
			case 2 ->"dos";
			case 3 ->"tres";
			case 4 ->"cuatro";
			case 5 ->"cinco";
			case 6 ->"seis";
			case 7 ->"siete";
			case 8 ->"ocho";
			case 9 ->"nueve";
			default -> "";
			};
			
		} else System.out.println("El número no esta entre 1 y 99");
		
		// Por último imprimos ambos números
		System.out.println(num1+num2);
		
		//Cerramos la variable escaner
		sc.close();

	}

}
