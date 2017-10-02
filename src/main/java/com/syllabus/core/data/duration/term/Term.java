package com.syllabus.core.data.duration.term;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.syllabus.core.data.duration.Week;
import com.syllabus.core.data.study.Exam;

public class Term implements Serializable {

	private static final long serialVersionUID = -6457837405162856566L;
	
	private List<Exam> exams = null;
	private List<Week> weeks = null;
	private String name = null;
		
	Term( String name ) {
		this.name = name;
		this.exams = new ArrayList<>();
		this.weeks = new ArrayList<>();
	}
	
	Term( String name, List<Week> weeks ) {
		this.name = name;
		this.exams = new ArrayList<>();
		this.weeks = weeks;
	}	
	
	public List<Exam> getExams(){
		return exams;
	}
	
	public List<Week> getWeeks(){
		return weeks;
	}
	
	public String getName(){
		return name;
	}	
}
