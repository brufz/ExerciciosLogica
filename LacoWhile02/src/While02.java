
import java.util.Scanner;
public class While02 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int numero;
		System.out.println("Digite um número");
		numero = leitor.nextInt();
		System.out.println(numero);
		
		while (numero < 100) {
			numero = numero * 3;
			System.out.println(numero);
		}
	}

}
