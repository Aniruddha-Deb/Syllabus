package com.syllabus.core.data;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.time.LocalDate;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import com.syllabus.core.data.duration.AcademicYear;
import com.syllabus.core.data.duration.Term;

public class DataTest {
	
	private AcademicYear year = null;
	private Term term1 = null;
	private Term term2 = null;
	
	private static LocalDate term1StartDate = LocalDate.of( 2017, 10, 12 );
	private static LocalDate term1EndDate = LocalDate.of( 2017, 11, 12 );
	private static LocalDate term2StartDate = LocalDate.of( 2017, 11, 13 );
	private static LocalDate term2EndDate = LocalDate.of( 2017, 12, 10 );

	@Before
	public void setUp() throws Exception {
		term1 = new Term( "Term1", term1StartDate, term1EndDate );
		term2 = new Term( "Term2", term2StartDate, term2EndDate );
		year = new AcademicYear( "2017", Arrays.asList( new Term[]{
			term1, term2	
		}) );
	}

	@Test
	public void yearTest() {
		assertThat( year.getName(), is(equalTo( "2017" ) ) );
		assertThat( year.getTerms().get( 0 ), is(equalTo( term1 ) ) );
		assertThat( year.getTerms().get( 1 ), is(equalTo( term2 ) ) );
	}
}
