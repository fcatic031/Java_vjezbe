package javaVjezbe;

import javax.swing.JOptionPane;

public class E04Vjezba01 {
	public static void main(String[] args) {
		// Korisnik unosi dva cijela broja
		// Program ispisuje
		// zbroj svih neparnih brojeva
		// između dva unesena broja
		
		int x1=Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		int x2=Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));
		
		int pb=0;
		int db=0;
		
		if (x2>x1) {
			pb=x1;
			db=x2;
		}else if (x1==x2) {
			System.out.println("ERROR");
		}else {
			pb=x2;
			db=x1;
		}
		
		int x=0;
		
		for (int i=pb;i<db;i++) {
			if (i%2==1)
				x+=i;
		}
		
		System.out.println(x);
		
	}
}
