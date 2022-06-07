package br.com.generation.lacos;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Ex02 {

	public static void main(String[] args) {
		// Faça um programa que entre com
		// três números e coloque
		// em ordem crescente.

		float[] numeros = new float[3];

		for (int i = 0; i < 3; i++) {
			numeros[i] = Float.parseFloat(JOptionPane.showInputDialog("Digite o número " + (i + 1)));
		}
		
		Arrays.sort(numeros);
		System.out.println(Arrays.toString(numeros));

	}

}
