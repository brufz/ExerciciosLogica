programa
{
	inclua biblioteca Matematica --> Mat
	
	funcao inicio()
	{
		inteiro n2[2][2] = {{10,20},
						{30,40}}
						
		inteiro n1[2][2] = {{50,60},
						{70,80}}
		inteiro m1[2][2]
		inteiro m2[2][2]
		
		para (inteiro i=0;i < 2; i++){
			para (inteiro j=0; j<2; j++){
				m1[i][j] = n1[i][j]+n2[i][j]
				m2[i][j] = n1[i][j]-n2[i][j]
			}
		}
	
		para (inteiro i=0;i <2;i++){
			para (inteiro j=0; j <2; j++){
				escreva (m1[i][j] + "|")		
			}
			escreva("\n")
		}

		escreva ("\n")

		para (inteiro i=0; i <2; i++){
			para (inteiro j=0; j<2;j++){
				escreva (m2[i][j] + "|")
			}
			escreva ("\n")
		}

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 615; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */