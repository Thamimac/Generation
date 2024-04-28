package lacosderepeticao;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		
		int numeros, soma = 0;
		Scanner leia = new Scanner (System.in);
		
		do {
			System.out.println("-----1 - Digite qualquer número: (digite 0 para terminar!) -------");
			numeros = leia.nextInt();
			if (numeros >0) {
			soma += numeros;
			}
		} while (numeros != 0);
		
		System.out.println("A soma dos números positivos é: " + soma);
			
		
	
}
}
