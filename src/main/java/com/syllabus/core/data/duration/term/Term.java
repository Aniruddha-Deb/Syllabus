package com.syllabus.core.data.duration.term;

import java.util.ArrayList;
import java.util.List;

import com.syllabus.core.data.duration.Day;
import com.syllabus.core.data.study.Exam;

public class Term {

	private List<Exam> exams = null;
	private List<Day> days = null;
	private String name = null;
		
	Term( String name ) {
		this.name = name;
		this.exams = new ArrayList<>();
		this.days = new ArrayList<>();
	}
	
	Term( String name, List<Day> days ) {
		this.name = name;
		this.exams = new ArrayList<>();
		this.days = days;
	}	
	
	public List<Exam> getExams(){
		return exams;
	}
	
	public List<Day> getDays(){
		return days;
	}
	
	public String getName(){
		return name;
	}	
}
