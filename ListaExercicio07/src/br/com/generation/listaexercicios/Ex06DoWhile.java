package br.com.generation.listaexercicios;

import java.util.Scanner;

public class Ex06DoWhile {

	public static void main(String[] args) {
		/*
		 * Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
		 * final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
		 * 0(zero).(DO...WHILE)
		 */
		Scanner leitor = new Scanner(System.in);
		int numero = 1, contador = 0, soma = 0, media;

		do {
			System.out.println("Digite um n�mero");
			numero = leitor.nextInt();

			soma += numero;
			contador++;

		} while (numero != 0);

		media = soma / (contador - 1);
		System.out.println("A m�dia dos n�meros digitados �: " + media);
		
	}
}
