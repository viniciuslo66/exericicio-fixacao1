package Aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entidades.ProdutoImportado;
import Entidades.ProdutoUsado;
import Entidades.Produtos;

public class Programa {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);

		List<Produtos> produtos = new ArrayList<>();

		System.out.print("Entre com o numero de pedidos: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Produto #" + i);

			System.out.print("Comum, usado, importado (c/u/i)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();

			System.out.print("Nome: ");
			String nome = sc.nextLine();

			System.out.print("Preco: ");
			double preco = sc.nextDouble();

			if (ch == 'c') {

				produtos.add(new Produtos(nome, preco));

			} else if (ch == 'u') {

				System.out.print("Data de fabricacao: ");
				Date diaFabricacao = sdf.parse(sc.next());
				produtos.add(new ProdutoUsado(nome, preco, diaFabricacao));

			} else {

				System.out.print("Taxa alfandega: ");
				double taxaAlfandega = sc.nextDouble();
				produtos.add(new ProdutoImportado(nome, preco, taxaAlfandega));

			}
		}

		System.out.println("");
		System.out.println("Tag de preços: ");

		for (Produtos produtos2 : produtos) {
			System.out.println(produtos2.tagDePreco());
		}

		sc.close();
	}

}
