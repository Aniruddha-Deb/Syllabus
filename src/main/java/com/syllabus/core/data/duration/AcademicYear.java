package com.syllabus.core.data.duration;

import java.util.ArrayList;
import java.util.List;

import com.syllabus.core.data.duration.term.Term;
import com.syllabus.core.data.study.Subject;

public class AcademicYear {

	private List<Term> terms = null;
	private List<Subject> subjects = null;
	private String name = null;
	
	public AcademicYear( String name ) {
		this.name = name;
		this.terms = new ArrayList<>();
		this.subjects = new ArrayList<>();
	}
	
	public List<Subject> getSubjects() {
		return subjects;
	}
	
	public List<Term> getTerms(){
		return terms;
	}
	
	public String getName(){
		return name;
	}
	
	@Override
	public String toString(){
		return name + " : " + terms.toString();
	}
}
