package br.com.generation.listaexercicios;

import java.util.Scanner;

public class Ex05DoWhile {

	public static void main(String[] args) {
		/*
		 * Crie um programa que leia um n�mero do teclado at� que encontre um n�mero
		 * igual a zero. No final, mostre a soma dos n�meros digitados.(DO...WHILE)
		 */

		Scanner leitor = new Scanner(System.in);
		int numero = 1, soma = 0;
		do {
			System.out.println("Digite um n�mero");
			numero = leitor.nextInt();
			soma += numero;

		} while (numero != 0);
		
		System.out.println("A soma dos n�meros digitados �: " + soma);
	}

}
