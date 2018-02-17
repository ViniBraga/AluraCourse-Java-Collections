package com.vinicius.test;

import com.vinicius.model.Student;
import com.vinicius.model.Lesson;
import com.vinicius.model.Course;

public class TestStudents {
	
	public static void main(String[] args) {
		Course javaCollections = new Course("Dominating collections", "Paulo Silveira");
		javaCollections.add(new Lesson("Working with ArrayList", 21));
		javaCollections.add(new Lesson("Lists of objects", 19));
		javaCollections.add(new Lesson("Relating collections", 24));
		
		Student s1 = new Student("Dionisio da Silva", 145);
		Student s2 = new Student("Godofredo Fonseca", 452);
		Student s3 = new Student("Jonelson Oliveira", 784);
		
		javaCollections.enroll(s1);
		javaCollections.enroll(s2);
		javaCollections.enroll(s3);
		
		System.out.println("Students enrolled: ");
		javaCollections.getLessons().forEach(aluno -> {
			System.out.println(aluno);
		});
		
		System.out.println("Is the student "+s1.getName()+" enrolled?");
		System.out.println(javaCollections.isEnrolled(s1));
		
	}
	
}
