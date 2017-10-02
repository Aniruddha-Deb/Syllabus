package com.syllabus.core.data.config;

import java.io.Serializable;
import java.util.List;

import com.syllabus.core.data.duration.Week;
import com.syllabus.core.data.study.Subject;

public class UserConfiguration implements Serializable {

	private static final long serialVersionUID = 3389869426886170532L;
	
	private List<Subject> subjects = null;
	private Week week = null;

	public UserConfiguration( List<Subject> subjects, Week week ) {
		this.subjects = subjects;
		this.week = week;
	}
	
	public List<Subject> getSubjects(){
		return subjects;
	}
	
	public Week getWeek(){
		return week;
	}
}
