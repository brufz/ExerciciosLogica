import java.util.Scanner;

public class Condicional02 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int codigo;
		int horasTrabalhadas;
		int horasExcedentes;
		int salarioFinal;
		
		System.out.println("Digite o c?digo do funcion?rio");
		codigo = leitor.nextInt();
		System.out.println("Digite o total de horas trabalhadas");
		horasTrabalhadas = leitor.nextInt();
		
		if (horasTrabalhadas > 50) {
			horasExcedentes = (horasTrabalhadas - 50);
			
			salarioFinal = ((horasTrabalhadas - horasExcedentes) * 10) + 
					(horasExcedentes * 20);
			
			System.out.println("O sal?rio final ?: " + salarioFinal + ", sendo" +
			(horasExcedentes * 20) + " reais de horas extras");
			
		} else {
			System.out.println("O sal?rio final ?: " + (horasTrabalhadas * 10));
		}
		
		
	}

}
