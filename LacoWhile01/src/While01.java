
import java.util.Scanner;
public class While01 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		
		float valorNumerico = 0.0f;
		float soma = 0.0f;
		float media;
		int i = 0;
		
		
		while (valorNumerico >= 0.0f) {
			System.out.println("Digite o valor num�rico desejado: ");
			valorNumerico = leitor.nextFloat();
			
			soma = soma + valorNumerico; 
			i = i + 1;
		}
			media = soma / i;
			
			System.out.println("O valor total do somat�rio �: " + soma);
			System.out.println("A m�dia dos valores �: " + media);
			System.out.println("O n�mero total de valores lidos �: " + i);
	}

}
