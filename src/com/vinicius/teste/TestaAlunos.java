package com.vinicius.teste;

import com.vinicius.model.Aluno;
import com.vinicius.model.Aula;
import com.vinicius.model.Curso;

public class TestaAlunos {
	
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções", "Paulo Silveira");
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Listas de objetos", 19));
		javaColecoes.adiciona(new Aula("Relacionamento com coleções", 24));
		
		Aluno a1 = new Aluno("Dionísio da Silva", 145);
		Aluno a2 = new Aluno("Godofredo Fonseca", 452);
		Aluno a3 = new Aluno("Jonelson Oliveira", 784);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Todos os alunos matriculados: ");
		javaColecoes.getAlunos().forEach(aluno -> {
			System.out.println(aluno);
		});
		
		System.out.println("O aluno "+a1.getNome()+" está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(a1));
		
	}
	
}
