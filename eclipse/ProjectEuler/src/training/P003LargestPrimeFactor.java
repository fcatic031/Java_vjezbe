package training;

public class P003LargestPrimeFactor {
	public static void main(String[] args) {
		long number=600851475143L;
		System.out.println(LargestPrimeFactor(29032));
	}
	
	public static long LargestPrimeFactor(long n) {
		//What is the largest prime factor of the number n
		
		boolean prim=true;
		long m=0;
		for (long i=2L; i<n ; i++) {
			prim=true;
			for (long j=2L; j<i; j++) {
				if (i%j==0) {
					prim=false;
				}
			}if (prim) {
				if (n%i==0) {
					//System.out.println(i);
					m=i;
				}
			}
				
				
			
		}
		
		
		System.out.print("Biggest prime factor of number " + n+ " would be: ");
		return m;
	}
}
