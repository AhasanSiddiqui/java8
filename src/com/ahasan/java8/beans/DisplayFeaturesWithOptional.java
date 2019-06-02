package com.ahasan.java8.beans;
import java.util.Optional;

public class DisplayFeaturesWithOptional {

	private String size; // In inches
	private Optional<ScreenResolution> resolution;
	
	public DisplayFeaturesWithOptional(String size, Optional<ScreenResolution> resolution){
		this.size = size;
		this.resolution = resolution;
	}
	
	public String getSize() {
		return size;
	}
	public Optional<ScreenResolution> getResolution() {
		return resolution;
	}
	
}
