package training;

public class P001MultiplesOf3and5 {
	public static void main(String[] args) {
		System.out.println(MultiplesOf3and5(1000));
		
	}
	
	public static int MultiplesOf3and5(int n) {
		int result=0;
		
		for (int i=0;i<n;i++) {
			if (i%3==0 || i%5==0) {
				result+=i;
			}
		}
		
		return result;
	}
}
