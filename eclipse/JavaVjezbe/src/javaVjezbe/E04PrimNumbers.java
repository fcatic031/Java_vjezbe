package javaVjezbe;

import javax.swing.JOptionPane;

public class E04PrimNumbers {
	public static void main(String[] args) {
		
		//Ispis svih prostih brojeva izmedju dva broja
		
		int x1=Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		int x2=Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));
		
		int pb=0;
		int db=0;
		
		if (x1<x2) {
			pb=x1;
			db=x2;
		}else if (x1==x2) {
			System.out.println("ERROR");
		} else {
			pb=x2;
			db=x1;
		}
		
		boolean prim=true;
		
		for (int i=pb; i<db ; i++) {
			prim=true;
			for (int j=2; j<i; j++) {
				if (i%j==0) {
					prim=false;
				}
			}if (prim)
				System.out.println(i);
			
			
		}
	}
}
