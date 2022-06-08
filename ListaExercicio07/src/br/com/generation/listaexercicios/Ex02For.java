package br.com.generation.listaexercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ex02For {

	public static void main(String[] args) {
		// ler 10 numeros e imprimir quantos são pares e quantos são impares

		int i = 0;
		int numeros[] = new int[10];
		int pares[] = new int[numeros.length];
		int impares[] = new int[numeros.length];

		Scanner leitor = new Scanner(System.in);

		for (; i < 5; i++) {
			System.out.println("Digite um número: ");
			numeros[i] = leitor.nextInt();

			if (numeros[i] % 2 == 0) {
				pares[i] = numeros[i];
			} else {
				impares[i] = numeros[i];
			}
		}

		
		Arrays.sort(impares);
		System.out.println(Arrays.toString(impares));

		Arrays.sort(pares);
		System.out.println(Arrays.toString(pares));

	}

}
