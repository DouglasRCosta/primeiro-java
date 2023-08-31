package edu.douglas.primeirasemana;

public class MinhaClasse {

	public static void main(String[] args) {

		int age = 22;
		String name = "Douglas";
		System.out.println("Hello, " + name + ", voce possui," + somar(20, 20) + "anos");
	}
	
	// primeiro vem o tipo depois o nome

	public static int somar(int num, int num2) {
		return num + num2;
	}
}
