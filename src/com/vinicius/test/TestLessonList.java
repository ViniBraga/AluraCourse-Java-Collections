package com.vinicius.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.vinicius.model.Lesson;

public class TestLessonList {

	public static void main(String[] args) {

		Lesson a1 = new Lesson("Reviewing ArrayLists", 21);
		Lesson a2 = new Lesson("Lists of objects", 20);
		Lesson a3 = new Lesson("Relating lists and objects", 17);
		
		List<Lesson> lessons = new ArrayList<>();
		lessons.add(a1);
		lessons.add(a2);
		lessons.add(a3);
		
		System.out.println(lessons);
		System.out.println();
		
		//Sorting Lists-----------------------------
		
		Collections.sort(lessons);
		System.out.println(lessons);
		
		System.out.println();
		
		//Sorting Lists (Java 8)--------------------
		
		Collections.sort(lessons, Comparator.comparing(Lesson::getTime));
		System.out.println(lessons);
		
		System.out.println();
		
		//Or also------------------------
		
		lessons.sort(Comparator.comparing(Lesson::getTime));
		System.out.println(lessons);
		
		System.out.println();
		
	}

}
