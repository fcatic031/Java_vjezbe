package javaVjezbe;

import java.util.Random;

import javax.swing.JOptionPane;

public class RandomIntegerCPGuess {
	public static void main(String[] args) {
		
		Random rand_int= new Random();
		boolean fact=true;
		
		int x1=0;
		int x2=100;
		
		int i=0;
		
		do {
			int x = rand_int.nextInt(x1+1,x2);
			i+=1;
			String s=JOptionPane.showInputDialog("Computer guesses ("+x1+"-"+x2+") number -->"+ x +"   up(U) or down(D) or correct(C)?");
			s=s.toUpperCase();
			if (s.equals("C")) {
				fact=false;
				System.out.println("Computer got it correct in "+i+". guess!");
			}else if (s.equals("U")) {
				x1=x;
			} else if (s.equals("D")) {
				x2=x;
			}else {
				System.out.println("error \nsomething went wrong \nCP will choose another number \nTry again");
			}
		} while (fact);
	}
}
