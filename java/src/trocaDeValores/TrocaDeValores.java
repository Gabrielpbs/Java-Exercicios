
/* Troca os valores que estão armazenados nas variáveis nome1 e nome2. A variável nome1 armazenara o valor “mestre do universo”. 
 * A variável nome2 receberá um valor informado pelo usuário. 
 * Altera os valores das variáveis e exibe a soma da variável nome1 com o valor da variável nome2. */

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
