package com.vinicius.model;

public class Student {

	private String name;
	private long enrollmentNumber;
	
	public Student(String name, long enrollmentNumber) {
		if(name==null){
			throw new NullPointerException("Name can't be null!");
		}
		this.name = name;
		this.enrollmentNumber = enrollmentNumber;
	}

	public String getName() {
		return name;
	}

	public long getEnrollmentNumber() {
		return enrollmentNumber;
	}
	
	@Override
	public String toString() {
		return "[Student: "+name+", number: "+enrollmentNumber+"]";
	}

	//I want to ensure that for two elements that are going to be compared, only the name is important
	//Therefore, the equals and hashCode methods must be created
	@Override
	public boolean equals(Object obj) {
		Student other = (Student) obj;
		return this.name.equals(other);
	}
	
	@Override
	public int hashCode() {
	  //I separate the elements of the Hash Map considering the initials of the name
	  //Consequently, I'll ensure that the element will be searched in the right place
		return this.name.charAt(0);
		// OR
		//return this.nome.hashCode();
		
	}
	
}
