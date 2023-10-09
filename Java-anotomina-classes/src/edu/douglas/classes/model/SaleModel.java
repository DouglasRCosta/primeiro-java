package edu.douglas.classes.model;

public class SaleModel {

	private int age = 0;
	private String name = "";

	public SaleModel(String name, int age) {
		this.age = age;
		this.name = name;
		// TODO Auto-generated constructor stub
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
