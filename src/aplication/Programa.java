package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.PessoaFisica;
import entidades.pessoaJuridica;
import entidades.taxaAnual;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<taxaAnual> list = new ArrayList<>();
		System.out.println("entre com o numero de contribuintes: ");
		int contribuinte = sc.nextInt();

		for (int i = 1; i <= contribuinte; i++) {
			System.out.println("Taxa do contribuinte #" + i);
			System.out.println("Informe Pessoa Fisica Ou Juridica ( F / J)?");
			char type = sc.next().charAt(0);
			System.out.println("Nome do contribuinte: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("Renda anual: ");
			double renda = sc.nextDouble();
			if (type == 'f' || type == 'F') {
				System.out.println("Despesas com plano de saude: ");
				double despesas = sc.nextDouble();
				list.add(new PessoaFisica(nome, renda, despesas));
			} else {
				System.out.println("Quantidade de funcionarios: ");
				int qtdFunc = sc.nextInt();
				list.add(new pessoaJuridica(nome, renda, qtdFunc));

			}
			double soma = 0.0;
			System.out.println();
			System.out.println("Taxa paga anual");
			for (taxaAnual tx : list) {
				double tax = tx.taxa();
				System.out.println(tx.getNome() + ": $" + String.format("%.2f", tax));
				soma +=tax;
			}
			System.out.println();
			System.out.println("Total taxas: $ " + String.format("%.2f", soma));
		}

		sc.close();

	}

}
