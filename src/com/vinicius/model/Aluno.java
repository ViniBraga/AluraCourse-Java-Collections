package com.vinicius.model;

public class Aluno {

	private String nome;
	private long matricula;
	
	public Aluno(String nome, long matricula) {
		if(nome==null){
			throw new NullPointerException("Nome não pode ser nulo!");
		}
		this.nome = nome;
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public long getMatricula() {
		return matricula;
	}
	
	@Override
	public String toString() {
		return "[Aluno: "+nome+", matricula: "+matricula+"]";
	}

	//Quero garantir que para dois elementos serem comparados, apenas o nome é importante
	//Portanto, os métodos equals e hashCode devem ser criados
	
	@Override
	public boolean equals(Object obj) {
		Aluno outro = (Aluno) obj;
		return this.nome.equals(outro);
	}
	
	@Override
	public int hashCode() {
		//Separo os elementos da tabela de espalhamento (Hash Map) considerando as iniciais do nome
		//Assim, vou garantir que um elemento será procurado no lugar certo
		return this.nome.charAt(0);
		// OU
		//return this.nome.hashCode();
		
	}
	
}
