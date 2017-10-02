package com.syllabus.core.data.study;

import java.io.Serializable;
import java.util.List;

public class Syllabus implements Serializable{

	private static final long serialVersionUID = -4811434487963738829L;
	
	private List<Chapter> chapters = null;

	public Syllabus( List<Chapter> chapters ) {
		this.chapters = chapters;
	}
	
	public List<Chapter> getChapters(){
		return chapters;
	}
}
