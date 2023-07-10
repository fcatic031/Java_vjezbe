package training;


public class P004LargestPalindromeProduct {
	//A palindromic number reads the same both ways.
	//Find the largest palindrome made from the product of two 3-digit numbers.
	public static void main(String[] args) {
		int max=0;
		int max1=0;
		int max2=0;
		
		for (int x=999;x>0;x--) {
			for (int y=999;y>0;y--) {
				int i=x*y;
				if(i<1000000 && i>100000) {
					if(i%10==i/100000 && (i/10000)%10==(i/10)%10 && (i/1000)%10==(i/100)%10) {
						//System.out.println(i);
						if (i>max) {
							max=i;
							max1=x;
							max2=y;
						}
						break;
					}
				}
				//just in case
				if(i<100000 && i>10000) {
					if (i%10==i/10000 && (i/1000)%10==(i/10)%10) {
						//System.out.println(i);
						if (i>max) {
							max=i;
							max1=x;
							max2=y;
						}
						break;
					}
				}
			}
		}
		
		System.out.println("Largest palindrome is "+max+" which is product "+max1+" and "+max2);
	}
	
	
	// void method for checking palindromes
	public static void Palindrome(){
		//3 digit
		for (int i=100; i<1000;i++) {
			if ((i%10)==(i/100)) {
				//System.out.println(i);
			}
		}
		//4 digit
		for (int i=1000;i<10000;i++) {
			if (i%10==i/1000 && (i/100)%10==(i/10)%10) {
				//System.out.println(i);
			}
		}
		//5 digit
		for (int i=10000;i<100000;i++) {
			if (i%10==i/10000 && (i/1000)%10==(i/10)%10) {
				//System.out.println(i);
			}
		}
		
		//6 digit
		for (int i=100000;i<1000000;i++) {
			if(i%10==i/100000 && (i/10000)%10==(i/10)%10 && (i/1000)%10==(i/100)%10) {
				System.out.println(i);
			}
		}
		
	}
}
