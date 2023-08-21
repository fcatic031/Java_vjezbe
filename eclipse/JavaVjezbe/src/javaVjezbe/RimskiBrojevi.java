package javaVjezbe;

import java.util.Scanner;

public class RimskiBrojevi {
	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.print("Unesi broj: ");
		int broj = ulaz.nextInt();
		System.out.println(Rimski(broj));
	}

	private static String Rimski(int n) {
		if (n < 1 || n > 3999) {
			return "ERROR! \nOF LIMITS";
		}
		String rjesenje = "";

		int[] brojevi = { 1000, 500, 100, 50, 10, 5, 1 };
		String[] brojevi2 = { "M", "D", "C", "L", "X", "V", "I" };

		for (int i = 0; i < brojevi.length; i++) {
			switch (n / brojevi[i]) {
			case 1:
				if (brojevi[i] == 5 && n % brojevi[i] == 4) {
					rjesenje += brojevi2[i + 1];
					rjesenje += brojevi2[i - 1];
					n -= 9;
					System.out.println(n);
					break;
				} else if (brojevi[i] == 50 && n % brojevi[i] >= 40) {
					rjesenje += brojevi2[i + 1];
					rjesenje += brojevi2[i - 1];
					n -= 90;
					System.out.println(n);
					break;
				} else if (brojevi[i] == 500 && n % brojevi[i] >= 400) {
					rjesenje += brojevi2[i + 1];
					rjesenje += brojevi2[i - 1];
					n -= 900;
					System.out.println(n);
					break;
				} else {
					rjesenje += brojevi2[i];
					n -= brojevi[i];
					System.out.println(n);
					break;
				}
			case 2:
				rjesenje += brojevi2[i];
				rjesenje += brojevi2[i];
				n -= brojevi[i];
				n -= brojevi[i];
				System.out.println(n);
				break;
			case 3:
				rjesenje += brojevi2[i];
				rjesenje += brojevi2[i];
				rjesenje += brojevi2[i];
				n -= brojevi[i];
				n -= brojevi[i];
				n -= brojevi[i];
				System.out.println(n);
				break;
			case 4:
				rjesenje += brojevi2[i];
				rjesenje += brojevi2[i - 1];
				n -= brojevi[i] * 4;
				System.out.println(n);
				break;

			case 5:
				rjesenje += brojevi[i - 1];
				n -= brojevi[i] * 5;
				System.out.println(n);
				break;
			case 6:
				rjesenje += brojevi[i - 1];
				rjesenje += brojevi[i];
				n -= brojevi[i] * 6;
				System.out.println(n);
				break;

			case 7:
				rjesenje += brojevi[i - 1];
				rjesenje += brojevi[i];
				rjesenje += brojevi[i];
				n -= brojevi[i] * 7;
				System.out.println(n);
				break;

			case 8:
				rjesenje += brojevi[i - 1];
				rjesenje += brojevi[i];
				rjesenje += brojevi[i];
				rjesenje += brojevi[i];
				n -= brojevi[i] * 8;
				System.out.println(n);
				break;

			case 9:
				rjesenje += brojevi[i];
				rjesenje += brojevi[i - 2];
				n -= brojevi[i] * 9;
				System.out.println(n);
				break;

			}

		}

		return rjesenje;
	}
}
