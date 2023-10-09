package edu.poo.entity;

public abstract class entity {
	private int life = 1;
	private int x = 0;
	private int y = 0;

	public entity(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public abstract void move();
	
	//getters setter
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}
}
