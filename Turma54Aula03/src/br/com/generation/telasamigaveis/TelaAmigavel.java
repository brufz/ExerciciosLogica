package br.com.generation.telasamigaveis;

import javax.swing.JOptionPane;

public class TelaAmigavel {

	public static void main(String[] args) {
		int numero;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero inteiro"));
		
		if (numero % 4 == 0 && numero % 5 == 0) {
			JOptionPane.showMessageDialog(null, "O n�mero " + numero + " � divis�vel por 4 e 5");
		} else {
			JOptionPane.showMessageDialog(null, "O n�mero " + numero + " n�o � divis�vel por 4 e 5");
		}
		// null � por n�o ter um software atr�s, est� vindo dieto do eclipse.
		
	}

}
