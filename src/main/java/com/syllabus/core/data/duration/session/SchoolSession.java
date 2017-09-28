package com.syllabus.core.data.duration.session;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import com.syllabus.core.data.duration.Period;
import com.syllabus.core.data.study.Exam;

public class SchoolSession extends Session {

	private List<Exam> exams = null;
	
	public SchoolSession( List<Period> periods, Duration totDuration ) {
		super( periods, totDuration );
		exams = new ArrayList<>();
	}
	
	public SchoolSession( List<Period> periods, List<Exam> exams, Duration totDuration ) {
		super( periods, totDuration );
		this.exams = exams;
	}
	
	public List<Exam> getExams(){
		return exams;
	}
}
