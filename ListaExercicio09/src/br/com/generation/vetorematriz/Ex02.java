package br.com.generation.vetorematriz;

import java.util.Arrays;
import java.util.Random;

public class Ex02 {

	public static void main(String[] args) {
		/*
		 * Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um
		 * programa que gere os lançmentos, escreva esse vetor. A seguir determine a
		 * média dos lançamentos, contabilize e apresente tambem quantas foram as
		 * ocorrencias da maior pontuação
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

		System.out.println("=========LANÇAMENTOS=========");
		for (i = 0; i < 10; i++) {
			System.out.println(dado[i]);
		}
		// Arrays.stream(dado).forEach(System.out::println);

		System.out.println("============================");
		media = soma / i;
		System.out.println("A média do número de lançamentos de dado é: " + media);
		System.out.println("O maior número lançado foi " + maiorNumero + ". Foi lançado " + contador + " vezes");

	}

}
