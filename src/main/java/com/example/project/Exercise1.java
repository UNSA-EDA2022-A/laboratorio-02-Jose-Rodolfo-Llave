package com.example.project;

import java.util.Scanner;

public class Exercise1 {

	public static void main(final String[] args) {

		Exercise1 obj = new Exercise1();
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			System.out.println(obj.esCuadradoPerfecto(n));
			contador = 0;
		}
	}

	public boolean esCuadradoPerfecto(int numero) {
		
		//Se obtiene la raiz cuadrada del numero y lo almaceno en un tipo de dato double.
		double num = Math.sqrt(numero);
		//Se veririfica no sea un numero decimal
		//Establezco una condición, en donde si la raiz modulo 1 es 0, quiere decir que es entero.
		if(num % 1 == 0) {
			//Aumento el contador en 1
			contador++;
			//Convierto el numero que antes era un tipo de dato double, a un tipo de dato Integer
			numero = (int)num;
			//Invoco nuevamente al método
			esCuadradoPerfecto(numero);
		//El metodo seguira llamandose a si mismo hasta que la raiz modulo 1 sea diferente de 0, es decir decimal y el contador sea igual a 0
		} else if((num % 1 != 0) && contador == 0) {
			return false;
		}	
		return true;
	}
	static int contador = 0;
		
}
