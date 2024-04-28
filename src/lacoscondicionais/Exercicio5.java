package lacoscondicionais;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
	
		Scanner leia = new Scanner (System.in);
		
		float numero1, numero2, numero3, numero4, numero5, numero6, preco;
		int quantidade, opcao;
		
		numero1 = 10.00f;
		numero2 = 15.00f;
		numero3 = 18.00f;
		numero4 = 12.00f;
		numero5 = 8.00f;
		numero6 = 13.00f;
		
		System.out.println("Escolha uma opção: ");
		System.out.println("1 - Cachorro Quente");
		System.out.println("2 - X-Salada");
		System.out.println("3 - X-Bacon");
		System.out.println("4 - Bauru");
		System.out.println("5- Refrigerante");
		System.out.println("6 - Suco de Laranja");
		
		opcao = leia.nextInt();
		
		System.out.println("Por favor, digite a quantidade: ");
		quantidade = leia.nextInt();
		
		switch(opcao) {
			case 1:
				preco = numero1 * quantidade;
				System.out.println("Total do pedido: R$ " + preco);
				break;
			case 2: 
				preco = numero2 * quantidade;
				System.out.println("Total do pedido: R$ " + preco);
				break;
			case 3:
				preco = numero3 * quantidade;
				System.out.println("Total do pedido: R$ " + preco);
				break;
			case 4:
				preco = numero4 * quantidade;
				System.out.println("Total do pedido: R$ " + preco);
				break;
			case 5:
				preco = numero5 * quantidade;
				System.out.println("Total do pedido: R$ " + preco);
				break;
			case 6:
				preco = numero6 * quantidade;
				System.out.println("Total do pedido: R$ " + preco);
				break;
		}
				leia.close();
}
}
