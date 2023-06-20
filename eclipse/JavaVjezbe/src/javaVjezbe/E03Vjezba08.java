package javaVjezbe;

import javax.swing.JOptionPane;

//Program unosi 2 broja 
//Ako su oba broja parna ispisuje zbroj, u suprotnom ispisuje njihovu razliku

public class E03Vjezba08 {
	public static void main(String[] args) {
		int x1=Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		int x2=Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));
		
		if (x1%2==0 && x2%2==0) {
			System.out.println(x1+x2);
		} else {
			System.out.println(x1-x2);
		}
	}
}
