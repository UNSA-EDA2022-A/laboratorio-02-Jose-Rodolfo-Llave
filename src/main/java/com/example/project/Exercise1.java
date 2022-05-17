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
		double num = Math.sqrt(numero);
		
		if(num % 1 == 0) {
			contador++;
			numero = (int)num;
			esCuadradoPerfecto(numero);
		} else if((num % 1 != 0) && contador >= 1) {
			return false;
		}	
		return true;
	static int contador = 0;
		
}
