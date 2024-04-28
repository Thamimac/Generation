package estruturadedados;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio2 {
	public static void main(String[] args) {
		
	Stack<String> livros = new Stack<String>();
	Scanner leia = new Scanner(System.in);
	int opcao;
	String nome, retirado;
	
	do {
		System.out.println();
		System.out.println("Bem vindo(a) Biblioteca Nacional");
		System.out.println();
		System.out.println("*********************************************");
		System.out.println();
		System.out.println("        1 - Adicionar Livro na pilha        ");
		System.out.println("        2 - Listar todos os livros         ");
		System.out.println("        3 - Retirar livro da pilha          ");
		System.out.println("        0 - Sair                             ");
		System.out.println();
		System.out.println("*********************************************");
		System.out.println("Entre com a opção desejada: ");
	
		opcao = leia.nextInt();
		leia.nextLine();	
	
		switch (opcao) {
		case 1:
		System.out.println("Digite o nome do livro: ");
		nome = leia.next();
		livros.push(nome);
		System.out.println("Livro Adicionado!");
		System.out.println(livros);
		System.out.println();
		break;
		case 2:
			if(livros.isEmpty()) {
				System.out.println("A pilha está vazia!");
				System.out.println();
			} else {
				System.out.println("Lista de livros na pilha: " + livros);
				System.out.println();
			}
		break;
		case 3:
			if (livros.isEmpty()) {
				System.out.println("A pilha está vazia!");
				System.out.println();
			}else {
				retirado = livros.pop();
				System.out.println("Livro " + retirado + " retirado da pilha");
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
