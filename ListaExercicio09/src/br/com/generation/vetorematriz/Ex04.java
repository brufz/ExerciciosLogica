package br.com.generation.vetorematriz;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		/*
		 * Crie um programa que receba valores do usu�rio para preencher uma matriz 3X3,
		 * e em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
		 * diagonal, ou seja, diagonal principal.
		 */
		Scanner leitor = new Scanner(System.in);
		int matriz[][] = new int[3][3];
		int soma = 0;
		int somaDiagonal = 0;

		// gerando a matriz
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.println("Digite o valor da linha " + (i + 1) + " e da coluna " + (j + 1) + " da matriz");
				matriz[i][j] = leitor.nextInt();

				soma += matriz[i][j];
				if (i == j) {
					somaDiagonal += matriz[i][j];
				}
			}
			System.out.println(" ");
		}

		// imprimindo a matriz
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.printf("|" + matriz[i][j] + "|");
			}
			System.out.println(" ");
		}

		System.out.println("O valor da soma dos n�meros da matriz �: " + soma);
		System.out.println("O valor da soma da diagonal principal da matriz �: " + somaDiagonal);
	}
}
