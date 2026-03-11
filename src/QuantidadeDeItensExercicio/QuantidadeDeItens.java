package QuantidadeDeItensExercicio;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class QuantidadeDeItens {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("-- EXERCICIO DE FIXAÇÃO (CADASTRO DE ITENS) --\n");
		List<String> listaItens = new ArrayList<>();
		List<Integer> listaQuantidade = new ArrayList<>();
		System.out.print("Digite a quantidade de itens cadastrados: ");
		int x = sc.nextInt();
		for(int i = 0; i < x; i++) {
			sc.nextLine();
			System.out.print("\nADICIONAR ITEM #" + (i + 1));
			System.out.print("\nNome do item: ");
			String itensFor = sc.nextLine();
			System.out.print("Quantidade do item: ");
			int quantidadeFor = sc.nextInt();
			listaItens.add(itensFor);
			listaQuantidade.add(quantidadeFor);
		}
		System.out.print("\nRelatório: \n\n");
		for(int i = 0; i < x; i++) {
			System.out.printf("Item: %s | Qtd: %d%n", listaItens.get(i), listaQuantidade.get(i));
		}
		sc.close();
	}
}
