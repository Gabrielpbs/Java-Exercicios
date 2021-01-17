//Informar um saldo e imprimir o saldo com reajuste de 1%.

package saldoReajuste;

import java.util.Scanner;

public class SaldoReajuste {
	
	public static void main(String[] arg) {
		
		Scanner LerTeclado = new Scanner(System.in);
		
		double saldo = 0;
		double reajuste = 0.01;
		double novoValor = 0;
		
		System.out.println("Digite o saldo: ");
		saldo = LerTeclado.nextDouble();
		
		novoValor = (0.01 * saldo) + saldo;
		
		System.out.println("O novo saldo com o rejuste de 1% é: " + novoValor);
	}
}
