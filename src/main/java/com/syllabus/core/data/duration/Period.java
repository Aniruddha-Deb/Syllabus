package com.syllabus.core.data.duration;

import java.time.Duration;

import com.syllabus.core.data.study.Chapter;

public class Period {

	private Chapter chapter = null;
	private Duration duration = null;
	
	public Period( Chapter chapter, Duration duration ) {
		this.chapter = chapter;
		this.duration = duration;
	}
	
	public Chapter getChapter(){
		return chapter;
	}
	
	public Duration getDuration(){
		return duration;
	}
}
