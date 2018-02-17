package com.vinicius.test;

import java.util.ArrayList;
import java.util.List;

import com.vinicius.model.Lesson;
import com.vinicius.model.Course;

public class TestCourse {

	public static void main(String[] args) {
		Course javaCollections = new Course("Dominating collections", "Paulo Silveira");
		
//		List<Lesson> lessons = javaCollections.getLessons();
//		
//		System.out.println(lessons);
//		
//		lessons.add(new Lesson("Working with ArrayList", 21));
//		System.out.println(javaCollections.getLessons());
		
		// Or just: 
//		javaCollections.getLessons().add(new Lesson("Lists of objects", 19));
//		System.out.println(javaCollections.getLessons());
		
		//--PS: If getLessons() returns a Unmodifiable List, 
		//      it won't be able to do operations on this list (add, remove etc.)
		
		// Or using the addition method implemented in the Course (safest way)
		javaCollections.add(new Lesson("Working with ArrayList", 21));
		javaCollections.add(new Lesson("Lists of objects", 19));
		javaCollections.add(new Lesson("Relating collections", 24));
		System.out.println(javaCollections.getLessons());
		
		//-------
		List<Lesson> changeableClasses = new ArrayList<>(javaCollections.getLessons());
		changeableClasses.add(new Lesson("New lesson", 0));
		System.out.println(changeableClasses);
	}

}
