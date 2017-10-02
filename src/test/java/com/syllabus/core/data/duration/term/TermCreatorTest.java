package com.syllabus.core.data.duration.term;

import java.time.LocalDate;

import com.syllabus.core.data.duration.Day;
import com.syllabus.core.data.duration.Week;

public class TermCreatorTest {

	public static void main( String[] args ){
		Term t = TermFactory.createTerm( "Term 1", LocalDate.of( 2017, 10, 10 ),
												   LocalDate.of( 2017, 12, 25 ) );
		System.out.println( "Made term" );
		for( Week w : t.getWeeks() ) {
			for( Day d : w.getDays() ) {
				System.out.println( d.getDate().toString() );
			}
		}
	}

}
