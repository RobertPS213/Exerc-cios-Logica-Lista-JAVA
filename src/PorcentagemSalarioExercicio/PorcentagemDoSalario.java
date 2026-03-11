package PorcentagemSalarioExercicio;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Locale;

public class PorcentagemDoSalario {
	public static void main(String args[]) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Integer> listaID = new ArrayList<>();
		List<String> listaNOME = new ArrayList<>();
		List<Double> listaSALARIO = new ArrayList<>();
		System.out.print("How Many employees will be registered: ");
		int x = sc.nextInt();
		for (int i = 0; i < x; i++) {
			System.out.println("\nEmplyoee #" + (i + 1));
			System.out.print("ID: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String nome = sc.nextLine();
			System.out.print("Salary: ");
			double salario = sc.nextDouble();
			listaID.add(id);
			listaNOME.add(nome);
			listaSALARIO.add(salario);
		}
		System.out.print("Enter the empyoee id that will have salary increase: ");
		int idBusca = sc.nextInt();
		int posicao = listaID.indexOf(idBusca);
		if (posicao == -1) {
			System.out.print("This id does not exist! ");
		} else {
			System.out.print("Enter the percentage: ");
			double porcentagem = sc.nextDouble();
			double novoSalario = listaSALARIO.get(posicao) * (1 + porcentagem / 100.0);
			listaSALARIO.set(posicao, novoSalario);
		}
		System.out.println("\nList of employees:");
		for (int i = 0; i < listaID.size(); i++) {
			System.out.printf("%d, %s, %.2f%n", listaID.get(i), listaNOME.get(i), listaSALARIO.get(i));
		}
		sc.close();
	}
}