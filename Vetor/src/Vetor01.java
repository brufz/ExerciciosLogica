
import java.util.Scanner;

public class Vetor01 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		float valores[] = new float[5];
		float maiorValor = 0;
		
		for (int i = 0; i < 5; i++) {
		System.out.println("Escreva o valor da atividade " + (i+1));
		valores[i] = leitor.nextFloat();
		
		if (valores[i] > maiorValor) {
			maiorValor = valores[i];
		}
	}
		System.out.println("O maior valor apresentado foi: " + maiorValor);
	}

}
