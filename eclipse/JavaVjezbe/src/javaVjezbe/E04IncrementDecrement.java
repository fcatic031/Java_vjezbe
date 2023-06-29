package javaVjezbe;

public class E04IncrementDecrement {
	public static void main(String[] args) {
		
		int a=2;
		int b=1;
		int c=0;
		
		c=b++ - --c + a++;
		//a=3 b=2 c=4
		System.out.println(a+" "+b+" "+c);
		a=--b + c++ - ++b + b++ - a + a++;
		//a=5   b=3 c=5  
		System.out.println(a+" "+b+" "+c);
		
		
		
		
	}
}
