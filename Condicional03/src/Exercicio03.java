
import java.util.Scanner;
public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		
		int numero1, numero2, numero3, numero4;
		int numeroQuadrado1, numeroQuadrado2, numeroQuadrado3, numeroQuadrado4; 
		
		System.out.println("Digite o primeiro n�mero");
		numero1 = leitor.nextInt();
		
		System.out.println("Digite o segundo n�mero");
		numero2 = leitor.nextInt();
		
		System.out.println("Digite o terceiro n�mero");
		numero3 = leitor.nextInt();
		
		System.out.println("Digite o quarto n�mero");
		numero4 = leitor.nextInt();
		
		numeroQuadrado1 = numero1 * numero1;
		numeroQuadrado2 = numero2 * numero2;
		numeroQuadrado3 = numero3 * numero3;
		numeroQuadrado4 = numero4 * numero4;
		
		if (numeroQuadrado3 >= 1000) {
			System.out.println("O n�mero 3 �: " + numero3);
			System.out.println("O n�mero 3 ao quadrado �: " + numeroQuadrado3);
		} else {
			System.out.println("O n�mero 1 �: " + numero1);
			System.out.println("O n�mero 1 ao quadrado �: " + numeroQuadrado1);
			
			System.out.println("O n�mero 2 �: " + numero2);
			System.out.println("O n�mero 2 ao quadrado �: " + numeroQuadrado2);
			
			System.out.println("O n�mero 3 �: " + numero3);
			System.out.println("O n�mero 3 ao quadrado �: " + numeroQuadrado3);
			
			System.out.println("O n�mero 4 �: " + numero4);
			System.out.println("O n�mero 4 ao quadrado �: " + numeroQuadrado4);
			
		}	
		
	}

}
