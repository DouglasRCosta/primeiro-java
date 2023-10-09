package edu.colle.list;

import edu.colle.list.OperacoesBasicas.ListaTarefas;
import edu.colle.list.OperacoesBasicas.carrinho.CarrinhoDeCompras;

public class main {
	public static void main(String args[]) {
		ListaTarefas listaDeTarefa = new ListaTarefas();

		listaDeTarefa.adicionarTarefa("Dormir");
		listaDeTarefa.adicionarTarefa("Acordar");
		listaDeTarefa.adicionarTarefa("Acordar");

		listaDeTarefa.obterDescricoesTarefas();

		System.out.println(listaDeTarefa.obterNumeroTotalTarefas());

		listaDeTarefa.removerTarefa("Dormir");
		listaDeTarefa.obterDescricoesTarefas();

		// carrinho

		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adicionarItem("bota", 44.63, 1);
		carrinho.adicionarItem("camiseta", 14.63, 2);
		carrinho.exibirItens();
		System.out.println(carrinho.calcularValorTotal());
		carrinho.removerItem("bota");
		carrinho.exibirItens();
	}
}
