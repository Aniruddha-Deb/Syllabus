package com.syllabus.core.data;

import org.junit.Before;
import org.junit.Test;

import com.syllabus.core.data.duration.AcademicYear;
import com.syllabus.core.data.duration.Term;

public class DataTest {
	
	private AcademicYear year = null;

	@Before
	public void setUp() throws Exception {
		year = new AcademicYear( "2017-18", new Term( "1" ), new Term( "2" ) );
	}

	@Test
	public void yearTest() {
		// TODO test it.
	}
}
