package edu.douglas.primeirasemana;

import java.util.*;

public class excessoes {

	public excessoes() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TOsDO Auto-generated method stub
		Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);

		int age;
		String lastName;
		String name;
		double height;
		try {
			System.out.println("Digite o nome");
			name = scanner.next();
			System.out.println("Digite o sobrenome");
			lastName = scanner.next();
			System.out.println("Digite idade");
			age = scanner.nextInt();
			System.out.println("Digite altura ");
			height = scanner.nextDouble();

			System.out.println(
					String.format("Se nome é %s %s possui %d anos com %.2f altura", name, lastName, age, height));

		} catch (Exception e) {
			// TODO: handle exception
			
			System.out.println(e);
		}

	}

}
