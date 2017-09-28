package com.syllabus.core.data.study;

import com.syllabus.core.data.duration.Day;

public class Exam {

	private Syllabus syllabus = null;
	private Day day = null;
	private Subject subject = null;

	public Exam( Subject subject, Day day ) {
		this.subject = subject;
		this.day = day;
	}
	
	public Exam( Subject subject, Day day, Syllabus syllabus ) {
		this.subject = subject;
		this.day = day;
		this.syllabus = syllabus;
	}
	
	public Day getDay() {
		return day;
	}
	
	public Subject getSubject(){
		return subject;
	}
	
	public Syllabus getSyllabus(){
		return syllabus;
	}
	
	public void setSyllabus( Syllabus syllabus ){
		this.syllabus = syllabus;
	}
}
