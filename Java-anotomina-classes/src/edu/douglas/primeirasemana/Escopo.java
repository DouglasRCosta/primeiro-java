package edu.douglas.primeirasemana;
import java.util.Locale;
import java.util.Scanner;
public class Escopo {

	public Escopo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("nome");
		String name = scanner.next();
		System.out.println("idade");
		int age = scanner.nextInt();
		System.out.println("nome");
		double height = scanner.nextDouble();
		System.out.println("nome");
		double money = scanner.nextDouble();
		
		System.out.println(name + age + height + money);
		
		
	}

}
