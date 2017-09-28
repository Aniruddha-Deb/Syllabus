package com.syllabus.core.data.duration.session;

import java.time.Duration;
import java.util.List;

import com.syllabus.core.data.duration.Period;

public class HomeSession extends Session {

	protected HomeSession( List<Period> periods, Duration totDuration ) {
		super( periods, totDuration );
	}
}
