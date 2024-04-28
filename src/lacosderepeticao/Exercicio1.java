package lacosderepeticao;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
	
		int numero1, numero2;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Olá, por favor, digite um número: ");
		numero1 = leia.nextInt();
		System.out.println("Agora digite um número maior que o primeiro");
		numero2 = leia.nextInt();
		
		if (numero2 < numero1) {
			System.out.println("Intevalo inválido!");
		}else {
			for ( int i = numero1; i <= numero2; i++ ) {
				if ( i % 3 ==0 && i % 5 ==0) {
					System.out.println( i + " é múltiplo de 3 e 5");
				}
				
			}
		}
}
}
