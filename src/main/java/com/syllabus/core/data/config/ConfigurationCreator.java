package com.syllabus.core.data.config;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.syllabus.core.data.study.Chapter;
import com.syllabus.core.data.study.Subject;

public class ConfigurationCreator {

	public static void main( String[] args ) throws Exception {
		File inFile = new File( "/Users/Sensei/temp/config_debug.txt" );
//		File outFile = new File( ConfigurationCreator.class.getResource( "com/syllabus/core/data/config/conf.out" ).toString() );
//		if( !outFile.exists() ) {
//			outFile.mkdirs();
//		}
		
		List<Subject> subjects = new ArrayList<>();
		List<Chapter> chapters = new ArrayList<>();
		
		Scanner sc = new Scanner( inFile );
		while( sc.hasNext() ) {
			String next = sc.next();
			if( next.equals( "subjects" ) ) {
				sc.next(); // colon
				while( !(next=sc.next()).equals( ";" ) ) {
					String[] parts = next.split( ":" );
					Subject sub = new Subject( parts[0] );
					subjects.add( sub );
					chapters.add( new Chapter( parts[1], 5 ) );
				}
			}
		}
		
		for( Subject s : subjects ) {
			System.out.println( s.getName() );
		}
		for( Chapter c : chapters ) {
			System.out.println( c.getName() );
		}
	}
}
