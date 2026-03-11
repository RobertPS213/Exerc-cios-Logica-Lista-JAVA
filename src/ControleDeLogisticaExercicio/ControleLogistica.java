package ControleDeLogisticaExercicio;

import java.util.Scanner;
import java.util.Locale;
import java.util.List;
import java.util.ArrayList;

public class ControleLogistica {
    public static void main(String args[]) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<CidadesFretes> lista = new ArrayList<>();
        System.out.print("Digite a quantidade de cadastros: ");
        int x = sc.nextInt();
        for(int i = 0; i < x; i++) {
            sc.nextLine();
            System.out.print("\nDigite o nome do estado: ");
            String nomeEstado = sc.nextLine();
            System.out.print("Digite o valor do frete: ");
            double valorFrete = sc.nextDouble();
            lista.add(new CidadesFretes(nomeEstado, valorFrete));
        }
        System.out.print("\n-- ATUALIZAÇÃO DE TAXA DE URGÊNCIA --");
        System.out.print("\nDigite o nome da cidade para aplicar taxa: ");
        sc.nextLine(); 
        String nomeSelecionado = sc.nextLine();
        int posicao = -1;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNomeEstado().equalsIgnoreCase(nomeSelecionado)) {
                posicao = i;
                break;
            }
        }
        if(posicao == -1) {
            System.out.println("\nERRO: ESTADO NÃO LOCALIZADO NO SISTEMA!");
        } else {
            System.out.print("Digite a porcentagem da taxa (ex: 10 para 10%): ");
            double porcentagem = sc.nextDouble();
            CidadesFretes cidadeAlvo = lista.get(posicao);
            double novoValor = cidadeAlvo.getFretes() * (1 + porcentagem / 100);
            cidadeAlvo.setFretes(novoValor);
            System.out.printf("Taxa aplicada! Novo valor para %s: R$ %.2f%n", cidadeAlvo.getNomeEstado(), novoValor);
        }
        System.out.println("\n--- RELATÓRIO DE LOGÍSTICA ATUALIZADO ---");
        for (CidadesFretes cf : lista) {
            System.out.printf("Estado: %s | Frete: R$ %.2f%n", cf.getNomeEstado(), cf.getFretes());
        }
        sc.close();
    }
}