package GitInl;

import java.util.Scanner;

public class PlayGuesser {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		boolean kollaInt = false;
		int l = 0;
		int h = 0;

		System.out.println("Welcome to the guessing game, choose a Low, and a High");
		System.out.print("Low: ");

		do {
			if (sc.hasNextInt() == true) {
				l = sc.nextInt();
				break;
			} else {
				System.out.print("Please enter an integer value: ");
				sc.next();
			}
		} while (kollaInt == false);

		System.out.print("High: ");

		do {
			if (sc.hasNextInt() == true) {
				h = sc.nextInt();
				break;
			} else {
				System.out.print("Please enter an integer value: ");
				sc.next();
			}
		} while (kollaInt == false);

		
		
		Guesser guesser = new Guesser(l, h);
		guesser.start();

	}
}
