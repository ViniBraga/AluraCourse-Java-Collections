package com.vinicius.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestLists {

	public static void main(String[] args) {

		String lesson1 = "Learning more about the lists";
		String lesson2 = "Modeling Lesson class";
		String lesson3 = "Working with Courses and Sets";

		List<String> lessons = new ArrayList<>();
		lessons.add(lesson1);
		lessons.add(lesson2);
		lessons.add(lesson3);

		System.out.println(lessons);
		System.out.println();

		lessons.remove(0);

		System.out.println(lessons);
		System.out.println();

		//Going through the lists--------------------
		
		for (String lesson : lessons) {
			System.out.println("Lesson: " + lesson);
		}

		System.out.println();

		for (int i = 0; i < lessons.size(); i++) {
			System.out.println("Lesson: " + lessons.get(i));
		}

		System.out.println();

		// From Java 8, there is another way to go through an Array:

		// List has a new method called forEach, whose the parameter is an object of an interface called Consumer
		// (lambda)
		System.out.println("Listing with functional programming: \n");
		lessons.forEach(lesson -> {
			System.out.println("Going through:");
			System.out.println("  "+lesson);
		});
		
		
		//Sorting Lists-----------------------------
		System.out.println();
		
		lessons.add("Improving our knowledge");
		System.out.println(lessons);
		System.out.println();
		
		Collections.sort(lessons);
		System.out.println(lessons);
		
	}

}
