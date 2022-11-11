package de.tum.in.ase;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrisonersDilemma {
	public static void main(String[] args) {
		//Local variables
		Scanner scanner = new Scanner(System.in);
		String choiceAlice = "_";
		String choiceBob = "_";
		boolean aliceTurn = false;
		boolean bobTurn = false;

		int yearsAlice = 0;
		int yearsBob = 0;

		// TODO: Print a welcome message
		System.out.println("Welcome to the Prisoner's Dilemma!");

		// TODO: Ask from Alice
		// First, print a question that asks Alice's input
		List<String> validResponseList = new ArrayList<>();
		validResponseList.add("B");
		validResponseList.add("S");
		System.out.println("Do you want to betray (B) Bob or be silent (S)?");
		while (!validResponseList.contains(choiceAlice)) {
			choiceAlice = scanner.nextLine();
		}

		switch (choiceAlice) {
			case "B":
				System.out.println("Alice chose to betray: B");
				break;
			case "S":
				System.out.println("Alice chose to be silent: S");
				break;
			default:
				System.out.println("response not valid");
				break;
		}

		// Keep asking until Alice responds with a B or S

		// TODO: Bob answers
		// Get a random choice for Bob
		MyRandom.setSeed(1234);
		choiceBob = MyRandom.generateRandomChoice();
		// Print Bob's choice
		while (!validResponseList.contains(choiceBob)) {
			choiceBob = scanner.nextLine();
		}

		switch (choiceBob) {
			case "B":
				System.out.println("Bob chose to betray: B");
				break;
			case "S":
				System.out.println("Bob chose to be silent: S");
				break;
			default:
				System.out.println("response not valid");
				break;
		}

		// TODO: Sentence calculation
		// Given both choices, calculate who gets how many years of the sentence.
		//If A and B both betray each other, both serve two years in prison: (2, 2)
		//If A betrays B but B remains silent, A will be set free and B will serve three years in prison: (0, 3)
		//If A remains silent but B betrays A, A will serve three years in prison and B will be set free: (3, 0)
		//If A and B remain silent, both will serve one year in prison (for the lesser charge): (1, 1)
		if (choiceAlice.equals("B") && choiceBob.equals("B")) {
			yearsAlice = 2;
			yearsBob = 2;
		} else if (choiceAlice.equals("B") && choiceBob.equals("S")) {
			yearsAlice = 0;
			yearsBob = 3;
		} else if (choiceAlice.equals("S") && choiceBob.equals("B")) {
			yearsAlice = 3;
			yearsBob = 0;
		} else {
			yearsAlice = 1;
			yearsBob = 1;
		}
		System.out.printf("Alice gets %d years and Bob gets %d years in prison.", yearsAlice, yearsBob);

	}

}
