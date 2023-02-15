package com.samuel.praticaArrays.ArraySimples.Exercicios;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] a = new int[10];
		int[] b = new int[a.length];
		
		
		for(int i = 0; i < a.length; i++) {
			System.out.println("Digite um valor: ");
			a[i] = scan.nextInt();
			b[i] = a[i] * i;
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

	}

}
