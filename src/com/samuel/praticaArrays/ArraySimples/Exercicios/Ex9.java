package com.samuel.praticaArrays.ArraySimples.Exercicios;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] a = new int[10];
		int[] b = new int[a.length];
		double[] c = new double[a.length];
		
		
		for(int i = 0; i < a.length; i++) {
			System.out.println("Digite um valor: ");
			a[i] = scan.nextInt();
			b[i] = a[i] * i+1;
			c[i] = b[i] / a[i];
		}
		
		System.out.println("A: ");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println("B: ");
		for(int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println();
		System.out.println("C: ");
		for(int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}

	}

}
