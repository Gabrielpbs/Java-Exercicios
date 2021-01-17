//Imprime a média aritmética dos números 8,9 e 7. A média dos números 4, 5 e 6. A soma das duas médias. A média das médias

package media;

import java.util.Scanner;

public class MediaNumeros {
	
	public static void main(String[] args) {
		
		int num1 = 8;
		int num2 = 9;
		int num3 = 7;
		int num4 = 4;
		int num5 = 5;
		int num6 = 6;
		
		double media1 = 0;
		double media2 = 0;
		double MediaDasMedias = 0;
		
		media1 = 8 + 9 + 7/3;
		media2 = 4 + 5 + 6/3;
		
		MediaDasMedias = media1 + media2 / 2;
		
		System.out.println("A média dos números 8, 9 e 7 é: " + media1);
		System.out.println("A média dos números 4, 5 e 6 é: " + media2);
		System.out.println("A média total das duas médias é: " + MediaDasMedias);
		
	}

}
