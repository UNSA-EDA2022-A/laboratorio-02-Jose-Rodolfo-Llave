package com.example.project;

import java.util.Scanner;

public class Exercise2 {

	public static void main(final String[] args) {

		Exercise2 obj = new Exercise2();
		Scanner sc = new Scanner(System.in);
		while (true) {

			int n = sc.nextInt(), suma;
			int a[] = new int[n];

			for (int i = 0; i < n; i++) {
				n = sc.nextInt();
				a[i] = n;
			}

			suma = sc.nextInt();

			System.out.println(obj.esSubconjuntoSumaExt(a, suma));
		}
	}

	public boolean esSubconjuntoSumaExt(int a[], int suma) {
		return esSubconjuntoSumaExt2(a, a.length - 1,suma);
	}
	
	public boolean esSubconjuntoSumaExt2(int a[],int tamaño, int suma) {
		
		// Casos base
		if (suma == 0)
		return true;
		if (tamaño == 0)
		return false;
		/* verificamos si conseguimos la suma por alguna de las siguientes formas:
		(a) incluyendo el primer elemento
		(b) excluyendo el primer elemento */

		return esSubconjuntoSumaExt2(a, tamaño -1, suma - a[tamaño])
		|| esSubconjuntoSumaExt2(a, tamaño - 1, suma );
	}
}
