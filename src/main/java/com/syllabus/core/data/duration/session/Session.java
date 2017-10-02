package com.syllabus.core.data.duration.session;

import java.time.Duration;
import java.util.List;

import com.syllabus.core.data.duration.Period;

public abstract class Session {

	protected List<Period> periods = null;
	protected Duration totalDuration = null;
	
	protected Session( List<Period> periods ) {
		this.periods = periods;
		computeTotalDuration();
	}
	
	private void computeTotalDuration(){
		totalDuration = Duration.ZERO;
		for( Period p : periods ) {
			totalDuration = totalDuration.plus( p.getDuration() );
		}
	}

	public List<Period> getPeriods(){
		return periods;
	}
	
	public Duration getTotalDuration(){
		return totalDuration;
	}
}
