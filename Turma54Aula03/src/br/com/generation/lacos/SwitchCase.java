package br.com.generation.lacos;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Escreva uma letra: ");
		char letra = leitor.next().charAt(0);

		switch (letra) {
		case 'a', 'A':
			System.out.println("Annie");
			break;
		case 'b', 'B':
			System.out.println("Bruna");
			break;
		default:
			System.out.println("Inválido");
			break;
		}

	}

}
