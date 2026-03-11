package AtualizacaoDeRankingExercicio;

import java.util.Scanner;
import java.util.Locale;
import java.util.List;
import java.util.ArrayList;

public class AtualizacaoRanking {
	public static void main(String args[]) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("-- EXERCICIO DE FIXAÇÃO (ATUALIZAÇÃO DE RANKING) --\n");
		List<String> listaNomes = new ArrayList<>();
		List<Double> listaPontos = new ArrayList<>();
		System.out.print("Quantos jogadores serão adicionados: ");
		int x = sc.nextInt();
		for(int i = 0; i < x; i++) {
			System.out.print("\n----------------------");
			sc.nextLine();
			System.out.print("\nADICIONAR #" + (i + 1) + " JOGADOR:\n");
			System.out.print("Nome do jogador: ");
			String nomes = sc.nextLine();
			System.out.print("Pontos do jogador: ");
			double pontos = sc.nextDouble();
			System.out.print("----------------------\n");
			listaNomes.add(nomes);
			listaPontos.add(pontos);
		}
		System.out.print("\n-- MODIFICAR O VALOR DOS PONTOS USANDO O NOME --\n\n");
		System.out.print("Digite o nome de um jogador: ");
		sc.nextLine();
		String nomeSelecionado = sc.nextLine();
		int posicao = listaNomes.indexOf(nomeSelecionado);
		if(posicao == -1) {
			System.out.println("\nNENHUM JOGADOR COM ESSE NOME!!!");
		} else {
			System.out.print("Digite a nova pontuação do jogador: ");
			double pontosNovos = sc.nextDouble();
			listaPontos.set(listaNomes.indexOf(nomeSelecionado), pontosNovos);
		}
		System.out.print("\nJOGADORES:\n");
		for(int i = 0; i < x; i++) {
			System.out.print("----------------\n");
			System.out.print("JOGADOR #" + (i + 1) + "\n");
			System.out.printf("Nome: %s%nPontos: %.2f%n", listaNomes.get(i), listaPontos.get(i));
		}
		System.out.print("----------------\n");
		sc.close();
	}
}
