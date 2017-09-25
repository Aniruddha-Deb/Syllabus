package com.syllabus.core.data.duration;

import java.time.Month;

import com.syllabus.core.data.duration.session.HomeSession;
import com.syllabus.core.data.duration.session.SchoolSession;

public class Day {

	private Month month = null;
	private int day = -1;
	
	private SchoolSession schoolSession = null;
	private HomeSession homeSession = null;
}
