package com.ubs.opsit.interviews;

import org.apache.commons.lang3.StringUtils;


/**
 * This class is an implementation of TimeConverter and provides implementation for Berlin Clock
 *
 */

public class BerlinClock implements TimeConverter {

	private LampBulbRow oddEvenSecondsLampBulbRow;
	private LampBulbRow fiveHoursLampBulbRow;
	private LampBulbRow oneHourLampBulbRow;
	private LampBulbRow fiveMinutesLampBulbRow;
	private LampBulbRow oneMinuteLampBulbRow;

	public BerlinClock() {
		// Structure of the Berlin Clock
		this.oddEvenSecondsLampBulbRow   = new LampBulbRow(1, LampBulbColor.YELLOW);
		this.fiveHoursLampBulbRow        = new LampBulbRow(4, LampBulbColor.RED);
		this.oneHourLampBulbRow          = new LampBulbRow(4, LampBulbColor.RED);
		this.fiveMinutesLampBulbRow      = new LampBulbRow(11, LampBulbColor.YELLOW);
		this.oneMinuteLampBulbRow        = new LampBulbRow(4, LampBulbColor.YELLOW);

		// The five Minutes LampBulb Row has 3 RED colored bulb for 3rd, 6th and 9th Lamps.
		fiveMinutesLampBulbRow.setColor(StringConstants.THIRD_LAMPBULB_IN_FIVE_MINUTES_LAMPBULBROW, LampBulbColor.RED);
		fiveMinutesLampBulbRow.setColor(StringConstants.SIXTH_LAMPBULB_IN_FIVE_MINUTES_LAMPBULBROW, LampBulbColor.RED);
		fiveMinutesLampBulbRow.setColor(StringConstants.NINTH_LAMPBULB_IN_FIVE_MINUTES_LAMPBULBROW, LampBulbColor.RED);
	}

	private BerlinClock setHours(int hours) {

		int fiveHours      = hours / StringConstants.FIVE_HOURS;
		int remainingHours = hours % StringConstants.FIVE_HOURS;

		fiveHoursLampBulbRow.switchOn(fiveHours);
		oneHourLampBulbRow.switchOn(remainingHours);

		return this;
	}

	private BerlinClock setMinutes(int minutes) {
		int fiveMinutes      = minutes / StringConstants.FIVE_MINUTES;
		int remainingMinutes = minutes % StringConstants.FIVE_MINUTES;

		fiveMinutesLampBulbRow.switchOn(fiveMinutes);
		oneMinuteLampBulbRow.switchOn(remainingMinutes);

		return this;
	}

	// Assuming the seconds bulb is lit for odd seconds and is off for even seconds
	private BerlinClock setSeconds(int seconds) {
		
		if (seconds % 2 == 0) {
			oddEvenSecondsLampBulbRow.getLamps().get(0).switchOn();
		} else {
			oddEvenSecondsLampBulbRow.getLamps().get(0).switchOff();
		}

		return this;
	}

	private void validate(int hours, int minutes, int seconds){
		
		if(seconds < StringConstants.ZERO || seconds > StringConstants.FIFTY_NINE)
			throw new IllegalArgumentException(StringConstants.SECONDS_SHOULD_BE_WITHIN_ZERO_AND_FIFTY_NINE);
		
		if(minutes < StringConstants.ZERO || minutes > StringConstants.FIFTY_NINE)
			throw new IllegalArgumentException(StringConstants.MINUTES_SHOULD_BE_WITHIN_ZERO_AND_FIFTY_NINE);
		
		if( (hours==StringConstants.TWENTY_FOUR) && ((seconds > StringConstants.ZERO || minutes > StringConstants.ZERO)))
				throw new IllegalArgumentException(StringConstants.TWENTY_FOUR_HOURS_SHOULD_BE_24_00_00);
		else 
			if(hours < StringConstants.ZERO || hours > StringConstants.TWENTY_FOUR)
				throw new IllegalArgumentException(StringConstants.HOURS_SHOULD_BE_WITHIN_ZERO_AND_TWENTY_FOUR);
	}
	
	@Override
	public String convertTime(String aTime) {
		if (aTime == null || aTime.isEmpty()) {
			throw new IllegalArgumentException(StringConstants.ARGUMENT_PASSED_IS_NULL_OR_BLANK);
		}

		if (!aTime.matches(StringConstants.VALID_TIME_REGEX))
			throw new IllegalArgumentException(StringConstants.ARGUMENT_PASSED_IS_IN_INCORRECT_FORMAT);

		int hours = 0, minutes = 0, seconds = 0;

		try {
			String[] split = aTime.split(":", 3);

			hours = Integer.valueOf(split[0]);
			minutes = Integer.valueOf(split[1]);
			seconds = Integer.valueOf(split[2]);

		} catch (NumberFormatException numberFormatException) {
			System.out.println("Please provide time in 24 hours hh:mm:ss clock format");
			throw numberFormatException;
		}

		// Validate the input time
		validate(hours, minutes, seconds);

		// Once validated set the timing to the clock as per parsed hour, minutes and seconds
		this.setHours(hours).setMinutes(minutes).setSeconds(seconds);

		return this.toBerlinClockTimeString();
	}
	
	public String toBerlinClockTimeString(){
		
		StringBuilder stringBuilder = new StringBuilder();
		
		// Append the state(s) of the structure
		stringBuilder.append(oddEvenSecondsLampBulbRow).append(System.getProperty("line.separator"));
		stringBuilder.append(fiveHoursLampBulbRow).append(System.getProperty("line.separator"));
		stringBuilder.append(oneHourLampBulbRow).append(System.getProperty("line.separator"));
		stringBuilder.append(fiveMinutesLampBulbRow).append(System.getProperty("line.separator"));
		stringBuilder.append(oneMinuteLampBulbRow);
		
		return stringBuilder.toString();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BerlinClock [oddEvenSecondsLampBulbRow=").append(oddEvenSecondsLampBulbRow)
				.append(", fiveHoursLampBulbRow=").append(fiveHoursLampBulbRow).append(", oneHourLampBulbRow=")
				.append(oneHourLampBulbRow).append(", fiveMinutesLampBulbRow=").append(fiveMinutesLampBulbRow)
				.append(", oneMinuteLampBulbRow=").append(oneMinuteLampBulbRow).append("]");
		return builder.toString();
	}
	
	

}
