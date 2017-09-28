package com.syllabus.core.data.duration;

import java.util.ArrayList;
import java.util.List;

public class AcademicYear {

	private List<Term> terms = null;
	private String name = null;

	public AcademicYear( String name, List<Term> terms ) {
		this.name = name;
		this.terms = terms;	
	}
	
	public AcademicYear( String name ) {
		this.name = name;
		this.terms = new ArrayList<>();
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
