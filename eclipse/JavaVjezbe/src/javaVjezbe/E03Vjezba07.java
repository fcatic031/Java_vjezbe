package javaVjezbe;

import javax.swing.JOptionPane;

//PRINT FIRST DIGIT OF NUMBER BETWEEN 1 AND 999

public class E03Vjezba07 {
	public static void main(String[] args) {
		int x =Integer.parseInt(JOptionPane.showInputDialog("Choose a number between 1 and 999"));
		
		if (x>999 || x<1) {
			System.out.println("ERROR");
		}else if (x<10){
			System.out.println(x);
		} else {
			x=x/10;
			if (x>9) {
				x=x/10;
				System.out.println(x);
			}else {
				System.out.println(x);
			}
		}
		
	}
}
