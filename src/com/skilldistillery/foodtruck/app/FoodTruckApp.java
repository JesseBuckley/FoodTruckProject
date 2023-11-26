package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;
//I tried for some time to use non-static methods. 
//I am not entirely sure why I could not figure it out.
//For now at least all of my code is in the main method with some references to getters and setters.

public class FoodTruckApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		FoodTruck[] fleet = new FoodTruck[5];
//prompt user to enter truck info until the loop = 5 or they type quit instead of enter a name.
		System.out.println("Enter up to 5 trucks.\n");
		for (int i = 0; i < fleet.length; i = i + 1) {
			System.out.println("Name of this truck? To continue to menu enter (quit)");
			String truckName = sc.next();
			if (truckName.equalsIgnoreCase("quit")) {
				break;
			}
			System.out.println("Enter the food type.");
			String foodType = sc.next();
			System.out.println("Enter a numeric rating between 1 and 5.");
			double truckRating = sc.nextInt();
			count = count + 1;
			
//Each time through the for loop record the information provided in correlating spot of the array 
			fleet[i] = new FoodTruck(truckName, foodType, truckRating);
		}
		
//I used a do while loop to repeat the menu and calculations until the user types quit which breaks the loop and ends the program.
		int option;
		boolean isOption = true;
		do {
			System.out.println("\nPlease select from one of the options below:\n");
			System.out.println("list of existing food trucks.(1)");
			System.out.println("Average rating of existing food trucks.(2)");
			System.out.println("Display highest-rated truck.(3)");
			System.out.println("Quit the program.(4)");
			option = sc.nextInt();

			if (option == 1) {
				for (int i = 0; i < count; i = i + 1) {
					System.out.println(fleet[i]);
				}
			} else if (option == 2) {
				double combinedRating = 0;
				for (int i = 0; i < count; i = i + 1) {
					combinedRating = combinedRating + fleet[i].getTruckRating();
				}
				double average = combinedRating / count;
				System.out.println("The average of the trucks entered is " + average + ".");

			} else if (option == 3) {
				FoodTruck highestTruck = fleet[0];
				for (int i = 1; i < count; i = i + 1) {
					if (fleet[i].getTruckRating() > highestTruck.getTruckRating()) {
						highestTruck = fleet[i];
					}
				}
				System.out.println("The highest rated is:\n" + highestTruck);
			} else if (option == 4) {
				System.out.println("You have chosen to quit, have a nice day.");
				isOption = false;
			} else {
				System.out.println("Invalid selection. Please choose a menu item.");
			}
		} while (isOption);
		sc.close();
	}

}
