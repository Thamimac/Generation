package lacoscondicionais;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		float A, B, C, resultado;
		
		System.out.println("Por favor, digite o primeiro número: ");
		A = leia.nextFloat();
		
		System.out.println("Por favor, digite o segundo número: ");
		B = leia.nextFloat();
		
		System.out.println("Por favor, digite o terceiro número: ");
		C = leia.nextFloat();
		
		resultado = A + B;
		
		if ( resultado > C ) {
			System.out.println("A soma de A + B é maior que C!");
		} else if (resultado == C) {
			System.out.println("A soma de A + B é igual a C!");
		}else {
			System.out.println("A soma é menor que C!");
		}
	}

}
