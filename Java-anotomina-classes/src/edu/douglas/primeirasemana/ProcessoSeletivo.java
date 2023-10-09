package edu.douglas.primeirasemana;

import java.util.concurrent.ThreadLocalRandom; 
public class ProcessoSeletivo {

	public ProcessoSeletivo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double salarioBase = 2000.0;
		analisarCandidato(1900.0, salarioBase);
		analisarCandidato(2200.20, salarioBase);
		analisarCandidato(2000, salarioBase);
		selecaoDeCandidatos(salarioBase);

	}

	static void selecaoDeCandidatos(double salarioBase) {
		String[] nomes = { "Alice", "Bob", "Carlos", "Diana", "Eduardo", "Fernanda", "Gustavo", "Heloisa", "Isabela",
				"João" };
		int candidatosSelecionados = 0;
		int candidatoAtual = 0;
		
 
			while (candidatosSelecionados < 5 && candidatoAtual < nomes.length) {
			double salarioPretendidodoCandidato =Math.round( ThreadLocalRandom.current().nextDouble(1800.00,2200.00));
			
			System.out.println("O candidato " +nomes[candidatoAtual]+"solicitou um salario de "+ salarioPretendidodoCandidato );
			if(salarioPretendidodoCandidato <= salarioBase) {
				candidatosSelecionados++;
				System.out.println("O candidato " +nomes[candidatoAtual]+" foi  selecionado");
			}
				candidatoAtual++;
		}
 
			System.out.println(candidatosSelecionados+" foram selecionados,");
		
	}

	static public void analisarCandidato(double salarioPretendido, double salarioBase) {
		if (salarioBase > salarioPretendido) {
			System.out.println("ligar candidato");
		} else if (salarioBase == salarioPretendido) {
			System.out.println("liga com contra proposta");
		} else {
			System.out.println("esperar outros candidatos");
		}
	}
}
