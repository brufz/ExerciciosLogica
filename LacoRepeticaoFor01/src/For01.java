
import java.util.Scanner;
public class For01 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		float salario [] = new float [5];
		float maiorSalario = 0;
		float salarioTotal = 0;
		float mediaSalario;
		
		int numFilhos []= new int [5];
		int salarioMenorCem = 0;
		int filhosTotal = 0;
		int mediaFilhos;
		
		int i = 0;
		
		for (; i < 5; i++) {
			System.out.println("Qual o salario da pessoa " + (i + 1) + "?");
			salario[i] = leitor.nextFloat();
			
			System.out.println("Quantos filhos a pessoa " + (i + 1) + " tem?");
			numFilhos[i] = leitor.nextInt();
			
			if (salario[i] > 0) {
				maiorSalario = salario[i];
			}
			
			if (salario[i] <= 100.0f) {
				salarioMenorCem = salarioMenorCem + 1;
			}
			
			salarioTotal = salarioTotal + salario[i];
			
			filhosTotal = filhosTotal + numFilhos[i];
		}
		
		mediaSalario = salarioTotal / i;
		mediaFilhos = filhosTotal / i;
		
		System.out.println("O maior sal�rio �: " + maiorSalario);
		System.out.println("O n�mero de pessoas com sal�rio at� cem reais �: " + salarioMenorCem);
		System.out.println("O m�dia do n�mero de filhos �: " + mediaFilhos);
		System.out.println("A m�dia salarial �: " + mediaSalario);
	}

}
