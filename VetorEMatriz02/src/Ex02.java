
import java.util.Scanner;
public class Ex02 {

	public static void main(String[] args) {
		/* Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
		que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
		imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
		quantas foram as ocorr�ncias da maior pontua��o. */
		
		Scanner leitor = new Scanner (System.in);
		
		float dados[] = new float[10];
		float soma = 0;
		float media;
		int i = 0;
		int maiorNumero = 0;
		int qtdPontuacao = 0;
		int contador = 0;
		
		for (; i < 10; i++) {
			System.out.println("Escreva o " + (i + 1) + "� valor");
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
		System.out.println("A m�dia das jogadas foi: " + media);
		System.out.println("A quantidade de vezes que o dado atingiu a maior pontua��o foi: " + qtdPontuacao);
	}

}
