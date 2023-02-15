package com.samuel.praticaArrays.ArraySimples.Exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###,###.##");
		
		int[] a = new int[15];
		double[] b = new double[a.length];
		
		
		for(int i = 0; i < a.length; i++) {
			System.out.println("Digite um valor: ");
			a[i] = scan.nextInt();
			b[i] = Math.sqrt(a[i]);
		}
		
		System.out.println("A: ");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println("B: ");
		for(int i = 0; i < b.length; i++) {
			System.out.print(df.format(b[i]) + " ");
		}

	}

}
