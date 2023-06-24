package javaVjezbe;

public class LucasSequence {
	public static void main(String[] args) {
		
		int x1=2;
		int x2=1;
		int x3=0;
		
		for (int i=0; i<15; i++) {
			System.out.println(x1);
			x3=x1+x2;
			x1=x2;
			x2=x3;
		}
	}
}
