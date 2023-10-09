package edu.poo.msmessage;

public class MsMessage {

	public void enviarMessagem() {
		validarConexao();
		System.out.println("enviando menssagem");
		salvarHistoricoMessagem();
	}

	public void receberMessagem() {
		validarConexao();
		System.out.println("recebendo menssagem");
		salvarHistoricoMessagem();

	}

	private void validarConexao() {
		System.out.println("validando conexao");

	}

	private  void salvarHistoricoMessagem() {
		System.out.println("salvando historico menssagem");

	}
}
