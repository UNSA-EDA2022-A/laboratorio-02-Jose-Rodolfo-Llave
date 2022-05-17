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
		//Convierto el numero que antes era un tipo de dato double, a un tipo de dato Integer
		numero = (int)num;
		//Se veririfica que no sea un numero decimal
		//Establezco una condicion, si la raiz modulo 1 es 0, quiere decir que es entero y el contador es
		//mayor o igual que uno, retornara true
		if(num % 1 == 0 && contador >= 1) {
			return true;
		//El metodo seguira llamandose a si mismo hasta que la raiz modulo 1 sea diferente de 0, es decir decimal y el contador sea igual a 0
		//En ese caso retornara false
		} else if((num % 1 != 0) && contador == 0) {
			return false;
		}
		//Aumento el contador en 1
		contador++;
		return esCuadradoPerfecto(numero);
	}
	static int contador = 0;
		
}
	//MI OSBERVACION: El programa no aplica para 1 y cero, es ahi en donde tengo problemas.
