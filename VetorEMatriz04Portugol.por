programa
{
	
	funcao inicio()
	{
	/*Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
	em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
	diagonal, ou seja, diagonal principal.*/

	inteiro matriz [3][3]
	inteiro soma = 0
	inteiro somaDiagonal = 0
	 
	para (inteiro j=0; j < 3; j++){
		escreva ("linha " + (j+1))
	para (inteiro i = 0; i < 3; i++){
		escreva (" coluna " + (i+1) + "\n")
		leia(matriz[j][i])

		soma +=  matriz[j][i]
		se (i == j){
			somaDiagonal += matriz[j][i]
		}
	}
	}
	
	escreva ("A soma dos valores da matriz é: " + soma + "\n")
	escreva ("A soma dos valores da diagonal principal é: " + somaDiagonal)
	
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 604; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */