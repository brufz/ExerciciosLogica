package br.com.generation.lacos;

import javax.swing.JOptionPane;

public class Ex04 {

	public static void main(String[] args) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero inteiro"));
		
		if (numero % 2 == 0) {
			JOptionPane.showMessageDialog(null, "A raiz quadrada �: " + Math.sqrt(numero));
		} else {
			JOptionPane.showMessageDialog(null, "O n�mero elevado ao quadrado �: " + Math.pow(numero, 2));
		}
	}
}
