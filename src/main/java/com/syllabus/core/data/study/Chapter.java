package com.syllabus.core.data.study;

public class Chapter {

	private String name = null;
	private int numParts = -1;
	private double schoolProgress = -1;
	private double homeProgress = -1;

	public Chapter( String name, int numParts ) {
		this.name = name;
		this.numParts = numParts;
		this.schoolProgress = 0;
		this.homeProgress = 0;
	}

	public String getName(){
		return name;
	}
	
	public int getNumParts(){
		return numParts;
	}
	
	public double getSchoolProgress(){
		return schoolProgress;
	}
	
	public double getHomeProgress(){
		return homeProgress;
	}
	
	public void updateHomeProgress( int parts ) {
		homeProgress += ((1/numParts) * parts);
		if( homeProgress > 1 || homeProgress < 0 ) {
			throw new IllegalArgumentException( "Home progress out of bounds" );
		}
	}
	
	public void updateSchoolProgress( int parts ) {
		schoolProgress += ((1/numParts) * parts);
		if( schoolProgress > 1 || schoolProgress < 0 ) {
			throw new IllegalArgumentException( "School progress out of bounds" );
		}
	}

}
