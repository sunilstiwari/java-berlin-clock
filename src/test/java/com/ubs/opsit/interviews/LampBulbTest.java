package com.ubs.opsit.interviews;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LampBulbTest {
	
	private LampBulb lambBulbRedColor;
	private LampBulb lambBulbYellowColor;

	@Before
	public void setup(){
		lambBulbRedColor = new LampBulb(LampBulbColor.RED);
		lambBulbYellowColor = new LampBulb(LampBulbColor.YELLOW);
	}
	
	@After
	public void tearDown(){
		lambBulbRedColor = null;
		lambBulbYellowColor = null;
	}
	
	@Test
	public void testState(){
		lambBulbRedColor.switchOn();
		assertEquals("Red lamb when switched on should be red colored",LampBulbColor.RED.toString(), lambBulbRedColor.toString());
		assertEquals("Red lamb when switched on should have switched on state", Boolean.TRUE, lambBulbRedColor.isSwitchedOn());

		lambBulbRedColor.switchOff();
		assertEquals("Red lamb when switched off should be black colored",LampBulbColor.OFF.toString(), lambBulbRedColor.toString());
		assertEquals("Red lamb when switched off should have switched off state", Boolean.FALSE, lambBulbRedColor.isSwitchedOn());

		lambBulbYellowColor.switchOn();
		assertEquals("Yellow lamb when switched on should be yellow colored",LampBulbColor.YELLOW.toString(), lambBulbYellowColor.toString());
		assertEquals("Yellow lamb when switched on should have switched on state", Boolean.TRUE, lambBulbYellowColor.isSwitchedOn());

		lambBulbYellowColor.switchOff();
		assertEquals("Yellow lamb when switched off should be black colored",LampBulbColor.OFF.toString(), lambBulbYellowColor.toString());
		assertEquals("Yellow lamb when switched off should have switched off state", Boolean.FALSE, lambBulbYellowColor.isSwitchedOn());
	}
	
}
