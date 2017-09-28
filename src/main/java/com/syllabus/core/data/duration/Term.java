package com.syllabus.core.data.duration;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.syllabus.core.data.study.Exam;

public class Term {

	private List<Exam> exams = null;
	private List<Day> days = null;
	private String name = null;
		
	public Term( String name ) {
		this.name = name;
		this.exams = new ArrayList<>();
		this.days = new ArrayList<>();
	}
	
	public Term( String name, LocalDate start, LocalDate end ) {
		this.name = name;
		this.exams = new ArrayList<>();
		// TODO populate the day list.
		this.days = new ArrayList<>();
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
