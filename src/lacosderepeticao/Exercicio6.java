package lacosderepeticao;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
	
		int numeros, soma = 0, contador = 0;
		float media;
		
		Scanner leia = new Scanner (System.in);
		
	
		do {
			System.out.println("-----Digite um número inteiro (digite 0 para sair)-----");
			numeros = leia.nextInt();
			if (numeros != 0 && numeros%3 == 0) {
				soma += numeros;
				contador++;
			}	
		} while (numeros != 0);
		
		if (contador != 0) {
			media = soma / contador;
			System.out.println("A média dos números multiplos de 3 é: " + media);
		} else {
			System.out.println("Não foi digitado nenhum multiplo de 3 :(");
		}
	}		
}			
			
			
		
			
			
			
	
	


