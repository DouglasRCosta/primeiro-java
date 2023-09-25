package edu.douglas.primeirasemana;

import java.util.Iterator;

public class Loops {

	public Loops() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[]) {
		int num = 5;
		String nomes[] = { "UM", "DOIS", "TRES", "QUATRO", "CINCO" };

		for (int i = 0; i < nomes.length; i++) {
			System.out.println(nomes[i]);
		}
		for (String nome : nomes) {
			System.out.println("foreach " + nome);
		}
// continue pula o resto do codigo para a proxima interacao 
		// break para
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		while (num < 7) {
			num = num + 1;
			System.out.println(num + " num");
		}

		do {
			num--;
			System.out.println(num + " executa primeiro");
		} while (num > 5);

	}
}
