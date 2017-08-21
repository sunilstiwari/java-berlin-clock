package com.ubs.opsit.interviews;

import java.util.ArrayList;
import java.util.List;

public class LampBulbRow {
	
	private List<LampBulb> lampBulbs;
	
	public LampBulbRow(int numberOfBulbs, LampBulbColor color){
		this.lampBulbs = new ArrayList<>();
		
		for(int i=0; i< numberOfBulbs ; i++){
			lampBulbs.add(new LampBulb(color));
		}
	}
	
	public List<LampBulb> getLamps(){
		return lampBulbs;
	}

	public void setColor(int lampBulbLocation, LampBulbColor color){
		
		if(lampBulbLocation < 0 || lampBulbLocation > this.lampBulbs.size()) 
			throw new ArrayIndexOutOfBoundsException(StringConstants.CANNOT_SET_COLOR);
		
		lampBulbs.get(lampBulbLocation).setLampColor(color);
	}
	
	public String toString(){
	
		StringBuilder stringBuilder = new StringBuilder();
		
		for(LampBulb lamp : lampBulbs){
			stringBuilder.append(lamp.toString());
		}
		
		return stringBuilder.toString();
	}

	public void switchOn(int numberOfLampBulbs) {
		if(numberOfLampBulbs < 0 || numberOfLampBulbs > this.lampBulbs.size())
			throw new IllegalArgumentException(StringConstants.LAMP_BULB_OUT_OF_RANGE);
		
		resetSwitchToOff();
		
		for(int i=0 ; i < numberOfLampBulbs ; i++){
			this.lampBulbs.get(i).switchOn();
		}
	}
	
	public void resetSwitchToOff(){
		for(LampBulb lampBulb : lampBulbs){
			lampBulb.switchOff();
		}
	}
}
