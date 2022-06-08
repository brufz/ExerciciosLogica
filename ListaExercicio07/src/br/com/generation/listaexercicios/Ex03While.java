package br.com.generation.listaexercicios;

import java.util.Scanner;

public class Ex03While {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int idade = 0, contador1 = 0, contador2 = 0;
		while (idade != 99) {
			System.out.println("Digite a idade:");
			idade = leitor.nextInt();
			
			if (idade < 21) {
				contador1++;
			}
			
			if (idade > 50) {
				contador2++;
			}
		}
		System.out.println("O total de pessoas com menos de 21 anos é: " + contador1);
		System.out.println("O total de pessoas com mais de 50 anos é: " + contador2);

	}

}
