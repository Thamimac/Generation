package estruturadedados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		int opcao;
		String nome, retirado;
		
		Queue<String> fila = new LinkedList<String>();
	
		do {
			System.out.println("Bem vindo(a) ao Banco Brasileiro");
			System.out.println();
			System.out.println("*********************************************");
			System.out.println();
			System.out.println("        1 - Adicionar Cliente na Fila        ");
			System.out.println("        2 - Listar todos os Clientes         ");
			System.out.println("        3 - Retirar Cliente da Fila          ");
			System.out.println("        0 - Sair                             ");
			System.out.println();
			System.out.println("*********************************************");
			System.out.println("Entre com a opção desejada: ");
		
			opcao = leia.nextInt();
		
		
			switch (opcao) {
			case 1:
			System.out.println("Digite um nome: ");
			nome = leia.next();
			fila.add(nome);
			System.out.println("Cliente Adicionado!");
			System.out.println(fila);
			System.out.println();
			break;
			case 2:
				if(fila.isEmpty()) {
					System.out.println("A fila está vazia!");
					System.out.println();
				} else {
					System.out.println("Clientes na fila " + fila);
					System.out.println();
				}
			break;
			case 3:
				if (fila.isEmpty()) {
					System.out.println("A fila está vazia!");
					System.out.println();
				}else {
					retirado = fila.poll();
					System.out.println("Cliente " + retirado + " retirado(a) da fila");
					System.out.println();
				}
			break;
			case 0:
				System.out.println("Programa Finalizado!");
				System.out.println();
			}
			
		} while (opcao != 0);
			
		}

}
