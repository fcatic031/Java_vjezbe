package training;

public class P006SumSquareOfDifference {
	public static void main(String[] args) {
		System.out.println(SumSquareDifference(100));
	}
	
	private static int SumSquareDifference(int n) {
		
		return Math.abs(SumOfSquares(n)-SquareOfTheSum(n));
	}
	
	private static int SumOfSquares(int n) {
		int sum=0;
		for (int i=1; i<=n; i++) {
			sum+=(i*i);
		}
		return sum;
	}
	
	private static int SquareOfTheSum(int n) {
		int sum=0;
		for (int i=1;i<=n;i++) {
			sum+=i;
		}
		return sum*sum;
	}
}
