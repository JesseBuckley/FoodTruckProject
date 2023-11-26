package com.skilldistillery.foodtruck.entities;

public class FoodTruck {
	private String truckName;
	private String foodType;
	private double truckRating;

	public FoodTruck() {}

	public FoodTruck(String newtruckName, String newfoodType, double newtruckRating) {
		this.truckName = newtruckName;
		this.foodType = newfoodType;
		this.truckRating = newtruckRating;
	}

	public String getTruckName() {
		return truckName;
	}

	public void setTruckName(String truckName) {
		this.truckName = truckName;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public double getTruckRating() {
		return truckRating;
	}

	public void setTruckRating(int truckRating) {
		this.truckRating = truckRating;
	}

	public String toString() {
		return "FoodTruck truckName = " + truckName + ", foodType = " + foodType + ", truckRating = " + truckRating;
	}

}