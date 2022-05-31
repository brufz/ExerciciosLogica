
public class For02 {

	public static void main(String[] args) {
		// Desenvolver um sistema que efetue a soma de todos os números ímpares que são
		//múltiplos de três e que se encontram no conjunto dos números de 1 até 500.
		int somaImpares = 0;
		for (int i = 0; i <= 500; i++) {
			if (i % 2 != 0 && i % 3 == 0) {
				somaImpares = somaImpares + i;
			}
		}
		System.out.println("A soma dos números impares é: " + somaImpares);
	}

}
