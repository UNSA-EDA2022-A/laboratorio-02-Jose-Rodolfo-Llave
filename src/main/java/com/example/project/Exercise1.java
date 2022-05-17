package com.example.project;

import java.util.Scanner;

public class Exercise1 {

	public static void main(final String[] args) {

		Exercise1 obj = new Exercise1();
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			System.out.println(obj.esCuadradoPerfecto(n));			
		}
	}

	public boolean esCuadradoPerfecto(int numero) {
		import java.util.*;
public class prueba2 {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			System.out.println(esCuadradoPerfecto(n));			
		}
	}
	
	static boolean esCuadradoPerfecto(int numero) {
		double num = numero;
		num = Math.sqrt(num);
		if((num % 1 != 0) && contador >= 1) {
			return true;
		} else if(num % 1 == 0) {
			numero = (int)num;
			contador++;
			esCuadradoPerfecto(numero);
		}
		return false;
	}
	
	static int contador = 0;
}

	}
}
