package letsEat;

import java.util.Scanner;

public class DecideWhatToEat {
	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		/*
		 * Write a program that will inform the user how they should prepare for dinner
		 * based on two conditions: the party size and the event type
		 */

		// Declare variables
		String eventType;
		String mealSuggestion;
		String partySize;
		String preparationSuggestion;
		String result;

		// Get event type and assign appropriate meal suggestion
		System.out.println("Enter event type (casual, semi-formal, formal): ");
		eventType = scnr.next();

		if (eventType.equals("casual")) {
			mealSuggestion = "sandwiches";

		} else if (eventType.equals("semi-formal")) {
			mealSuggestion = "fried chicken";

		} else {
			mealSuggestion = "chicken parmesan";
		}

		// Get party size and assign appropriate preparation suggestion
		System.out.println("Enter party size (1, 2-12, 13+)");
		partySize = scnr.next();

		if (partySize.equals("1")) {
			preparationSuggestion = "in the microwave";
		} else if (partySize.equals("2-12")) {
			preparationSuggestion = "in your kitchen";

		} else {
			preparationSuggestion = "by a caterer";

		}
		result = "Since you are hosting a " + eventType + " event for " + partySize
				+ " participant(s), you should serve " + mealSuggestion + " " + preparationSuggestion + ".";
		System.out.println(result);
		scnr.close();
	}
}
