package br.com.generation.matriz01;

public class Matriz01 {

	public static void main(String[] args) {
		/*Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
		a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
		das matrizes N1 e N2;
		b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
		posição das matrizes N1 e N2. */
		
		int n1 [][] = { {1, 2, 3, 4},
						{1, 2, 3, 4},
						{1, 2, 3, 4},
						{1, 2, 3, 4}};
		
		int n2 [][] = { {1, 2, 3, 4},
						{1, 2, 3, 4},
						{1, 2, 3, 4},
						{1, 2, 3, 4}};
		
		int m1[][] = new int [4][4];
		int m2[][] = new int [4][4];
		
		for (int l = 0; l < 4; l++) {
			for (int c = 0; c < 4; c++) {
				m1[l][c] = n1[l][c] + n2 [l][c];
				System.out.printf("|" + m1[l][c] + "|");
			}
			System.out.println();
		}
		System.out.println("-----------------------------------");
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				m2[i][j] = n1[i][j] - n2[i][j];
				System.out.printf("|" +m2[i][j] + "|");
			}
			System.out.println();
		}
	}

}
