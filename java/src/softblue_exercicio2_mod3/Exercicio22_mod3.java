//Imprime a soma dos números de 1 a 100, pulando de dois em dois (1, 3, 5, 7, etc.).

package softblue_exercicio2_mod3;

public class Exercicio22_mod3 {
	
	public static void main(String[] args) {
		
		int numero = 1;
		int soma = 0;
		
		while((numero >= 1) && (numero <= 100)) {
			
			System.out.println(numero);
			
			numero += 2;
			
			soma = soma + numero;
			
		}
		System.out.println(soma);
	}
}
