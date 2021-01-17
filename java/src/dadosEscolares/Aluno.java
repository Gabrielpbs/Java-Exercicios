package dadosEscolares;

public class Aluno extends Pessoa{
	
	//Atributos
	private String materiasCadastradas, matriculaAluno;
	
	//Método para exibir os dados do aluno digitados.
	public void exibirDadosAluno() {
		System.out.println("Nome do aluno: " + this.nome);
		System.out.println("Função: " + this.funcao);
		System.out.println("Endereço do aluno: " + this.endereco);
		System.out.println("Matricula do aluno: " + this.matriculaAluno);
		System.out.println("Matérias cadastradas para cursar: " + this.materiasCadastradas);
	}
	
	//Getters e Setters
	
	public String GetMateriasCadastradas() {
		return materiasCadastradas;
	}
	
	public void SetMateriasCadastradas(String materiasCadastradas) {
		this.materiasCadastradas = materiasCadastradas;
	}
	
	public String GetMatriculaAluno() {
		return matriculaAluno;
	}
	
	public void SetMatriculaAluno(String matriculaAluno) {
		this.matriculaAluno = matriculaAluno;
	}
	
}
