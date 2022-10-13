package de.tum.in.ase;


import java.util.Random;

public final class MyRandom {

	/**
	 * /$$$$$$$   /$$$$$$        /$$   /$$  /$$$$$$  /$$$$$$$$        /$$$$$$  /$$   /$$  /$$$$$$  /$$   /$$  /$$$$$$  /$$$$$$$$
	 * | $$__  $$ /$$__  $$      | $$$ | $$ /$$__  $$|__  $$__/       /$$__  $$| $$  | $$ /$$__  $$| $$$ | $$ /$$__  $$| $$_____/
	 * | $$  \ $$| $$  \ $$      | $$$$| $$| $$  \ $$   | $$         | $$  \__/| $$  | $$| $$  \ $$| $$$$| $$| $$  \__/| $$
	 * | $$  | $$| $$  | $$      | $$ $$ $$| $$  | $$   | $$         | $$      | $$$$$$$$| $$$$$$$$| $$ $$ $$| $$ /$$$$| $$$$$
	 * | $$  | $$| $$  | $$      | $$  $$$$| $$  | $$   | $$         | $$      | $$__  $$| $$__  $$| $$  $$$$| $$|_  $$| $$__/
	 * | $$  | $$| $$  | $$      | $$\  $$$| $$  | $$   | $$         | $$    $$| $$  | $$| $$  | $$| $$\  $$$| $$  \ $$| $$
	 * | $$$$$$$/|  $$$$$$/      | $$ \  $$|  $$$$$$/   | $$         |  $$$$$$/| $$  | $$| $$  | $$| $$ \  $$|  $$$$$$/| $$$$$$$$
	 * |_______/  \______/       |__/  \__/ \______/    |__/          \______/ |__/  |__/|__/  |__/|__/  \__/ \______/ |________/
	 * <p>
	 * Please don't change anything in this file, it may break the Tests.
	 */
	private static Random random = new Random();

	/**
	 * Generates a random choice for the prisoners dilemma
	 * @return Either "B" for Betray or "S" for Silent
	 */
	public static String generateRandomChoice() {
		int randomResult = random.nextInt(2);
		if (randomResult == 0) {
			return "B";
		} else {
			return "S";
		}
	}

	/**
	 * When no seed is set, the Random Number will be different each
	 * time you run the program.
	 * If you set a seed, then the same numbers will be generated every time
	 * when using that exact seed.
	 *
	 * @param seed - long, the seed
	 */
	public static void setSeed(long seed) {
		random.setSeed(seed);
	}
}
