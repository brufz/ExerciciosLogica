package br.com.generation.lacos;

import javax.swing.JOptionPane;

public class Ex01 {

	public static void main(String[] args) {

		float num;
		float maiorNumero = 0;

		for (int i = 0; i < 3; i++) {
			num = Float.parseFloat(JOptionPane.showInputDialog("Digite o número " + (i + 1)));

			if (num > maiorNumero) {
				maiorNumero = num;
			}
		}
		
		JOptionPane.showMessageDialog(null, "O maior número apresentado foi " + maiorNumero);

	}

}
