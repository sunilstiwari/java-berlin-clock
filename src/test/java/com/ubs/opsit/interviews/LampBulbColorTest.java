package com.ubs.opsit.interviews;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class LampBulbColorTest {
	
	@Test
	public void testRed(){
		assertEquals("R",LampBulbColor.RED.toString());
	}
	
	@Test
	public void testYellow(){
		assertEquals("Y",LampBulbColor.YELLOW.toString());
	}
	
	@Test
	public void testOff(){
		assertEquals("O",LampBulbColor.OFF.toString());
	}
}