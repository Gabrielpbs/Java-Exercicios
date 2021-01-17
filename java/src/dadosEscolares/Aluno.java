package dadosEscolares;

public class Aluno extends Pessoa{
	
	//Atributos
	private String materiasCadastradas, matriculaAluno;
	
	//M�todo para exibir os dados do aluno digitados.
	public void exibirDadosAluno() {
		System.out.println("Nome do aluno: " + this.nome);
		System.out.println("Fun��o: " + this.funcao);
		System.out.println("Endere�o do aluno: " + this.endereco);
		System.out.println("Matricula do aluno: " + this.matriculaAluno);
		System.out.println("Mat�rias cadastradas para cursar: " + this.materiasCadastradas);
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
