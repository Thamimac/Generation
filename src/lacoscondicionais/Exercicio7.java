package lacoscondicionais;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		float numero1, numero2, resultado;
		int opcao;
		
		System.out.println("Por favor, digite o primeiro número: ");
		numero1 = leia.nextFloat();
		
		System.out.println("Por favor, digite o segundo número: ");
		numero2 = leia.nextFloat();
		
		System.out.println("Selecione uma opção: ");
		System.out.println("*** 1 - Somar os números ***");
		System.out.println("*** 2 - Subtrair os números ***");
		System.out.println("*** 3 - Multiplicar os números ***");
		System.out.println("*** 4 - Dividir o primeiro pelo segundo ***");
		
		opcao = leia.nextInt();
		
		leia.close();
		
		switch(opcao) {
			case 1:
				resultado = numero1 + numero2;
				System.out.println("O resultado da soma é: " + resultado);
				break;
			case 2:
				if (numero1 > numero2) {
					resultado = numero1 - numero2;
					System.out.println("O resultado da subtração é: " + resultado);
				} else {
					resultado = numero2 - numero1;
					System.out.println("O resultado da subtração é: " + resultado);
				} break;
			case 3:
				resultado = numero1 * numero2;
				if (resultado % 2 == 0) {
					System.out.println("O resultado da multiplicação é: " + resultado + " e é um número par");
				} else {
					System.out.println("O resultado da multiplicação é: " + resultado + " e é um número ímpar");
				}break;
			case 4:
				resultado = numero1 / numero2;
				if(resultado %2 == 0) {
					System.out.println("O resultado da divisão é: " + resultado + " e é um número par");
				} else {
					System.out.println("O resultado da divisão é: " + resultado + " e é um número ímpar");
				}break;
				
				
		} leia.close();
	}

}
