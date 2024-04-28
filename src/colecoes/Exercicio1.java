package colecoes;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		
		ArrayList<String> cores = new ArrayList<String>();
		Scanner leia = new Scanner(System.in);
		String cor;
		
		for (int lista = 0; lista < 5; lista++) {
			System.out.println("Digite uma cor: ");
			cor = leia.next();
			cores.add(cor);
		}
		
		System.out.println("Cores inseridas: ");
		System.out.println(cores);
		
		cores.sort(null);
		System.out.println("Cores em ordem alfabética: ");
		System.out.println(cores);
	
}
}
