package br.com.generation.lacos;

import java.util.Locale;
import java.util.Scanner;

public class LacoRepeticao01 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Locale.setDefault(new Locale("en", "US"));

		double nota1, nota2, nota3, media;

		System.out.println("Digite a primeira nota");
		nota1 = leitor.nextDouble();

		System.out.println("Digite a segunda nota");
		nota2 = leitor.nextDouble();

		System.out.println("Digite a terceira nota");
		nota3 = leitor.nextDouble();

		media = (nota1 + nota2 + nota3) / 3;

		if (media <= 6.0) {
			System.out.println("reprovado");
		} else {
			System.out.println("aprovado");
		}
	}

}
