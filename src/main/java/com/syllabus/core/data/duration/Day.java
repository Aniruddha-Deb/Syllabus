package com.syllabus.core.data.duration;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.syllabus.core.data.duration.session.Session;
import com.syllabus.core.data.study.Exam;

public class Day {

	private LocalDate date = null;
	private List<Session> sessions = null;
	private List<Exam> exams = null;
	
	public Day( LocalDate d, List<Session> sessions ) {
		date = d;		
		this.sessions = sessions;
		this.exams = new ArrayList<>();
	}
	
	public Day( LocalDate d, List<Session> sessions, List<Exam> exams ) {
		date = d;		
		this.sessions = sessions;
		this.exams = exams;		
	}
	
	public Day( LocalDate d ) {
		date = d;		
		sessions = new ArrayList<>();
		exams = new ArrayList<>();
	}
	
	public LocalDate getDate(){
		return date;
	}
	
	public List<Session> getSessions(){
		return sessions;
	}
	
	public List<Exam> getExams(){
		return exams;
	}
}
