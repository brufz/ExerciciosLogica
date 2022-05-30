
import java.util.Scanner;
public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		
		int numero1, numero2, numero3, numero4;
		int numeroQuadrado1, numeroQuadrado2, numeroQuadrado3, numeroQuadrado4; 
		
		System.out.println("Digite o primeiro número");
		numero1 = leitor.nextInt();
		
		System.out.println("Digite o segundo número");
		numero2 = leitor.nextInt();
		
		System.out.println("Digite o terceiro número");
		numero3 = leitor.nextInt();
		
		System.out.println("Digite o quarto número");
		numero4 = leitor.nextInt();
		
		numeroQuadrado1 = numero1 * numero1;
		numeroQuadrado2 = numero2 * numero2;
		numeroQuadrado3 = numero3 * numero3;
		numeroQuadrado4 = numero4 * numero4;
		
		if (numeroQuadrado3 >= 1000) {
			System.out.println("O número 3 é: " + numero3);
			System.out.println("O número 3 ao quadrado é: " + numeroQuadrado3);
		} else {
			System.out.println("O número 1 é: " + numero1);
			System.out.println("O número 1 ao quadrado é: " + numeroQuadrado1);
			
			System.out.println("O número 2 é: " + numero2);
			System.out.println("O número 2 ao quadrado é: " + numeroQuadrado2);
			
			System.out.println("O número 3 é: " + numero3);
			System.out.println("O número 3 ao quadrado é: " + numeroQuadrado3);
			
			System.out.println("O número 4 é: " + numero4);
			System.out.println("O número 4 ao quadrado é: " + numeroQuadrado4);
			
		}	
		
	}

}
