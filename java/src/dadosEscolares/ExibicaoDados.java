package dadosEscolares;

import java.util.Scanner;

public class ExibicaoDados {
	
	public static void mostrarDados() {
		
		System.out.println("****** SISTEMA DE IDENTIFICA��O ESCOLAR ******");
		
		//Fun��o para captura de dados do teclado
	    Scanner LerTeclado = new Scanner(System.in);
	    
	    String nome;
		String funcao;
		String endereco;
		String matriculaAluno;
		String materiasCadastradas;
		String matriculaProfessor;
		String materiaEnsinada;
				
		System.out.println("Digita A fun��o da pessoa (Aluno ou Professor): ");
		 funcao = LerTeclado.nextLine();
		
		if (funcao == "professor") {
			
			System.out.println("Op��o escolhida: Professor");
			System.out.println("Digite o nome do professor: " );
			 nome = LerTeclado.nextLine();
			System.out.println("Digite o endere�o: ");
			 endereco = LerTeclado.nextLine();
			System.out.println("Digite a matr�cula do professor: ");
			 matriculaProfessor = LerTeclado.nextLine();
			System.out.println("Digite as mat�rias ensinada pelo professor separadas por v�rgulas (ci�ncia, matem�tica, etc): ");
			 materiaEnsinada = LerTeclado.nextLine();
			 
		} else if (funcao == "Aluno"){		
			System.out.println("Digite o nome do aluno: ");
			 nome = LerTeclado.nextLine();
			System.out.println("Digite o endere�o: ");
			 endereco = LerTeclado.nextLine();
			System.out.println("Digite a matr�cula do aluno: ");
			 matriculaAluno = LerTeclado.nextLine();
			System.out.println("Digite as materias cadastrada do aluno separadas por v�rgulas (ci�ncia, matem�tica, etc): ");
			 materiasCadastradas = LerTeclado.nextLine();
			
			System.out.println("Nome do Aluno: " + nome);
			System.out.println("Endere�o do Aluno: " + endereco);
			System.out.println("matr�cula do Aluno: " + matriculaAluno);
			System.out.println("Mat�rias cadastradas: " + materiasCadastradas);
		} else {
			System.out.println("Essa op��o est� indispon�vel. � apenas aceito 'Professor' ou 'Aluno'");
		}
	}
}