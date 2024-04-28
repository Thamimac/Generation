package colecoes;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio3 {
	public static void main(String[] args) {
	
		Set<Integer> dados = new HashSet<Integer>();
		Scanner leia = new Scanner (System.in);
		int contador = 0, lista;
		
		
		do {
			System.out.println("Digite um número: ");
			lista = leia.nextInt();
			dados.add(lista);
			contador++;
			
			
		} while (contador < 10);
		
		
		System.out.println("Lista de números digitados: ");
		Iterator<Integer> ilista = dados.iterator();
		while (ilista.hasNext()) {
			System.out.println(ilista.next());
		}
		
		
		
}
}
