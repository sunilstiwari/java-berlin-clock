package com.ubs.opsit.interviews;

public class TimeConverterBerlinClockImpl implements TimeConverter {

	private BerlinClock berlinClock = new BerlinClock();
	
	@Override
	public String convertTime(String aTime) {
		return berlinClock.convertTime(aTime);
	}
	
}
