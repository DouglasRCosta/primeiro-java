package edu.douglas.primeirasemana;

public class BoletimAluno {

	public static void main(String[] args) {
		
		
		/**
		 * 
		 
		 Java Beans 
		 
		 seja claro na declaracao de variavel
		 sempre singula a menos que se efira a um array
		 sempre utilize apenas uma lingua
		 
		 exemplo   (salMedio) errado (salarioMedio)correto
		 
		  
		  
		  métodos se utiliza camel case e sempre usando verbos para descrever sua acao
		  
		  
		  exemplos
		  somar(int num, int num2)
		  
		  abrirConexao()
		  
		  
		  é recomendado escrever em ingles visto que as bibliotecas possui seu métodos em ingles
		  findById()
		  
		 
		 *  
		 */
		int notaAluno = 6;

		if (notaAluno < 6) {
			System.out.println("Aluno Reprovado");
		} else if (notaAluno == 6) {
			System.out.println("Prova de Minerva");
		} else {
			System.out.println("Aluno Aprovado");
		}
	}
}
