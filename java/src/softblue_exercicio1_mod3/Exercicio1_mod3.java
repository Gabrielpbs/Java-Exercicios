//Calcula a média de 3 notas com seus respectivos pesos

package softblue_exercicio1_mod3;

public class Exercicio1_mod3 {
	
	public static void main(String[] args) {
		
		double nota1 = 8.5;
		double nota2 = 7.5;
		double nota3 = 6.9;
		double media;
		
		double pesoNota1 = nota1 * 3; // Peso 3
		double pesoNota2 = nota2 * 2; // Peso 2
		double pesoNota3 = nota3 * 5; // Peso 5
		
		media = (pesoNota1 + pesoNota2 + pesoNota3)/3; 
		
		System.out.println("A média do aluno é " + media);
	}
}
