package com.syllabus.core.data.duration;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.syllabus.core.data.config.UserConfiguration;
import com.syllabus.core.data.duration.term.Term;

public class AcademicYear implements Serializable{

	private static final long serialVersionUID = -7230770439756761712L;
	
	private List<Term> terms = null;
	private UserConfiguration config = null;
	private String name = null;
	
	public AcademicYear( String name, UserConfiguration config ) {
		this.name = name;
		this.terms = new ArrayList<>();
		this.config = config;
	}

	public UserConfiguration getConfig(){
		return config;
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
