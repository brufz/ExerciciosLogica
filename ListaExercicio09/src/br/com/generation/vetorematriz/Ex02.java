package br.com.generation.vetorematriz;

import java.util.Arrays;
import java.util.Random;

public class Ex02 {

	public static void main(String[] args) {
		/*
		 * Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um
		 * programa que gere os lan�mentos, escreva esse vetor. A seguir determine a
		 * m�dia dos lan�amentos, contabilize e apresente tambem quantas foram as
		 * ocorrencias da maior pontua��o
		 */

		int[] dado = new int[10];
		int soma = 0, media = 0, maiorNumero = 0, contador = 0, aux = 0;
		Random gerador = new Random();

		int i = 0;
		for (; i < 10; i++) {
			dado[i] = (gerador.nextInt(6) + 1);

			soma = soma + dado[i];

			if (dado[i] > maiorNumero) {
				maiorNumero = dado[i];
				contador = 0;
			}

			if (dado[i] == maiorNumero) {
				contador++;
			}
		}

		System.out.println("=========LAN�AMENTOS=========");
		for (i = 0; i < 10; i++) {
			System.out.println(dado[i]);
		}
		// Arrays.stream(dado).forEach(System.out::println);

		System.out.println("============================");
		media = soma / i;
		System.out.println("A m�dia do n�mero de lan�amentos de dado �: " + media);
		System.out.println("O maior n�mero lan�ado foi " + maiorNumero + ". Foi lan�ado " + contador + " vezes");

	}

}
