package lacosderepeticao;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		
		int idade = 0;
		int menoresde21 = 0; 
		int maioresde50 = 0;
		
		Scanner leia = new Scanner (System.in);
		
		while (idade >=0) {
			System.out.println("Digite uma idade: ");
			idade = leia.nextInt();
			
			if (idade >= 0) {
				if (idade < 21) {
					menoresde21++;
				} else if (idade > 50) {
					maioresde50++;
				}
			}
			
		}
		System.out.println("Total de pessoas menores de 21 anos: " + menoresde21);
		System.out.println("Total de pessoas maiores de 50 anos: " + maioresde50);
}
}
