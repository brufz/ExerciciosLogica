package br.com.generation.vetorematriz;

import java.util.Arrays;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// faça um programa que crie um vetor por leitura com 5 valores de pontuação
		// de uma atividade e o escreva em seguida.
		// Encontre após a maior pontuação e apresente.
		
		Scanner leitor = new Scanner (System.in);
		double [] vetor = new double [5];
		double maiorNumero = 0;
		int i = 0;
		for (; i < vetor.length; i++) {
			System.out.println("Digite o valor da atividade " + i);
			vetor[i]=leitor.nextDouble();
			
			if (vetor[i] > 0) {
				maiorNumero = vetor[i];
			}
			
		}
		
		System.out.println("O maior valor apresentado foi: " + maiorNumero);
		Arrays.stream(vetor).forEach(System.out::println);
	}

}
