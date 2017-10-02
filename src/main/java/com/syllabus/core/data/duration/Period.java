package com.syllabus.core.data.duration;

import java.time.Duration;

import com.syllabus.core.data.study.Chapter;
import com.syllabus.core.data.study.Subject;

public class Period {

	private Chapter chapter = null;
	private Subject subject = null;
	private Duration duration = null;
	
	public Period( Subject subject, Chapter chapter, Duration duration ) {
		this.subject = subject;
		this.chapter = chapter;
		this.duration = duration;
	}
	
	public Subject getSubject(){
		return subject;
	}
	
	public Chapter getChapter(){
		return chapter;
	}
	
	public Duration getDuration(){
		return duration;
	}
}
