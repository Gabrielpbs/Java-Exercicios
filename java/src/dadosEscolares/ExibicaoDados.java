package dadosEscolares;

import java.util.Scanner;

public class ExibicaoDados {
	
	public static void mostrarDados() {
		
		System.out.println("****** SISTEMA DE IDENTIFICAÇÃO ESCOLAR ******");
		
		//Função para captura de dados do teclado
	    Scanner LerTeclado = new Scanner(System.in);
	    
	    String nome;
		String funcao;
		String endereco;
		String matriculaAluno;
		String materiasCadastradas;
		String matriculaProfessor;
		String materiaEnsinada;
				
		System.out.println("Digita A função da pessoa (Aluno ou Professor): ");
		 funcao = LerTeclado.nextLine();
		
		if (funcao == "professor") {
			
			System.out.println("Opção escolhida: Professor");
			System.out.println("Digite o nome do professor: " );
			 nome = LerTeclado.nextLine();
			System.out.println("Digite o endereço: ");
			 endereco = LerTeclado.nextLine();
			System.out.println("Digite a matrícula do professor: ");
			 matriculaProfessor = LerTeclado.nextLine();
			System.out.println("Digite as matérias ensinada pelo professor separadas por vírgulas (ciência, matemática, etc): ");
			 materiaEnsinada = LerTeclado.nextLine();
			 
		} else if (funcao == "Aluno"){		
			System.out.println("Digite o nome do aluno: ");
			 nome = LerTeclado.nextLine();
			System.out.println("Digite o endereço: ");
			 endereco = LerTeclado.nextLine();
			System.out.println("Digite a matrícula do aluno: ");
			 matriculaAluno = LerTeclado.nextLine();
			System.out.println("Digite as materias cadastrada do aluno separadas por vírgulas (ciência, matemática, etc): ");
			 materiasCadastradas = LerTeclado.nextLine();
			
			System.out.println("Nome do Aluno: " + nome);
			System.out.println("Endereço do Aluno: " + endereco);
			System.out.println("matrícula do Aluno: " + matriculaAluno);
			System.out.println("Matérias cadastradas: " + materiasCadastradas);
		} else {
			System.out.println("Essa opção está indisponível. É apenas aceito 'Professor' ou 'Aluno'");
		}
	}
}