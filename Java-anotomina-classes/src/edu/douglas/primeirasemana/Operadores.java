package edu.douglas.primeirasemana;

import javax.crypto.ExemptionMechanism;

public class Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		aritimeticos();
		unario();
	}

	public static void atribuicao() {
		int exemplo = 4;
		// o operador que atribui um valor a variavel >>=
	}

	public static void aritimeticos() {
		int exemplo = 4 + 4;
		int exemplo1 = 4 - 4;
		int exemplo2 = 4 * 4;
		int exemplo3 = 4 / 4;
		int exemplo4 = 4 % 4; // module indica se qua realizar alguma divisa este numero deixara resto
		System.out.println(exemplo4);
		int exemplo5 = 4 % 3; // module indica se qua realizar alguma divisa este numero deixara resto retorna 1 se tiver e 0 se não
		System.out.println(exemplo5);

		// usar o + com string ia concatenar as strings
		String texto = "um "+ "dois" ; 
	}

	public static void unario() {
		int exemplo = -4 ;  // um operador -  +  antes do numero o nega para seu oposto funcionando com regra de sinais da metematica
		int exemplo1 = -4 ; ///     -(-4)  >>>   resulta em 5   mas tambem para inverter pode se usar -4 *-1
		
		exemplo1 = + exemplo1;
		
		int exemplo2 = 4 ;
		 exemplo2++;  /// incrementa em um
		 exemplo2--;// faz o oposto
		 exemplo2*=2;
		 System.out.println(exemplo2);
	}
	
}
