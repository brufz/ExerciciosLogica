package br.com.generation.listaexercicios;

import java.util.Scanner;

public class Ex04While {

	public static void main(String[] args) {
		/*
		 * Uma empresa desenvolveu uma pesquisa para saber as características
		 * psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
		 * era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as
		 * opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa
		 * era agressiva).
		 *  Pede-se para elaborar um sistema que permita ler os dados de
		 * 150 pessoas, calcule e mostre: (WHILE)  
		 * o número de pessoas calmas;  
		 * número de mulheres nervosas;  ok
		 * o número de homens agressivos; 
		 * número de outros calmos; ok
		 *   o número de pessoas nervosas com mais de 40 anos; ok
		 *  o número de pessoas calmas com menos de 18 anos. ok
		 */

		Scanner leitor = new Scanner(System.in);

		int i = 0, idade = 0;
		int sexo = 0;
		int feminino, masculino, outros;
		int caracteristicasPsicologicas = 0;
		int calmo, nervoso, agressivo;
		int contadorCalmo = 0, contadorNervoso = 0, contadorAgressivo = 0;
		int pessoasCalmas = 0, outrosCalmos = 0, mulheresNervosas = 0, homensAgressivos = 0, 
				nervosasMais40 = 0, calmasMenos18 = 0;

		while (i < 3) {
			System.out.println("Digite a idade: ");
			idade = leitor.nextInt();

			System.out.println("Qual o sexo? \n Digite 1 - Feminino \n  2 - Masculino \n  3 - outros");
			sexo = leitor.nextInt();

			System.out.println(
					"Qual a característica psicológica? \n" + " Digite 1 - Calmo \n 2 - Nervosa \n 3 - Agressivo");
			caracteristicasPsicologicas = leitor.nextInt();
			
			if (caracteristicasPsicologicas == 1) {
				pessoasCalmas++;
			}

			if (sexo == 3 && caracteristicasPsicologicas == 1) {
				outrosCalmos++;
			}
			
			if (sexo == 1 && caracteristicasPsicologicas == 2 ) {
				mulheresNervosas++;
			}
			
			if (sexo == 2 && caracteristicasPsicologicas == 3) {
				homensAgressivos++;
			}

			if (idade > 40 && caracteristicasPsicologicas == 2) {
				nervosasMais40++;
			}

			if (idade < 18 && caracteristicasPsicologicas == 1) {
				calmasMenos18++;
			}
			
			i++;
		}
		
		System.out.println("Pessoas calmas: " + pessoasCalmas);
		System.out.println("Pessoas com sexo outros que são calmas: " + outrosCalmos);
		System.out.println("Mulheres nervosas: " + mulheresNervosas);
		System.out.println("Homens agressivos: " + homensAgressivos);
		System.out.println("Pessoas nervosas com mais de 40 anos: " + nervosasMais40);
		System.out.println("Pessoas calmas com menos de 18 anos: " + calmasMenos18);
	}

}
