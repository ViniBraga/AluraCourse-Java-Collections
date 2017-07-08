package com.vinicius.model;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<>();
	private Set<Aluno> alunos = new HashSet<>();
	
	public Curso(String nome, String instrutor) {
		if(nome == null || instrutor == null){
			throw new NullPointerException("Nome e Instrutor não podem ser nulos!");
		}
		this.nome = nome;
		this.instrutor = instrutor;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getInstrutor() {
		return instrutor;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}
	
	public void adiciona(Aula aula){
		this.aulas.add(aula);
	}
	
	public int getTempoTotal(){
		return aulas.stream().mapToInt(Aula::getTempo).sum();
	}

	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

	public void matricula(Aluno aluno) {
		alunos.add(aluno);
	}

	public boolean estaMatriculado(Aluno aluno) {
		return alunos.contains(aluno);
	}
	
}
