
import java.util.Scanner;
public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		
		int numero;
		int numeroQuadrado;
		int i = 1;
		
		for (; i < 5; i++) {
			
		System.out.println("Digite um n�mero:");
		numero = leitor.nextInt();
		numeroQuadrado = numero * numero;
		
		if (i == 3 && numeroQuadrado > 1000) {
			System.out.println("O quadrado do n�mero digitado �: " + numeroQuadrado);
			System.out.println("Fim do programa.");
			break;
		} else {
			System.out.println("O n�mero digitado �: " + numero);
			System.out.println("O quadrado do n�mero digitado �: " + numeroQuadrado);
		}
		}
		
		
	}

}