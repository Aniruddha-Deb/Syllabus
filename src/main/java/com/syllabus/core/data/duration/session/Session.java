package com.syllabus.core.data.duration.session;

import java.time.Duration;
import java.util.List;

import com.syllabus.core.data.duration.Period;

public abstract class Session {

	protected List<Period> periods = null;
	protected Duration totalDuration = null;
	
	protected Session( List<Period> periods, Duration totDuration ) {
		this.periods = periods;
		this.totalDuration = totDuration;
	}
	
	public List<Period> getPeriods(){
		return periods;
	}
	
	public Duration getTotalDuration(){
		return totalDuration;
	}
}
