package javaVjezbe;

import java.util.Random;

import javax.swing.JOptionPane;

public class RandomIntegerGuess {
	public static void main(String[] args) {

		Random rand = new Random();
		int rand_int = rand.nextInt(100);
		boolean fact = false;

		int x1 = 0;
		int x2 = 100;
		int i = 0;
		
		do {
			i++;
			int x = Integer.parseInt(JOptionPane.showInputDialog(i + ") Choose a number between " + x1 + " and " + x2));
			if (x < x2 & x > x1) {
				if (x == rand_int) {
					System.out.println("Correct");
					System.out.println("You guessed the number " + rand_int + " in your " + i + ". attempt!");
					fact = true;
				} else if (x < rand_int) {
					System.out.println("Too low number, choose a higher next time ");
					x1 = x;
				} else if (x > rand_int) {
					System.out.println("Too high number, choose a lower number next time");
					x2 = x;
				} else {
					System.out.println("ERROR");
					i--;
				}
			} else {
				System.out.println("ERROR");
				i--;
			}
		} while (fact == false);
	}
}
