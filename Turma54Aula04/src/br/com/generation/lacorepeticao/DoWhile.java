package br.com.generation.lacorepeticao;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner leitor = new Scanner(System.in);
		int contador = 0;
		int i = 0;
		do {
			contador++;
			System.out.println(contador);
			Thread.sleep(300);
		} while(contador < 5);
		
		
		System.out.println("----------------------");
		
		while (i < 5) {
			i++;
			System.out.println(i);
			Thread.sleep(300);
		}
	}

}
