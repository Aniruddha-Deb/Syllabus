package com.syllabus.core.data.duration.session;

import java.util.ArrayList;
import java.util.List;

import com.syllabus.core.data.duration.Period;
import com.syllabus.core.data.study.Exam;

public class SchoolSession extends Session {

	private List<Exam> exams = null;
	
	public SchoolSession( List<Period> periods ) {
		super( periods );
		exams = new ArrayList<>();
	}
	
	public SchoolSession( List<Period> periods, List<Exam> exams ) {
		super( periods );
		this.exams = exams;
	}
	
	public List<Exam> getExams(){
		return exams;
	}
}
