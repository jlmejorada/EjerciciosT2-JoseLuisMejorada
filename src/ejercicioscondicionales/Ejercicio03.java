package ejercicioscondicionales;

import java.util.Scanner;

public class Ejercicio03 {
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
		// Creamos las variables correspondientes a la comida total, por animal y nº de animales
		int nAnimales=0, comidaTotal=0, comidaAnimal=0;
		
		// Creamos una variable que admita decimales para los dos calculos a realizar y otro para el resultado general
		double resTotal, res;
		
		//Creamos la variable escaner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos la cantidad de comida en Kg que se ha comprado
		System.out.println("Dame la cantidad de comida comprada en Kg");
		comidaTotal=sc.nextInt();
		
		//Pedimos la cantidad de comida en Kg que come el animal
		System.out.println("Dame la cantidad de comida que come el animal en Kg");
		comidaAnimal=sc.nextInt();
		
		//Pedimos el número estimado de ese animal
		System.out.println("Dame el número estimado de ese tipo de animal");
		nAnimales=sc.nextInt();
		
		//Comprobamos que la cantidad de comida total introducida no haya sido 0 para que no de fallo al dividir entre 0
		if (comidaTotal==0) {
			 System.out.println("La cantidad de comida comprada no puede ser 0");
			
		//Comprobamos que el número de comida que come el animal no es 0	 
		} else if (comidaAnimal==0){
			//Hacemos que no pase nada si el número de animales es 0 y a la vez el numero de kg que comen
			if (nAnimales==00){
				System.out.println("Has comprado " + comidaTotal + "Kg");	
			} else System.out.println("La cantidad de comida comprada no puede ser 0");	
		//Comprobamos que el número de animales no es 0	 
		} else if (nAnimales==0){
			System.out.println("0 animales no pueden comer " + comidaAnimal + "Kg de comida");
		} else {
			// Calculamos el número de kg por animal disponible
			resTotal=(double) comidaTotal/nAnimales;
						
			// Vemos si existe la cantidad de comida necesaria por animal
			// si se necesita comprar más comida
			if (resTotal<comidaAnimal) {
				res = comidaAnimal-resTotal;
				System.out.println("No es suficiente, falta " + res +"Kg");
			// si sobra
			} else if(resTotal>comidaAnimal) {
				res = resTotal-comidaAnimal;
				System.out.println("Es suficiente y sobra " + res + "Kg");
			// o si es suficiente
			} else System.out.println("Existe la cantidad justa de comida por animal");
		}
		
		//Cerramos la variable escaner
		sc.close();

	}

}
