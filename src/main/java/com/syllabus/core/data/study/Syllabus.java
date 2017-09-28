package com.syllabus.core.data.study;

import java.util.List;

public class Syllabus {

	private List<Chapter> chapters = null;

	public Syllabus( List<Chapter> chapters ) {
		this.chapters = chapters;
	}
	
	public List<Chapter> getChapters(){
		return chapters;
	}
}
