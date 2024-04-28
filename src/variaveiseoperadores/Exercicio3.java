package variaveiseoperadores;

import java.util.Scanner;

public class Exercicio3 {
		public static void main(String[] args) {
			
		float salariob, adicional, extras, descontos, salariol;
		Scanner leia = new Scanner (System.in);
			
		System.out.println("Seja Bem Vindo(a)!");	
		System.out.println("Digite o saário bruto: ");
		salariob = leia.nextFloat();
		System.out.println("Digite o adicional noturno: ");
		adicional = leia.nextFloat();
		System.out.println("Digite o valor de horas extras: ");
		extras = leia.nextFloat();
		System.out.println("Digite o valor dos descontos: ");
		descontos = leia.nextFloat();
		
		salariol = salariob + adicional + (extras * 5) - descontos;
		
		System.out.println("O valor do salário líquido é: R$" + salariol);
}
}
