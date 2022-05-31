
public class DoWhile01 {

	public static void main(String[] args) {
		//Faça um programa que mostre uma contagem na tela de 233 a 456, só que
		//contando de 3 em 3 quando estiver entre 300 e 400 e de 5 em 5 quando não estiver.

		int i = 233;
		System.out.println(i);
		do {
			if (i >= 300 && i <= 400) {
				i = i + 3;
			} else {
				i = i + 5;
			}
			System.out.println(i);
		} while (i <= 451);
	}

}
