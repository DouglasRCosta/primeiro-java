package edu.douglas.primeirasemana;

public class Metodos {
	private boolean ligado = false;
	private int canal = 0;
	private int volume = 0;

	public Metodos(int canal, int volume) {
		// TODO Auto-generated constructor stub
		setCanal(canal);
		setVolume(volume);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Metodos metodos = new Metodos(0, 10);
		metodos.ligarTV();
		metodos.ligarTV();
		metodos.aumentarCanal();
		metodos.aumentarCanal();
		metodos.diminuirCanal();
		metodos.aumentarVolume();

		metodos.diminuirVolume();
		metodos.diminuirVolume();
		metodos.diminuirVolume();
		
		metodos.mudarCanalEspecifico(77);
	}

	public void ligarTV() {

		this.ligado = !this.ligado;

		System.out.println(this.ligado);
	}

	public void aumentarVolume() {
		setVolume(this.volume+1);
		System.out.println(this.volume);
	}

	public void diminuirVolume() {
		setVolume(this.volume-1);
		System.out.println(this.volume);
	}

	public void aumentarCanal() {
		setCanal(this.canal+1);
		System.out.println(this.canal);
	}

	public void diminuirCanal() {
		setCanal(this.canal-1);
		System.out.println(this.canal);
	}
	public void mudarCanalEspecifico(int novoCanal) {
		setCanal(novoCanal);
		System.out.println(this.canal);
	}


	/// GETTERS E SETTERS
	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

}
