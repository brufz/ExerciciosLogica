package br.com.generation.listaexercicios;

import java.util.Scanner;

public class Ex06DoWhile {

	public static void main(String[] args) {
		/*
		 * Escrever um programa que receba vários números inteiros no teclado. E no
		 * final imprimir a média dos números múltiplos de 3. Para sair digitar
		 * 0(zero).(DO...WHILE)
		 */
		Scanner leitor = new Scanner(System.in);
		int numero = 1, contador = 0, soma = 0, media;

		do {
			System.out.println("Digite um número");
			numero = leitor.nextInt();

			soma += numero;
			contador++;

		} while (numero != 0);

		media = soma / (contador - 1);
		System.out.println("A média dos números digitados é: " + media);
		
	}
}
