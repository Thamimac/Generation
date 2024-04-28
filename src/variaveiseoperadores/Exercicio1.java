package variaveiseoperadores;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		
		float salario, abono, novosalario;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Seja Bem vindo!");
		System.out.println("Digite o salário: ");
		salario = leia.nextFloat();
		
		System.out.println("Digite o abono: ");
		abono = leia.nextFloat();
		
		novosalario = salario + abono;
		
		System.out.println("O novo salário é: R$" + novosalario);
		
		
	
}
}
