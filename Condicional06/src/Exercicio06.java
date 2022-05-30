
import java.util.Scanner;
public class Exercicio06 {

	public static void main(String[] args) {
		
		int idadeNadador;
		System.out.println("Digite a idade do nadador");
		Scanner leitor = new Scanner (System.in);
		idadeNadador = leitor.nextInt();
		
		if((idadeNadador >= 5) &&(idadeNadador <= 7)) {
			System.out.println("Categoria A");
		} else if ((idadeNadador >= 8) && (idadeNadador <= 10)) {
			System.out.println("Categoria B");
		} else if ((idadeNadador >= 12) && (idadeNadador <= 13)) {
			System.out.println("Categoria C");
		} else if ((idadeNadador >= 14) && (idadeNadador <= 17)) {
			System.out.println("Categoria D");
		} else if (idadeNadador >= 18)
			System.out.println("Categoria E");
		}
	}


