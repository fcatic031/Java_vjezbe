package javaVjezbe;

import javax.swing.JOptionPane;

public class CiklicnaMatrica {
	public static void main(String[] args) {
		
boolean dev = false;
		
		int x= dev ? 5 : Integer.parseInt(JOptionPane.showInputDialog("Unesi broj redova"));
		int y= dev ? 5 : Integer.parseInt(JOptionPane.showInputDialog("Unesi broj stupaca"));
		
		int[] [] tablica = new int [x][y];
		
		
		int num=1;
		
		int xmin=1;
		int ymin=1;
		
		int xmax=x;
		int ymax=y;
		
		do {
			for (int i=ymin; i<=ymax; i++) {
				tablica[x-xmin][y-i]=num++;
			}
			if (num>=(x*y)+1) {
				break;
			}
			xmin++;
			for (int i=xmin; i<=xmax;i++) {
				tablica[x-i][y-ymax]=num++;
			}
			if (num>=(x*y)+1) {
				break;
			}
			
			for (int i=ymin;i<=y-ymin;i++) {
				tablica[x-xmax][i]=num++;
			}
			if (num>=(x*y)+1) {
				break;
			}
			ymax--;
			for (int i=xmin-1; i<=x-xmin;i++) {
				tablica[i][ymax]=num++;
			}
			ymin++;
			xmax--;
		} while (num<(x*y)+1);
		
		for (int i=0; i<x; i++) {
			for (int j=0; j<y; j++) {
				System.out.print(tablica[i][j]+"\t" );
			}
			System.out.println();
		}
	
	}
}
