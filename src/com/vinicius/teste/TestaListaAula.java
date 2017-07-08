package com.vinicius.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.vinicius.model.Aula;

public class TestaListaAula {

	public static void main(String[] args) {

		Aula a1 = new Aula("Revisitando as ArrayLists", 21);
		Aula a2 = new Aula("Listas de objetos", 20);
		Aula a3 = new Aula("Relacionamento de listas e objetos", 17);
		
		List<Aula> aulas = new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		System.out.println(aulas);
		System.out.println();
		
		//Ordenando Listas-----------------------------
		
		Collections.sort(aulas);
		System.out.println(aulas);
		
		System.out.println();
		
		//Ordenando Listas (Java 8)--------------------
		
		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
		System.out.println(aulas);
		
		System.out.println();
		
		//Ou também------------------------
		
		aulas.sort(Comparator.comparing(Aula::getTempo));
		System.out.println(aulas);
		
		System.out.println();
		
		
	}

}
