package dadosEscolares;

public class Professor extends Pessoa{
	
	//Atributos
	private String matriculaProfessor, materiaEnsinada;

	
	//M�todo para exibir os dados do aluno digitados.
	public void exibirDadosProfessor() {
		System.out.println("Nome do professor: " + this.nome);
        System.out.println("Fun��o: " + this.funcao);
        System.out.println("Endere�o do professor: " + this.endereco);
        System.out.println("Matricula do professor: " + this.matriculaProfessor);
        System.out.println("Materias ensinadas pelo professor: " + this.materiaEnsinada);
	}
	
	//Getters e Setters
	public String GetMatriculaProfessor() {
		return matriculaProfessor;
	}
	
	public void SetMatriculaProfessor(String matriculaProfessor) {
		this.matriculaProfessor = matriculaProfessor;
	}
	
	public String GetMateriaEnsinada() {
		return materiaEnsinada;
	}
	
	public void SetMateriaEnsinada(String materiaEnsinada) {
		this.materiaEnsinada = materiaEnsinada;
	}
}
