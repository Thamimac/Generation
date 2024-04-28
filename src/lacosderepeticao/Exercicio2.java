package lacosderepeticao;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		
		int numeros, pares = 0, impares = 0;
		Scanner leia = new Scanner (System.in);
	
		for (int contador = 0; contador <10; contador++) {
			System.out.println("Olá, por favor, digite um número inteiro: ");
			numeros = leia.nextInt();
				if (numeros % 2 == 0) {
					pares++;
				} else {
					impares++;
				}
		}
		
		System.out.println("O total de números pares é: " + pares);
		System.out.println("O total de números ímpares é: " + impares);

	}
}
