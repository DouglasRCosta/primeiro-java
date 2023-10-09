package edu.douglas.primeirasemana;

import java.util.Iterator;

import edu.douglas.classes.tipoEnum;

public class Loops {
 
	public static void main(String args[]) {
		int num = 5;
		String nomes[] = { "UM", "DOIS", "TRES", "QUATRO", "CINCO" };

		for (int i = 0; i < nomes.length; i++) {
			System.out.println(nomes[i]);
		}
		
		/////////////////
		//acesso Enum
		for(tipoEnum e : tipoEnum.values()) {
			System.out.println(e.getNome() + "-"+ e.getSigla());
		}
		
		
		
		
		
		///////////
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
