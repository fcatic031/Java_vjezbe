package training;

public class P005SmallestMultiple {
	public static void main(String[] args) {
		System.out.println(SmallestMultiple(20));
		//SmallestMultiple(10);
	}
	
	private static int SmallestMultiple(int max) {
		
		boolean fact=true;
		int x=0;
		while (fact) {
			x++;
			int in=0;
			for (int i=1; i<=max; i++) {
				if (x%i==0) {
					in++;
				}
				if (in==max) {
					fact = false;
				}
			}
			
		}
		
		return x;
	}
}
