package com.vinicius.teste;

import java.util.ArrayList;
import java.util.List;

import com.vinicius.model.Aula;
import com.vinicius.model.Curso;

public class TestaCurso {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções", "Paulo Silveira");
		
		//List<Aula> aulas = javaColecoes.getAulas();
		
		//System.out.println(aulas);
		
		//aulas.add(new Aula("Trabalhando com ArrayList", 21));
		//System.out.println(javaColecoes.getAulas());
		
		// Ou simplesmente: 
		//javaColecoes.getAulas().add(new Aula("Listas de objetos", 19));
		//System.out.println(javaColecoes.getAulas());
		
		//--OBS: Se getAulas() retornar uma Unmodifiable List, 
		//       não será possível fazer operações nessa lista (add, remove etc.)
		
		// Ou pelo método adiciona implementado dentro de curso (maneira mais segura)
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Listas de objetos", 19));
		javaColecoes.adiciona(new Aula("Relacionamento com coleções", 24));
		System.out.println(javaColecoes.getAulas());
		
		//-------
		List<Aula> aulasMutaveis = new ArrayList<>(javaColecoes.getAulas());
		aulasMutaveis.add(new Aula("Nova aula", 0));
		System.out.println(aulasMutaveis);
	}

}
