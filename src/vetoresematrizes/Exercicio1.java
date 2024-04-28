package vetoresematrizes;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int vetor [] = {5, 10, 12, 3, 7, 24, 19, 33, 50, 1};
		int numero, posicao = 0;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite um número inteiro: ");
		numero = leia.nextInt();
		
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == numero) {
				posicao = i;
				break;
			} 
		}
			
			if (posicao != 0) {
				System.out.println("O número " + numero + " está na posição " + posicao);
			}
			else {
				System.out.println("O número " + numero + " não foi encontado.");
			}
	}
}
