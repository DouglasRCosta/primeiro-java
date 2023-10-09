package edu.colle.list.OperacoesBasicas;

import java.util.ArrayList;

public class ListaTarefas {

	private ArrayList<Tarefa> tarefas;

	public ListaTarefas() {
		super();
		this.tarefas = new ArrayList<>();
	}

	public void adicionarTarefa(String descricao) {
		this.tarefas.add(new Tarefa(descricao));
	}

	public void removerTarefa(String descricao) {
		ArrayList<Tarefa> tarefasParaRemover = new ArrayList<Tarefa>();
		for (Tarefa t : tarefas) {
			if (t.getDescricao().equalsIgnoreCase(descricao)) {
				tarefasParaRemover.add(t);
			}
		}
		tarefas.removeAll(tarefasParaRemover);
	}

	public int obterNumeroTotalTarefas() {
		return tarefas.size();

	}

	public void obterDescricoesTarefas() {
		for(Tarefa t : tarefas) {
			System.out.println(t.getDescricao());
		}
		
	}
}
