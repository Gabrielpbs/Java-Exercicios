//Efetua a leitura de um nome e exibe a mensagem "Olá, (nome informado)"

package leituraExibicaoNome;

import java.util.Scanner; 

public class LeituraExibicaoNome {
	
	public static void main(String[] args) {
		
		String nome = "";
		Scanner LerTeclado = new Scanner(System.in);
		
		System.out.println("Seja bem vindo!");
		System.out.println("Digite seu nome: ");
		 nome = LerTeclado.nextLine(); 
		System.out.println("Olá, " + nome);
	}
}
