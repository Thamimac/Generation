package lacoscondicionais;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner (System.in);
		
		float numero;
		
		System.out.println("Por favor, digite um número: ");
		numero = leia.nextFloat();
		
		if(numero > 0 && numero %2 == 0) {
			System.out.println("O número é par e positivo :)");
		} else if (numero > 0 && numero % 2 == 1) {
			System.out.println("O número é ímpar e positivo :)");
		} else if (numero < 0 && numero % 2 == 0) {
			System.out.println("O número é par e negativo :)");
		} else {
			System.out.println("O número é ímpar e negativo :)");
		}
	}

}
