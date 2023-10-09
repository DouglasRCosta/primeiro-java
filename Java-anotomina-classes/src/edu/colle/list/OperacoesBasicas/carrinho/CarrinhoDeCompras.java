package edu.colle.list.OperacoesBasicas.carrinho;

import java.util.*;
 

public class CarrinhoDeCompras {

	 private  List<Item> carinho;
	 
	 
	 public CarrinhoDeCompras() {
		 this.carinho = new ArrayList<Item>();
	 }
	 
	 public void adicionarItem(String nome, double preco, int quantidade) { 
		 //Adiciona um item ao carrinho com o nome, preço e quantidade especificados.
		 this.carinho.add(new Item(nome, preco, quantidade));
	 }
	 
	 public void removerItem(String nome) {
		 // Remove um item do carrinho com base no seu nome.
		 List<Item> itemsQueSeraoRemovidos = new ArrayList<Item>();
		 for(Item item : carinho) {
			 if(item.getNome() == nome) itemsQueSeraoRemovidos.add(item);
		 }
		 carinho.removeAll(itemsQueSeraoRemovidos);
	 }
	 
	 public double calcularValorTotal() {
		 //Calcula e retorna o valor total do carrinho, levando em consideração o preço e a quantidade de cada item.
		 double valorTotalDoCarrinho = 0;
		 for(Item item : carinho) {
			 valorTotalDoCarrinho = valorTotalDoCarrinho + (item.getValor()* item.getQuantidade());
		 }
		return valorTotalDoCarrinho;
		 
	 }
	 public void exibirItens(){
		 //Exibe todos os itens presentes no carrinho, mostrando seus nomes, preços e quantidades. 
		 System.out.println(carinho);
	 }

	@Override
	public String toString() {
		return "CarrinhoDeCompras  " + carinho + " ";
	}

}
