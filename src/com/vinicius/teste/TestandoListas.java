package com.vinicius.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestandoListas {

	public static void main(String[] args) {

		String aula1 = "Conhecendo mais de listas";
		String aula2 = "Modelando a classe Aula";
		String aula3 = "Trabalhando com Cursos e Sets";

		List<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);

		System.out.println(aulas);
		System.out.println();

		aulas.remove(0);

		System.out.println(aulas);
		System.out.println();

		//Percorrendo Listas--------------------
		
		for (String aula : aulas) {
			System.out.println("Aula: " + aula);
		}

		System.out.println();

		for (int i = 0; i < aulas.size(); i++) {
			System.out.println("Aula: " + aulas.get(i));
		}

		System.out.println();

		// A partir do Java 8, existe nova forma de percorrer um Array:

		// List possui um método chamado forEach,
		// cujo o parâmetro é um objeto de uma interface chamada Consumer
		// (lambda)
		System.out.println("Listando com programação funcional: \n");
		aulas.forEach(aula -> {
			System.out.println("Percorrendo:");
			System.out.println("  "+aula);
		});
		
		
		//Ordenando Listas-----------------------------
		System.out.println();
		
		aulas.add("Aumentando nosso conhecimento");
		System.out.println(aulas);
		System.out.println();
		
		Collections.sort(aulas);
		System.out.println(aulas);
		
		

	}

}
