package com.ubs.opsit.interviews;

import static org.junit.Assert.*;

import org.junit.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.commons.lang3.StringUtils;

public class BerlinClockTest {

	private static final Logger LOG = LoggerFactory.getLogger(BerlinClockTest.class);

	BerlinClock berlinClock;

	private final String SINGLE_DIGIT_HOURS   = "6:00:00";
	private final String SINGLE_DIGIT_MINUTES = "11:6:00";
	private final String SINGLE_DIGIT_SECONDS = "11:20:6";

	private final String MULTI_DIGIT_HOURS   = "115:00:00";
	private final String MULTI_DIGIT_MINUTES = "11:115:00";
	private final String MULTI_DIGIT_SECONDS = "11:20:115";
	
	private final String outOfRangeHours   = "25:00:00";
	private final String outOfRangeMinutes = "11:60:00";
	private final String outOfRangeSeconds = "11:20:60";
	
	private final String negativeHours   = "-11:00:00";
	private final String negativeMinutes = "11:-20:00";
	private final String negativeSeconds = "11:20:-20";

	private final String garbageString = "Some Garbage String which cannot be parsed as time and should throw exception while parsing";

	@Before
	public void setup() {
		berlinClock = new BerlinClock();
		assertNotNull(berlinClock);
		LOG.info("[Before] Berlin clock implementation object created");
	}

	@Test
	public void testNullArgument() {

		String value = null;
		
		try {
			assertEquals("Arguments passed to convertTime method cannot be null",
					berlinClock.convertTime(value));
			Assert.fail("Should thrown an exception. Invalid Time");
		} catch (Exception e) {
			String expectedMessage = StringConstants.ARGUMENT_PASSED_IS_NULL_OR_BLANK;
			Assert.assertEquals("Exception message must be correct", expectedMessage, e.getMessage());
			LOG.info(String.format("Test passed [testNullArgument] : [%s] Value passed [%s]", expectedMessage, value));
		}
	}

	@Test
	public void testBlankArgument() {
		
		String value = StringUtils.EMPTY;

		try {
			assertEquals("Arguments passed to convertTime method cannot be null",
					berlinClock.convertTime(value));
			Assert.fail("Should thrown an exception. Invalid Time");
		} catch (Exception e) {
			String expectedMessage = StringConstants.ARGUMENT_PASSED_IS_NULL_OR_BLANK;
			Assert.assertEquals("Exception message must be correct", expectedMessage, e.getMessage());
			LOG.info(String.format("Test passed [testBlankArgument] : [%s] Value passed [%s]", expectedMessage, value));
		}
	}

	@Test
	public void testSingleDigitHoursArgument() {

		String value = SINGLE_DIGIT_HOURS;

		try {
			assertEquals("Argument passed should be in HH:MM:SS format",
					berlinClock.convertTime(value));
			Assert.fail("Should thrown an exception. Invalid Time");
		} catch (Exception e) {
			String expectedMessage = StringConstants.ARGUMENT_PASSED_IS_IN_INCORRECT_FORMAT;
			Assert.assertEquals("Exception message must be correct", expectedMessage, e.getMessage());
			LOG.info(String.format("Test passed [testSingleDigitHoursArgument] : [%s] Value passed [%s]", expectedMessage, value));
		}
	}

	@Test
	public void testSingleDigitMinutesArgument() {

		String value = SINGLE_DIGIT_MINUTES;

		try {
			assertEquals("Argument passed should be in HH:MM:SS format",
					berlinClock.convertTime(value));
			Assert.fail("Should thrown an exception. Invalid Time");
		} catch (Exception e) {
			String expectedMessage = StringConstants.ARGUMENT_PASSED_IS_IN_INCORRECT_FORMAT;
			Assert.assertEquals("Exception message must be correct", expectedMessage, e.getMessage());
			LOG.info(String.format("Test passed [testSingleDigitMinutesArgument] : [%s] Value passed [%s]", expectedMessage, value));
		}
	}

	@Test
	public void testSingleDigitSecondsArgument() {

		String value = SINGLE_DIGIT_SECONDS;

		try {
			assertEquals("Argument passed should be in HH:MM:SS format",
					berlinClock.convertTime(value));
			Assert.fail("Should thrown an exception. Invalid Time");
		} catch (Exception e) {
			String expectedMessage = StringConstants.ARGUMENT_PASSED_IS_IN_INCORRECT_FORMAT;
			Assert.assertEquals("Exception message must be correct", expectedMessage, e.getMessage());
			LOG.info(String.format("Test passed [testSingleDigitSecondsArgument] : [%s] Value passed [%s]", expectedMessage, value));
		}
	}

	@Test
	public void testMultiDigitHoursArgument() {

		String value = MULTI_DIGIT_HOURS;

		try {
			assertEquals("Argument passed should be in HH:MM:SS format",
					berlinClock.convertTime(value));
			Assert.fail("Should thrown an exception. Invalid Time");
		} catch (Exception e) {
			String expectedMessage = StringConstants.ARGUMENT_PASSED_IS_IN_INCORRECT_FORMAT;
			Assert.assertEquals("Exception message must be correct", expectedMessage, e.getMessage());
			LOG.info(String.format("Test passed [testMultiDigitHoursArgument] : [%s] Value passed [%s]", expectedMessage, value));
		}
	}

	@Test
	public void testMultiDigitMinutesArgument() {

		String value = MULTI_DIGIT_MINUTES;

		try {
			assertEquals("Argument passed should be in HH:MM:SS format",
					berlinClock.convertTime(value));
			Assert.fail("Should thrown an exception. Invalid Time");
		} catch (Exception e) {
			String expectedMessage = StringConstants.ARGUMENT_PASSED_IS_IN_INCORRECT_FORMAT;
			Assert.assertEquals("Exception message must be correct", expectedMessage, e.getMessage());
			LOG.info(String.format("Test passed [testMultiDigitMinutesArgument] : [%s] Value passed [%s]", expectedMessage, value));
		}
	}

	@Test
	public void testMultiDigitSecondsArgument() {

		String value = MULTI_DIGIT_SECONDS;

		try {
			assertEquals("Argument passed should be in HH:MM:SS format",
					berlinClock.convertTime(value));
			Assert.fail("Should thrown an exception. Invalid Time");
		} catch (Exception e) {
			String expectedMessage = StringConstants.ARGUMENT_PASSED_IS_IN_INCORRECT_FORMAT;
			Assert.assertEquals("Exception message must be correct", expectedMessage, e.getMessage());
			LOG.info(String.format("Test passed [testMultiDigitSecondsArgument] : [%s] Value passed [%s]", expectedMessage, value));
		}
	}
	
	@Test
	public void testOutOfRangeHoursArgument(){

		String value = outOfRangeHours;

		try {
		    assertEquals("Hours should be between 0 and 24", berlinClock.convertTime(value));
		    Assert.fail( "Should have thrown an exception" );
		} 
		catch (Exception e) {
		    String expectedMessage = StringConstants.HOURS_SHOULD_BE_WITHIN_ZERO_AND_TWENTY_FOUR;
		    Assert.assertEquals( "Exception message must be correct", expectedMessage, e.getMessage() );
		    LOG.info(String.format("Test passed [testOutOfRangeHoursArgument] : [%s] Value passed [%s]", expectedMessage, value));
		}   
	}
	
	@Test
	public void testOutOfRangeMinutesArgument(){

		String value = outOfRangeMinutes;

		try {
		    assertEquals("Minutes should be between 0 and 59", berlinClock.convertTime(value));
		    Assert.fail( "Should have thrown an exception" );
		} 
		catch (Exception e) {
		    String expectedMessage = StringConstants.MINUTES_SHOULD_BE_WITHIN_ZERO_AND_FIFTY_NINE;
		    Assert.assertEquals( "Exception message must be correct", expectedMessage, e.getMessage() );
		    LOG.info(String.format("Test passed [testOutOfRangeMinutesArgument] : [%s] Value passed [%s]", expectedMessage, value));
		}   
	}
	
	@Test
	public void testOutOfRangeSecondsArgument(){

		String value = outOfRangeSeconds;

		try {
		    assertEquals("Seconds should be between 0 and 59", berlinClock.convertTime(value));
		    Assert.fail( "Should have thrown an exception" );
		} 
		catch (Exception e) {
		    String expectedMessage = StringConstants.SECONDS_SHOULD_BE_WITHIN_ZERO_AND_FIFTY_NINE;
		    Assert.assertEquals( "Exception message must be correct", expectedMessage, e.getMessage() );
		    LOG.info(String.format("Test passed [testOutOfRangeSecondsArgument] : [%s] Value passed [%s]", expectedMessage, value));
		}   
	}
	
	@Test
	public void testNegativeHoursArgument(){

		String value = negativeHours;

		try {
		    assertEquals("Hours should be between 0 and 24", berlinClock.convertTime(value));
		    Assert.fail( "Should have thrown an exception" );
		} 
		catch (Exception e) {
		    String expectedMessage = StringConstants.ARGUMENT_PASSED_IS_IN_INCORRECT_FORMAT;
		    Assert.assertEquals( "Exception message must be correct", expectedMessage, e.getMessage() );
		    LOG.info(String.format("Test passed [testNegativeHoursArgument] : [%s] Value passed [%s]", expectedMessage, value));
		}   
	}
	
	@Test
	public void testNegativeMinutesArgument(){

		String value = negativeMinutes;

		try {
		    assertEquals("Minutes should be between 0 and 59", berlinClock.convertTime(value));
		    Assert.fail( "Should have thrown an exception" );
		} 
		catch (Exception e) {
		    String expectedMessage = StringConstants.ARGUMENT_PASSED_IS_IN_INCORRECT_FORMAT;
		    Assert.assertEquals( "Exception message must be correct", expectedMessage, e.getMessage() );
		    LOG.info(String.format("Test passed [testNegativeMinutesArgument] : [%s] Value passed [%s]", expectedMessage, value));
		}   
	}
	
	@Test
	public void testNegativeSecondsArgument(){

		String value = negativeSeconds;

		try {
		    assertEquals("Seconds should be between 0 and 59", berlinClock.convertTime(value));
		    Assert.fail( "Should have thrown an exception" );
		} 
		catch (Exception e) {
		    String expectedMessage = StringConstants.ARGUMENT_PASSED_IS_IN_INCORRECT_FORMAT;
		    Assert.assertEquals( "Exception message must be correct", expectedMessage, e.getMessage() );
		    LOG.info(String.format("Test passed [testNegativeSecondsArgument] : [%s] Value passed [%s]", expectedMessage, value));
		}   
	}
	
	@Test
	public void testGarbageStringArgument(){
		
		String value = garbageString;
		
		try {
		    assertEquals("argument passed to convertTime method should be in HH:MM:SS format", berlinClock.convertTime(value));
		    Assert.fail( "Should have thrown an exception" );
		} 
		catch (Exception e) {
		    String expectedMessage = StringConstants.ARGUMENT_PASSED_IS_IN_INCORRECT_FORMAT;
		    Assert.assertEquals( "Exception message must be correct", expectedMessage, e.getMessage() );
		    LOG.info(String.format("Test passed [testGarbageStringArgument] : [%s] Value passed [%s]", expectedMessage, value));
		}   
	}
	
	// Let start testing some positive scenarios now.
	
	
	@Test
	public void testValidTimeArgumentsZeroHour(){
		
		String value = StringConstants.ZERO_HOUR;
		
		try {
			assertEquals(StringConstants.ZERO_HOUR,   StringConstants.ZERO_HOUR_BERLIN_CLOCK_TIME, berlinClock.convertTime(value));
		    LOG.info(String.format("Test passed [testValidTimeArgumentsZeroHour] : Value passed [%s]", value));
		}
		catch (Exception e) {
			 Assert.fail(String.format("Test failed [testValidTimeArgumentsZeroHour] : Value passed [%s]", value));
		}   
	}
	
	@Test
	public void testValidTimeArgumentsZeroHourOneMinuteZeroSecond(){
		
		String value = StringConstants.ZERO_HOUR_ONE_MINUTE_ZERO_SECOND;
		
		try {
			assertEquals(StringConstants.ZERO_HOUR_ONE_MINUTE_ZERO_SECOND,   StringConstants.ZERO_HOUR_ONE_MINUTE_ZERO_SECOND_BERLIN_CLOCK_TIME, berlinClock.convertTime(value));
		    LOG.info(String.format("Test passed [testValidTimeArgumentsZeroHourOneMinuteZeroSecond] : Value passed [%s]", value));
		}
		catch (Exception e) {
			 Assert.fail(String.format("Test failed [testValidTimeArgumentsZeroHourOneMinuteZeroSecond] : Value passed [%s]", value));
		}   
	}
	
	@Test
	public void testValidTimeArgumentsTwentyFourHours(){
		
		String value = StringConstants.TWENTY_FOUR_HOURS;
		
		try {
			assertEquals(StringConstants.TWENTY_FOUR_HOURS,   StringConstants.TWENTY_FOUR_HOURS_BERLIN_CLOCK_TIME, berlinClock.convertTime(value));
		    LOG.info(String.format("Test passed [testValidTimeArgumentsTwentyFourHours] : Value passed [%s]", value));
		}
		catch (Exception e) {
			 Assert.fail(String.format("Test failed [testValidTimeArgumentsTwentyFourHours] : Value passed [%s]", value));
		}   
	}
	
	@Test
	public void testValidTimeArgumentsTenHoursTenMinutes(){
		
		String value = StringConstants.TEN_HOURS_TEN_MINUTES;
		
		try {
			assertEquals(StringConstants.TEN_HOURS_TEN_MINUTES,   StringConstants.TEN_HOURS_TEN_MINUTES_BERLIN_CLOCK_TIME, berlinClock.convertTime(value));
		    LOG.info(String.format("Test passed [testValidTimeArgumentsTenHoursTenMinutes] : Value passed [%s]", value));
		}
		catch (Exception e) {
			 Assert.fail(String.format("Test failed [testValidTimeArgumentsTenHoursTenMinutes] : Value passed [%s]", value));
		}   
	}
	
	@Test
	public void testValidTimeArgumentsTwentyThreeHoursFiftyNineMinutesFiftyNineSeconds(){
		
		String value = StringConstants.TWENTY_THREE_HOURS_FIFTY_NINE_MINUTES_FIFTY_NINE_SECONDS;
		
		try {
			assertEquals(StringConstants.TWENTY_THREE_HOURS_FIFTY_NINE_MINUTES_FIFTY_NINE_SECONDS,   StringConstants.TWENTY_THREE_HOURS_FIFTY_NINE_MINUTES_FIFTY_NINE_SECONDS_BERLIN_CLOCK_TIME, berlinClock.convertTime(value));
		    LOG.info(String.format("Test passed [testValidTimeArgumentsTwentyThreeHoursFiftyNineMinutesFiftyNineSeconds] : Value passed [%s]", value));
		}
		catch (Exception e) {
			 Assert.fail(String.format("Test failed [testValidTimeArgumentsTwentyThreeHoursFiftyNineMinutesFiftyNineSeconds] : Value passed [%s]", value));
		}   
	}
	
	@After
	public void destroy() {
		berlinClock = null;
		assertNull(berlinClock);
		LOG.info("[After] Berlin clock implementation object dereferenced\n");
	}

}
