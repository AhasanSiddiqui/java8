package com.ahasan.java8.beans;

import java.util.Optional;

public class MobileWithOptional {

	private long id;
	private String brand;
	private String name;
	private Optional<DisplayFeatures> displayFeatures;
	// Like wise we can see MemoryFeatures, CameraFeatures etc.
	// For simplicity, using only one Features

	public MobileWithOptional(long id, String brand, String name, Optional<DisplayFeatures> displayFeatures) {
		this.id = id;
		this.brand = brand;
		this.name = name;
		this.displayFeatures = displayFeatures;
	}

	public long getId() {
		return id;
	}

	public String getBrand() {
		return brand;
	}

	public String getName() {
		return name;
	}

	public Optional<DisplayFeatures> getDisplayFeatures() {
		return displayFeatures;
	}
}
