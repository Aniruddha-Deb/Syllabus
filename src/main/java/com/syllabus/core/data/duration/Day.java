package com.syllabus.core.data.duration;

import java.io.Serializable;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.syllabus.core.data.duration.session.Session;
import com.syllabus.core.data.study.Exam;

public class Day implements Serializable{

	private static final long serialVersionUID = 683318425238531506L;
	
	private LocalDate date = null;
	private DayOfWeek dayOfWeek = null;
	private List<Session> sessions = null;
	private List<Exam> exams = null;
	
	public Day( LocalDate d, List<Session> sessions ) {
		date = d;
		dayOfWeek = d.getDayOfWeek();
		this.sessions = sessions;
		this.exams = new ArrayList<>();
	}
	
	public Day( DayOfWeek d ) {
		dayOfWeek = d;
		date = null;
		this.sessions = new ArrayList<>();
		this.exams = new ArrayList<>();
	}
	
	public Day( LocalDate d, List<Session> sessions, List<Exam> exams ) {
		date = d;		
		dayOfWeek = d.getDayOfWeek();
		this.sessions = sessions;
		this.exams = exams;		
	}
	
	public Day( LocalDate d ) {
		date = d;		
		dayOfWeek = d.getDayOfWeek();
		sessions = new ArrayList<>();
		exams = new ArrayList<>();
	}
	
	public LocalDate getDate(){
		return date;
	}
	
	public DayOfWeek getDayOfWeek(){
		return dayOfWeek;
	}
	
	public List<Session> getSessions(){
		return sessions;
	}
	
	public List<Exam> getExams(){
		return exams;
	}
}
