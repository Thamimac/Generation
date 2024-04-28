package vetoresematrizes;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		
		int vetor [] = new int[10];
		float soma = 0, media = 0;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite 10 números inteiros: ");
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = leia.nextInt();
		}
		System.out.println("Números ímpares digitados: ");
		for(int i = 0; i < vetor.length; i += 2) {
			System.out.println(vetor[i]);
		} 
		
		System.out.println("Núumeros pares digitados: ");
		for(int numeros : vetor) {
			if (numeros % 2 == 0) {
				System.out.println(numeros);
			}
		}
		
		for (int numeros : vetor) {
			soma += numeros;		
		}
		System.out.println("A soma dos números digitados é: " + soma);
		
		media = soma / vetor.length;
		System.out.println("A média dos números digitados é: " + media);
		
}
}
