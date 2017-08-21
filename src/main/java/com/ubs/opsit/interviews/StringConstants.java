package com.ubs.opsit.interviews;

public class StringConstants {
	
	protected static final String ARGUMENT_PASSED_IS_NULL_OR_BLANK       = "Argument passed is null or blank";
	protected static final String ARGUMENT_PASSED_IS_IN_INCORRECT_FORMAT = "Argument passed should be in HH:MM:SS format";
	
	public static final String VALID_TIME_REGEX = "^(\\d{2}:\\d{2}:\\d{2})$";

	public static final int ZERO        = 0;
	public static final int FIFTY_NINE  = 59;
	public static final int TWENTY_FOUR = 24;
	
	public static final String SECONDS_SHOULD_BE_WITHIN_ZERO_AND_FIFTY_NINE = "Seconds should be between 00 and 59";
	public static final String MINUTES_SHOULD_BE_WITHIN_ZERO_AND_FIFTY_NINE = "Minutes should be between 00 and 59";
	public static final String HOURS_SHOULD_BE_WITHIN_ZERO_AND_TWENTY_FOUR  = "Hours should be between 00 and 24";
	public static final String TWENTY_FOUR_HOURS_SHOULD_BE_24_00_00         = "24h Hours should be 24:00:00";
	
	public static final int FIVE_HOURS   = 5;
	public static final int FIVE_MINUTES = 5;

	// Assuming bulb colors here as: Y = Yellow, R = Red, O = Not lit 
	
	public static final String CANNOT_SET_COLOR       = "Cannot set the color of lamp bulb which is not present in the row!";
	public static final String LAMP_BULB_OUT_OF_RANGE = "Number of LampBulbs to be lit should be in range";
	
	public static final String ZERO_HOUR 					=  "00:00:00";
	public static final String ZERO_HOUR_BERLIN_CLOCK_TIME 	= 	"Y"           + System.getProperty("line.separator")+
																"OOOO"        + System.getProperty("line.separator")+
																"OOOO"        + System.getProperty("line.separator")+
																"OOOOOOOOOOO" + System.getProperty("line.separator")+
																"OOOO";
	
	
	public static final String ZERO_HOUR_ONE_MINUTE_ZERO_SECOND 					= 	"00:01:00";
	public static final String ZERO_HOUR_ONE_MINUTE_ZERO_SECOND_BERLIN_CLOCK_TIME 	= 	"Y"           + System.getProperty("line.separator")+
																						"OOOO"        + System.getProperty("line.separator")+
																						"OOOO"        + System.getProperty("line.separator")+
																						"OOOOOOOOOOO" + System.getProperty("line.separator")+
																						"YOOO";
	
	
	public static final String TWENTY_FOUR_HOURS 					=  "24:00:00";
	public static final String TWENTY_FOUR_HOURS_BERLIN_CLOCK_TIME  = 	"Y"            + System.getProperty("line.separator")+
																		"RRRR"         + System.getProperty("line.separator")+
																		"RRRR"         + System.getProperty("line.separator")+
																		"OOOOOOOOOOO"  + System.getProperty("line.separator")+
																		"OOOO";
	
	public static final String TEN_HOURS_TEN_MINUTES                   =  	"10:10:00";
	public static final String TEN_HOURS_TEN_MINUTES_BERLIN_CLOCK_TIME = 	"Y"           + System.getProperty("line.separator")+
																			"RROO"        + System.getProperty("line.separator")+
																			"OOOO"        + System.getProperty("line.separator")+
																			"YYOOOOOOOOO" + System.getProperty("line.separator")+
																			"OOOO";
	
	
	
	public static final String TWENTY_THREE_HOURS_FIFTY_NINE_MINUTES_FIFTY_NINE_SECONDS					  =  	"23:59:59";
	public static final String TWENTY_THREE_HOURS_FIFTY_NINE_MINUTES_FIFTY_NINE_SECONDS_BERLIN_CLOCK_TIME = 	"O"           + System.getProperty("line.separator")+
																												"RRRR"        + System.getProperty("line.separator")+
																												"RRRO"        + System.getProperty("line.separator")+
																												"YYRYYRYYRYY" + System.getProperty("line.separator")+
																												"YYYY";
	
	
	public static final String ALL_BLACK_MINUTES_BERLIN_CLOCK  = "OOOOOOOOOOO";
	public static final String FIVE_MINUTES_BERLIN_CLOCK       = "YOOOOOOOOOO";
	public static final String FIFTEEN_MINUTES_BERLIN_CLOCK    = "YYROOOOOOOO";
	public static final String THIRTY_MINUTES_BERLIN_CLOCK     = "YYRYYROOOOO";
	public static final String FORTY_FIVE_MINUTES_BERLIN_CLOCK = "YYRYYRYYROO";
	public static final String FIFTY_FIVE_MINUTES_BERLIN_CLOCK = "YYRYYRYYRYY";
	
	
	// Array index starts with zero.
	public static final int THIRD_LAMPBULB_IN_FIVE_MINUTES_LAMPBULBROW = 2;
	public static final int SIXTH_LAMPBULB_IN_FIVE_MINUTES_LAMPBULBROW = 5;
	public static final int NINTH_LAMPBULB_IN_FIVE_MINUTES_LAMPBULBROW = 8;

}
