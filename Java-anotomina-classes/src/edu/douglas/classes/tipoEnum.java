package edu.douglas.classes;

public enum tipoEnum {

	// objetos imutaveis e sempre disponiveis na aplicacao
	
	SAO_PAULO("SP","São Paulo"),
	RIO_DE_JANEIRO("RJ","Rio de Janeiro");
	
	
	private String sigla;
	private String nome;
	
	private tipoEnum(String sigla,String nome) {
		this.nome=nome;
		this.sigla=sigla;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
