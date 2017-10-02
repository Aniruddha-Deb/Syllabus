package com.syllabus.core.data.duration;

import java.util.ArrayList;
import java.util.List;

public class Week {

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
