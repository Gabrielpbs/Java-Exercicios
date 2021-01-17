/*O algoritmo l�: 
 * 
 * - a porcentagem do IPI a ser acrescido no valor das pe�as 
 * - o c�digo da pe�a 1, valor unit�rio da pe�a 1, quantidade de pe�as 1
 * - o c�digo da pe�a 2, valor unit�rio da pe�a 2, quantidade de pe�as 2 O algoritmo deve 
 * calcular o valor total a ser pago e apresentar o resultado. 
 * 
 * F�rmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)
 */


package valorPecas;

import java.util.Scanner;
import java.text.NumberFormat; //BIBLIOTECA PARA O "NUMBERFORMAT"

public class ValorPecas {
	
	public static void main(String[] args) {
		
		double IPI = 0;
		double valorUnitarioPeca1 = 0;
		double valorUnitarioPeca2 = 0;
		double valorTotal = 0;
		String codigoPeca1;
		String codigoPeca2;
		int qtdPeca1 = 0;
		int qtdPeca2 = 0;
		
		
		Scanner LerTeclado = new Scanner(System.in);
		
		System.out.println("**SISTEMA DE CONSULTA DE PRE�OS DE PE�AS**");
		
		System.out.println("Digite o IPI a ser acrescido no valor das pe�as: ");
		IPI = LerTeclado.nextDouble();
		
		System.out.println("Digite o c�digo da pe�a 1: ");
		codigoPeca1 = LerTeclado.next();
		
		System.out.println("Digite o valor unit�rio da pe�a 1 : ");
		valorUnitarioPeca1 = LerTeclado.nextDouble();
		
			System.out.println("\n");
		
		System.out.println("Digite a quantidade de pe�as 1: ");
		qtdPeca1 = LerTeclado.nextInt();
		
			System.out.println("\n");
		
		System.out.println("Digite o c�digo da pe�as 2: ");
		codigoPeca2 = LerTeclado.next();
		
			System.out.println("\n");
		
		System.out.println("Digite o valor unit�rio da pe�a 2 : ");
		valorUnitarioPeca2 = LerTeclado.nextDouble();
		
			System.out.println("\n");
		
		System.out.println("Digite a quantidade de pe�as 2: ");
		qtdPeca2 = LerTeclado.nextInt();
		
			System.out.println("\n");
		
		valorTotal = (valorUnitarioPeca1 * qtdPeca1) + (qtdPeca1 * valorUnitarioPeca2) * (IPI/100 + 1);
		
		System.out.println("O c�digo das respectivas pe�as 1 e pe�a 2 s�o: " + codigoPeca1 + " " + codigoPeca2);
		
			System.out.println("\n");
		
		//FORMATA O VALOR PARA REAL
		String valorFormatado = NumberFormat.getCurrencyInstance().format(valorTotal);
		System.out.println("O valor total das pe�as �: " + valorFormatado);
		
			System.out.println("\n");
		
		System.out.println("** FIM DA CONSULTA DE PRE�OS **");
		
	}
}
