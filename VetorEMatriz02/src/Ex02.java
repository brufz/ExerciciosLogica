
import java.util.Scanner;
public class Ex02 {

	public static void main(String[] args) {
		/* Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
		que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
		imprima a média aritmética dos lançamentos, contabilize e apresente também
		quantas foram as ocorrências da maior pontuação. */
		
		Scanner leitor = new Scanner (System.in);
		
		float dados[] = new float[10];
		float soma = 0;
		float media;
		int i = 0;
		int maiorNumero = 0;
		int qtdPontuacao = 0;
		int contador = 0;
		
		for (; i < 10; i++) {
			System.out.println("Escreva o " + (i + 1) + "° valor");
			dados[i] = leitor.nextFloat();
			
			soma = soma + dados[i];
			
			if(dados[i] > maiorNumero) {
				dados[i] = maiorNumero;
				qtdPontuacao = 0;
			}
			
			if (dados[i] == maiorNumero) {
				qtdPontuacao = qtdPontuacao + 1;
			}
			
		}
			
		
		media = (soma / i);
		System.out.println("A média das jogadas foi: " + media);
		System.out.println("A quantidade de vezes que o dado atingiu a maior pontuação foi: " + qtdPontuacao);
	}

}
