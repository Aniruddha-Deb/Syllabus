package com.syllabus.core.data;

import java.time.DayOfWeek;
import java.time.Duration;

import org.junit.Before;
import org.junit.Test;

import com.syllabus.core.data.duration.*;
import com.syllabus.core.data.study.*;
import com.syllabus.core.data.duration.term.*;

public class DataTest {
	
	private AcademicYear year = new AcademicYear( "2017-18" );
	
	private Term term1 = null;
	private Term term2 = null;
	private Term term3 = null;
	
	private Week schedule = new Week();
	
	private Day monday    = new Day( DayOfWeek.MONDAY );
	private Day tuesday   = new Day( DayOfWeek.TUESDAY );
	private Day wednesday = new Day( DayOfWeek.WEDNESDAY );
	private Day thursday  = new Day( DayOfWeek.THURSDAY );
	private Day friday    = new Day( DayOfWeek.FRIDAY );
	private Day saturday  = new Day( DayOfWeek.SATURDAY );
	private Day sunday    = new Day( DayOfWeek.SUNDAY );
	
	private Subject biology     = new Subject( "Biology" );
	private Subject physics     = new Subject( "Physics" );
	private Subject chemistry   = new Subject( "Chemistry" );
	private Subject mathematics = new Subject( "Mathematics" );
	private Subject hindi       = new Subject( "Hindi" );
	private Subject literature  = new Subject( "Literature" );
	private Subject language    = new Subject( "Language" );
	private Subject computers   = new Subject( "Computers" );
	private Subject geography   = new Subject( "Geography" );
	private Subject history     = new Subject( "History" );	
	
	private Chapter repSystem     = new Chapter( "repSystem", 10 );              
	private Chapter calorimetry   = new Chapter( "calorimetry", 10 );              
	private Chapter metallurgy    = new Chapter( "metallurgy", 10 );              
	private Chapter circles       = new Chapter( "circles", 10 );          
	private Chapter doKalakaar    = new Chapter( "doKalakaar", 10 );              
	private Chapter movAct5Scene1 = new Chapter( "movAct5Scene1", 10 );                  
	private Chapter chapter8      = new Chapter( "chapter8", 10 );              
	private Chapter scanner       = new Chapter( "scanner", 10 );          
	private Chapter transport     = new Chapter( "transport", 10 );              
	private Chapter independence  = new Chapter( "independence", 10 );                  

	private Period bioPeriod   = new Period( biology, repSystem, Duration.ofMinutes( 35 ) );
	private Period phyPeriod   = new Period( physics, calorimetry, Duration.ofMinutes( 35 ) );
	private Period chemPeriod  = new Period( chemistry, metallurgy, Duration.ofMinutes( 35 ) ) ;
	private Period mathsPeriod = new Period( mathematics, circles, Duration.ofMinutes( 35 ) )  ;
	private Period hindiPeriod = new Period( hindi, doKalakaar, Duration.ofMinutes( 35 ) )  ;
	private Period litPeriod   = new Period( literature, movAct5Scene1, Duration.ofMinutes( 35 ) );
	private Period langPeriod  = new Period( language, chapter8, Duration.ofMinutes( 35 ) ) ;
	private Period compPeriod  = new Period( computers, scanner, Duration.ofMinutes( 35 ) ) ;
	private Period geogPeriod  = new Period( geography, transport, Duration.ofMinutes( 35 ) ) ;
	private Period histPeriod  = new Period( history, independence, Duration.ofMinutes( 35 ) ) ;
		
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void yearTest() {
	}
}
