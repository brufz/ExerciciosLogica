
public class For02 {

	public static void main(String[] args) {
		// Desenvolver um sistema que efetue a soma de todos os n�meros �mpares que s�o
		//m�ltiplos de tr�s e que se encontram no conjunto dos n�meros de 1 at� 500.
		int somaImpares = 0;
		for (int i = 0; i <= 500; i++) {
			if (i % 2 != 0 && i % 3 == 0) {
				somaImpares = somaImpares + i;
			}
		}
		System.out.println("A soma dos n�meros impares �: " + somaImpares);
	}

}
