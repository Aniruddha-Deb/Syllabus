package com.syllabus.core.data.duration;

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
	
	@Override
	public String toString(){
		return name;
	}
}
