
/* Troca os valores que est�o armazenados nas vari�veis nome1 e nome2. A vari�vel nome1 armazenara o valor �mestre do universo�. 
 * A vari�vel nome2 receber� um valor informado pelo usu�rio. 
 * Altera os valores das vari�veis e exibe a soma da vari�vel nome1 com o valor da vari�vel nome2. */

package trocaDeValores;

import java.util.Scanner;

public class TrocaDeValores {

	public static void main(String[] args) {
		
		String nome1 = "Mestre do Universo";
		String nome2 = "";
		String aux = "";
		
		Scanner LerTeclado = new Scanner(System.in);
		
		System.out.println("Digite um nome: ");
		nome2 = LerTeclado.nextLine();
		
		aux = nome1;
		nome1 = nome2;
		nome2 = aux;
		
		System.out.println(nome1 + nome2);
	}
}
