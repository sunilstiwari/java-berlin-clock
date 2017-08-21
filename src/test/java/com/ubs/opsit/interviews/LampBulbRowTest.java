package com.ubs.opsit.interviews;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LampBulbRowTest {
	
	private LampBulbRow evenSecondsLampBulbRow;
	private LampBulbRow fiveHoursLampBulbRow;
	private LampBulbRow oneHourLampBulbRow;
	private LampBulbRow fiveMinutesLampBulbRow;
	private LampBulbRow oneMinuteLampBulbRow;
	
	@Before
	public void setup(){
		this.evenSecondsLampBulbRow = new LampBulbRow(1,  LampBulbColor.YELLOW);
		this.fiveHoursLampBulbRow   = new LampBulbRow(4,  LampBulbColor.RED);
		this.oneHourLampBulbRow     = new LampBulbRow(4,  LampBulbColor.RED);
		this.fiveMinutesLampBulbRow = new LampBulbRow(11, LampBulbColor.YELLOW);
		this.oneMinuteLampBulbRow   = new LampBulbRow(4,  LampBulbColor.YELLOW);
		
		// The five Minutes LampBulb Row has 3 RED colored bulb for 3rd, 6th and 9th Lamps.
		fiveMinutesLampBulbRow.setColor(StringConstants.THIRD_LAMPBULB_IN_FIVE_MINUTES_LAMPBULBROW, LampBulbColor.RED);
		fiveMinutesLampBulbRow.setColor(StringConstants.SIXTH_LAMPBULB_IN_FIVE_MINUTES_LAMPBULBROW, LampBulbColor.RED);
		fiveMinutesLampBulbRow.setColor(StringConstants.NINTH_LAMPBULB_IN_FIVE_MINUTES_LAMPBULBROW, LampBulbColor.RED);	
	}
	
	@Test
	public void testLampCounts(){
		assertEquals("There should be only 1 seconds bulb",   1, evenSecondsLampBulbRow.getLamps().size());
		assertEquals("There should be only 4 seconds bulb",   4, fiveHoursLampBulbRow.getLamps().size());
		assertEquals("There should be only 4 seconds bulb",   4, oneHourLampBulbRow.getLamps().size());
		assertEquals("There should be only 11 seconds bulb", 11, fiveMinutesLampBulbRow.getLamps().size());
		assertEquals("There should be only 4 seconds bulb",   4, oneMinuteLampBulbRow.getLamps().size());
	}
	
	@Test
	public void testSetLampSwitchedState(){

		assertEquals("There should be all black color in the fiveMinutesLampBulbRow before switching on", StringConstants.ALL_BLACK_MINUTES_BERLIN_CLOCK, fiveMinutesLampBulbRow.toString());
		
		fiveMinutesLampBulbRow.switchOn(1);
		assertEquals("There should be 1 Yellow and all black color in the fiveMinutesLampBulbRow when switching on 1st bulb", StringConstants.FIVE_MINUTES_BERLIN_CLOCK, fiveMinutesLampBulbRow.toString());

		fiveMinutesLampBulbRow.resetSwitchToOff();
		assertEquals("There should be all black color in the fiveMinutesLampBulbRow as we reset the switches", StringConstants.ALL_BLACK_MINUTES_BERLIN_CLOCK, fiveMinutesLampBulbRow.toString());
		
		fiveMinutesLampBulbRow.switchOn(3);
		assertEquals("There should be 2 Yellow, 1 Red and all black color in the fiveMinutesLampBulbRow when switching on 1st bulb", StringConstants.FIFTEEN_MINUTES_BERLIN_CLOCK, fiveMinutesLampBulbRow.toString());

		fiveMinutesLampBulbRow.switchOn(6);
		assertEquals("There should be (2 Yellow, 1 Red),(2 Yellow, 1 Red), 5 Blacks when switching on 6th bulb", StringConstants.THIRTY_MINUTES_BERLIN_CLOCK, fiveMinutesLampBulbRow.toString());
		
		fiveMinutesLampBulbRow.switchOn(9);
		assertEquals("There should be (2 Yellow, 1 Red),(2 Yellow, 1 Red),(2 Yellow, 1 Red),2 Blacks when switching on 9th bulb", StringConstants.FORTY_FIVE_MINUTES_BERLIN_CLOCK, fiveMinutesLampBulbRow.toString());
		
		fiveMinutesLampBulbRow.switchOn(11);
		assertEquals("There should be (2 Yellow, 1 Red),(2 Yellow, 1 Red),(2 Yellow, 1 Red),2 Yellow when switching on 11th bulb", StringConstants.FIFTY_FIVE_MINUTES_BERLIN_CLOCK, fiveMinutesLampBulbRow.toString());
	}
	
	@After
	public void tearDown(){
		this.evenSecondsLampBulbRow = null;
		this.fiveHoursLampBulbRow   = null;
		this.oneHourLampBulbRow     = null;
		this.fiveMinutesLampBulbRow = null;
		this.oneMinuteLampBulbRow   = null;
	}
}
