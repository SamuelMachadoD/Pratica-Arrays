package com.samuel.praticaArrays.Matrizes.Exercicios;

import java.util.Random;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		int linhaMaior = 0;
		int colunaMaior = 0;
		int maior = 0;
		
		int[][] matriz = new int[4][4];
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = random.nextInt(10);
				System.out.print(matriz[i][j] + " ");
				if(matriz[i][j] > maior) {
					colunaMaior = j+1;
					linhaMaior = i+1;
					maior = matriz[i][j];
				}
			}
			System.out.println();
		}
		
		System.out.println("O maior numero é : " + maior);
		System.out.println("Coluna: " + colunaMaior + " Linha: " + linhaMaior);

	}

}
