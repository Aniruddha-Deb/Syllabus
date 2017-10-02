package com.syllabus.core.data.duration;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Week implements Serializable{

	private static final long serialVersionUID = 8378530675419996540L;
	
	private List<Day> days = null;
	
	public Week( List<Day> days ) {
		this.days = days;
	}
	
	public Week() {
		this.days = new ArrayList<>();
	}
	
	public List<Day> getDays(){
		return days;
	}	
}
