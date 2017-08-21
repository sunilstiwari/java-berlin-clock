package com.ubs.opsit.interviews;

public class LampBulb {

	private LampBulbColor lampColor;
	private boolean switchedOn;

	public LampBulb(LampBulbColor color) {
		this.lampColor = color;
	}

	public String toString() {
		if (this.switchedOn) {
			return lampColor.toString();
		} else {
			return lampColor.OFF.toString();
		}
	}

	public void switchOn() {
		this.switchedOn = true;
	}

	public void switchOff() {
		this.switchedOn = false;
	}

	public boolean isSwitchedOn() {
		return this.switchedOn;
	}

	public void setLampColor(LampBulbColor color) {
		this.lampColor = color;
	}
}
