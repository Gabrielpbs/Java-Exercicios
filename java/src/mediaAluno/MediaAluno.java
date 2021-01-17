// Calcula as 4 notas do aluno e exibe o total, média e o nome.

package mediaAluno;

import java.util.Scanner;

public class MediaAluno {
	
	public static void main(String[] args) {
		
		  // Declaração de variáveis
		String nomeAluno = "";
		double nota1, nota2, nota3, nota4, total, media = 0;
		
		Scanner LerTeclado = new Scanner(System.in);
		
		  // Recebe os valores de nome e notas
		System.out.println("Informe o nome do aluno: ");
		 nomeAluno = LerTeclado.nextLine();		 
		System.out.println("Informe a 1ª nota: ");
		 nota1 = LerTeclado.nextDouble();
		System.out.println("Informe a 2ª nota: ");
		 nota2 = LerTeclado.nextDouble();
		System.out.println("Informe a 3ª nota: ");
		 nota3 = LerTeclado.nextDouble();
		System.out.println("Informe a 4ª nota: ");
		 nota4 = LerTeclado.nextDouble();
		 
		total = nota1 + nota2 + nota3 + nota4;
		media = total/4;
		
		System.out.println("Nome do aluno: " + nomeAluno);
		System.out.println("Total das notas: " + total);
		System.out.println("Média final: " + media);
	}
}
