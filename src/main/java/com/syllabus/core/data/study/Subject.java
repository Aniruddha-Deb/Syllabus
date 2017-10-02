package com.syllabus.core.data.study;

import java.io.Serializable;

public class Subject implements Serializable {

	private static final long serialVersionUID = 8155806517311771100L;
	
	private String name = null;
	
	public Subject( String name ) {
		this.name = name;
	}

	public String getName(){
		return name;
	}
}
