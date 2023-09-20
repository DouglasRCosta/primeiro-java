package edu.douglas.primeirasemana;

public class ControleDeFluxo {

	public ControleDeFluxo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[]) {
		double saldo = 22.45;
		double saldoSolicitado = 12.25;

		int nota = 6;

		if (saldo >= saldoSolicitado) {
			saldo = saldo - saldoSolicitado;
		}
		System.out.println(saldo);

		if (nota >= 7) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}
		if (nota >= 7) {
			System.out.println("Aprovado");
		}else if (nota >= 5){
			System.out.println("Recuperacao");
		}else {
			System.out.println("Reprovado");
		}
	}
}
