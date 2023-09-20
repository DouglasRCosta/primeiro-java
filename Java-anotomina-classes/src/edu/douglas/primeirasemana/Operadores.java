package edu.douglas.primeirasemana;

import javax.crypto.ExemptionMechanism;

public class Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		aritimeticos();
		unario();
		relacionais();
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
		int exemplo5 = 4 % 3; // module indica se qua realizar alguma divisa este numero deixara resto retorna
								// 1 se tiver e 0 se não
		System.out.println(exemplo5);

		// usar o + com string ia concatenar as strings
		String texto = "um " + "dois";
	}

	public static void unario() {
		int exemplo = -4; // um operador - + antes do numero o nega para seu oposto funcionando com regra
							// de sinais da metematica
		int exemplo1 = -4; /// -(-4) >>> resulta em 5 mas tambem para inverter pode se usar -4 *-1

		exemplo1 = +exemplo1;

		int exemplo2 = 4;
		exemplo2++; /// incrementa em um
		exemplo2--;// faz o oposto
		exemplo2 *= 2;
		System.out.println(exemplo2);
	}

	public static void relacionais() {
		int um = (1 > 2) ? 2 : 3;   ///     operadores ternarios
		um = (1 >= 2) ? 2 : 3;
		um = (1 < 2) ? 2 : 3;
		um = (1 <= 2) ? 2 : 3;		/// para comparar objetos se usa o equals()
		um = (1 == 2) ? 2 : 3;
		um = (1 != 2) ? 2 : 3;

	}
	public static void logios () {
		if(2>1 && 1<2 ) {  //  && os dois lados tem que ser true   AND
			if(2>3 || 1<2 ) {  //  || pelo menos um dos lados tem que ser true   OR
				
			}
		}

	}

}
