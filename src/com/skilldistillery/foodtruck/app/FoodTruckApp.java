package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;

public class FoodTruckApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		FoodTruck[] fleet = new FoodTruck[5];

System.out.println("Please enter up to 5 trucks.");
		for (int i = 0; i < fleet.length; i++) {
			System.out.println("Name of this truck? (quit to stop entering trucks)");
			String truckName = sc.next();
			if (truckName.equalsIgnoreCase("quit")) {
				break;
			}
			System.out.println("Enter the food type of this truck");
			String foodType = sc.next();
			System.out.println("Enter numeric rating for this truck 1-5");
			int rating = sc.nextInt();

			fleet[i] = new FoodTruck(truckName, foodType, rating);
			count++;
		}
		int option;
		boolean isOption = true;
		do {
			System.out.println("\nPlease select from one of the options below.");
			System.out.println("list of existing food trucks.(1)");
			System.out.println("Average rating of existing food trucks.(2)");
			System.out.println("Display highest-rated truck.(3)");
			System.out.println("Quit the program.(4)");
			option = sc.nextInt();

			if (option == 1) {
				for (int i = 0; i < count; i++) {
					System.out.println(fleet[i]);	
			}		
			} else if (option == 2) {
				

			} else if (option == 3) {
				// display information for the truck with the highest numeric rating

			} else if (option == 4) {
				System.out.println("you have decided to quit bye");
				isOption = false;
			} else {
				System.out.println("not a valid choice try again");
			}
		} while (isOption);

	}

}

