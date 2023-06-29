package training;

public class P002EvenFibonacciNumbers {
	public static void main(String[] args) {
		int FourMillion=4000000;
		System.out.println(EvenFibonacciNumbers(FourMillion));
	}
	
	public static int EvenFibonacciNumbers(int n) {
		int x1=1;
		int x2=2;
		
		int x3;
		
		int result=0;
		
		do {
			x3=x1+x2;
			x1=x2;
			x2=x3;
			if (x1%2==0) {
				result+=x1;
			}	
		}while (x3<n);
		
		return result;
	}
}
