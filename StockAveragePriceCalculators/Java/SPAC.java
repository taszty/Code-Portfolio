/**
 * Author: Dylan Nelson
 * File Name: SPAC (Stock Price Average Calculator)
 * Date Created: 2/21/22
 * Last Edited: 11/27/23
 * Description: This program takes simple inputs from a user to calculate a hypothetical 
 * average price change in the user's owned stock shares.
 */

import java.util.Scanner;

public class SPAC {

	public static void main(String[] args) {
	
		// Declare variables and scanner
		String stockName = "";
		double ownedShares =  0, ownedAverage = 0, ownedCostBasis = 0;
		double newShares = 0, newAverage = 0, newCostBasis = 0;
		double finalShareNumber = 0, finalAverageCost = 0;
		Scanner input = new Scanner(System.in);
		
		// Begin collecting variables
		System.out.println("Please enter the Ticker name (OPTIONAL - ex. TSLA): ");
		stockName = input.nextLine();
		System.out.println("Please enter the ammount of shares you own: ");
		ownedShares = input.nextDouble();
		System.out.println("Please enter your average cost per share: ");
		ownedAverage = input.nextDouble();
		System.out.println("Please enter the ammount of new shares being purchased: ");
		newShares = input.nextDouble();
		System.out.println("Please enter the price per share of the new shares: ");
		newAverage = input.nextDouble();
		
		// Begin calculations
		ownedCostBasis = ownedShares * ownedAverage;
		newCostBasis = newShares * newAverage;
		
		finalShareNumber = ownedShares + newShares;
		finalAverageCost = (ownedCostBasis + newCostBasis) / finalShareNumber;
		
		// Print final
		System.out.printf("Your new average share price for %s will be $%,.2f with a total of %,.2f shares.", 
				stockName, finalAverageCost, finalShareNumber);
		
		// Close Input
		input.close();
	}
}