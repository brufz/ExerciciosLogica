package br.com.generation.vetorematriz;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		int n1[][] = new int[2][2], n2[][] = new int[2][2], m1[][] = new int[2][2], m2[][] = new int[2][2];

		// declarando valores n1
		for (int l = 0; l < n1.length; l++) {
			for (int c = 0; c < n1.length; c++) {
				System.out.printf("Digite o número da linha " + (l + 1) + " e da coluna " + (c + 1) + "\n");
				n1[l][c] = leitor.nextInt();
			}
			System.out.println(" ");
		}

		// imprimindo valores n1
		for (int l = 0; l < n1.length; l++) {
			for (int c = 0; c < n1.length; c++) {
				System.out.printf("|" + n1[l][c] + "|");

			}
			System.out.println(" ");
		}

		// declarando valores n2
		for (int l = 0; l < n2.length; l++) {
			for (int c = 0; c < n2.length; c++) {
				System.out.printf("Digite o número da linha " + (l + 1) + " e da coluna " + (c + 1) + "\n");
				n2[l][c] = leitor.nextInt();
			}
			System.out.println(" ");
		}

		// imprimindo valores n2
		for (int l = 0; l < n2.length; l++) {
			for (int c = 0; c < n2.length; c++) {
				System.out.printf("|" + n2[l][c] + "|");

			}
			System.out.println(" ");
		}

		// gerando matriz m1
		System.out.println("=========================== matriz m1 ===========================");
		for (int l = 0; l < m1.length; l++) {
			for (int c = 0; c < m1.length; c++) {
				m1[l][c] = n1[l][c] + n2[l][c];
				System.out.printf("|" + m1[l][c] + "|");
			}
			System.out.println(" ");
		}

		System.out.println("=========================== matriz m2 ===========================");
		// gerando matriz m2
		for (int l = 0; l < m2.length; l++) {
			for (int c = 0; c < m2.length; c++) {
				m2[l][c] = n1[l][c] - n2[l][c];
				System.out.printf("|" + m2[l][c] + "|");
			}
			System.out.println(" ");
		}

	}

}
