package com.vinicius.model;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Course {

	private String name;
	private String teacher;
	private List<Lesson> lessons = new LinkedList<>();
	private Set<Student> students = new HashSet<>();
	
	public Course(String name, String teacher) {
		if(name == null || teacher == null){
			throw new NullPointerException("Name and Teacher can't be null!");
		}
		this.name = name;
		this.teacher = teacher;
	}
	
	public String getName() {
		return name;
	}
	
	public String getTeacher() {
		return teacher;
	}

	public List<Lesson> getLessons() {
		return Collections.unmodifiableList(lessons);
	}
	
	public void add(Lesson lesson){
		this.lessons.add(lesson);
	}
	
	public int getTempoTotal(){
		return lessons.stream().mapToInt(Lesson::getTime).sum();
	}

	public Set<Student> getStudents() {
		return Collections.unmodifiableSet(students);
	}

	public void enroll(Student student) {
		students.add(student);
	}

	public boolean isEnrolled(Student student) {
		return students.contains(student);
	}
	
}
