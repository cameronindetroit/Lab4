package PairProgram;

import java.util.Scanner;

public class PairProgram {

	public static void main(String[] args) {
		// Scanner
		Scanner scnr = new Scanner(System.in);

		// Class variables
		int userNum;
		String userInput;
		boolean exitProgram;

		// Do while loop

		do {

			// Prompt user for integer value
			System.out.println("Please enter a number");
			userNum = scnr.nextInt();
			scnr.nextLine();

			System.out.print("Number");
			System.out.print("\tSquared");
			System.out.println("  Cubed");
			System.out.println("===== \t===== \t =====");
			// For Loop
			for (int i = 1; i <= userNum; i++) {

				// print user Number
				System.out.print(i + "\t");

				// print user Number Squared
				System.out.print(Math.pow(i, 2) + "\t");

				// print user Number cubed
				System.out.println(Math.pow(i, 3) + "\t");

			}

			// control statement to exit program

			System.out.println("Would you like to exit program? (Y/N)");
			userInput = scnr.nextLine();
			userInput = userInput.toLowerCase();

			if (userInput.equals("y")) {
				exitProgram = true;
				System.out.println("Exiting Program");
			} else {
				exitProgram = false;
				System.out.println("Play again");
			}

		} while (exitProgram == false);

	}

}
