package training;

public class P009SpecialPythagoreanTriplet {
	public static void main(String[] args) {
		System.out.println(SpecialPythagoreanTriplet(1000));
	}
	
	private static int SpecialPythagoreanTriplet(int max) {
		int a=0;
		int b=0;
		int c=0;
		for (int i=1; i<=max;i++) {
			for (int j=1; j<max;j++) {
				int z2=i*i+j*j;
				double z2_=i*i+j*j;
				double z=Math.sqrt(z2_);
				//z= (int) z;
				if (i+j+(int)z==max) {
					for (int k=1; k<z2 ; k++) {
					if (z2%k==0 && z2/k==k) {
						a=i;
						b=j;
						c=(int)z;
						System.out.println("a= "+i+" b= "+j+ " c= "+(int)z);
						return a*b*c;
						}
					}
				}
				
			}
		}
		return 0;
		
	}
}
