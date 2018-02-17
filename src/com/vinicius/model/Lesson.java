package com.vinicius.model;

public class Lesson implements Comparable<Lesson>{

	private String title;
	private int time;
	
	public Lesson(String title, int time) {
		if(title==null){
			throw new NullPointerException("Title can't be null");
		}
		this.title = title;
		this.time = time;
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getTime() {
		return time;
	}
	
	@Override
	public String toString() {
		return "[Lesson: "+this.title + ", "+this.time + " minutes]";	
	}

	@Override
	public int compareTo(Lesson otherLesson) {
		return this.title.compareTo(otherLesson.title);
	}
	
}
