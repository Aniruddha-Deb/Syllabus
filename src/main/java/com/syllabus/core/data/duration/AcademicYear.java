package com.syllabus.core.data.duration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AcademicYear {

	private List<Term> terms = null;
	private String name = null;

	public AcademicYear( String name, Term... terms ) {
		this.name = name;
		this.terms = Arrays.asList( terms );	
	}
	
	public AcademicYear( String name ) {
		this.name = name;
		this.terms = new ArrayList<>();
	}
	
	public List<Term> getTerms(){
		return terms;
	}
	
	@Override
	public String toString(){
		return name;
	}	
}
