package com.syllabus.core.data.duration.term;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.syllabus.core.data.duration.Day;
import com.syllabus.core.data.duration.Week;

public class TermFactory {

	public static Term createTerm( String name, LocalDate startDate, LocalDate endDate ) {
		List<Week> weeks = new ArrayList<>();
		while( !startDate.isAfter( endDate ) ) {
			Week w = new Week();
			int numDays = DayOfWeek.SUNDAY.ordinal() - startDate.getDayOfWeek().ordinal();
			for( int i=0; i<=numDays && !startDate.isAfter( endDate ); i++ ) {
				w.getDays().add( new Day( startDate ) );
				startDate = startDate.plusDays( 1 );
			}
			weeks.add( w );
		}
		return new Term( name, weeks );
	}
}
