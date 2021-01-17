// Exibe a tabuada de um valor informado

package tabuada;

import java.util.Scanner;

public class Tabuada {
	
	public static void main(String[] args) {
		
		int n = 0;
		String valorLido = "";
		
		Scanner LerTeclado = new Scanner(System.in);
		
		System.out.println("Exibe a tabuada de um número");
		System.out.println("Bem vindo a Tabuada!");
		System.out.println("Digite um valor: ");
		 valorLido = LerTeclado.nextLine();
		 n = Integer.parseInt(valorLido);
		
		System.out.println(n + " * 1 = " + (n*1));
		System.out.println(n + " * 2 = " + (n*2));
		System.out.println(n + " * 3 = " + (n*3));
		System.out.println(n + " * 4 = " + (n*4));
		System.out.println(n + " * 5 = " + (n*5));
		System.out.println(n + " * 6 = " + (n*6));
		System.out.println(n + " * 7 = " + (n*7));
		System.out.println(n + " * 8 = " + (n*8));
		System.out.println(n + " * 9 = " + (n*9));
		System.out.println(n + " * 10 = " + (n*10));
		
		System.out.println("Tabuada encerrada!");
	}

}
