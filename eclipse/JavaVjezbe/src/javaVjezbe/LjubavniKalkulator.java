package javaVjezbe;

public class LjubavniKalkulator {
	public static void main(String[] args) {
		LjubavniPostotak("Anjaaa", "Fiiiiliip");
	}
	
	
	public static int LjubavniPostotak(String ime1, String ime2) {

		
		
//		for (char en : ime1.toCharArray()) {
//			System.out.print(en+"\t");
//		}
//		System.out.println();
//		for (char en : ime2.toCharArray()) {
//			System.out.print(en+"\t");
//		}
		String imena = ime1+ime2;
		imena=imena.toLowerCase();
		
		System.out.println(imena);
		
		int[] brojevi= new int[imena.length()];
		//int[] brojevi = {};
		int j=0;
		
		for (char en : imena.toCharArray()) {
			int i=0;
			for (char in : imena.toCharArray()) {
				if (en==in) {
					i++;
				}
			}
			brojevi[j++]=i;
		}
		
		for (int i : brojevi) {
			System.out.print(i+" ");
			
		}
		int xmin=0;
		int xmax=brojevi.length-1;
		System.out.println();
		String s="";
		int n=0;
		
		while (xmax>xmin) {
			if ((brojevi[xmin++]+brojevi[xmax--])<10) {
				n++;
			} else {
				n+=2;
			}
			if (xmax==xmin) {
				n++;
			}
		}
		
		int[] noviBrojevi= new int[n];
		xmin=0;
		xmax=brojevi.length-1;
		
		
		
		while (xmax>xmin) {
			System.out.print(brojevi[xmin++]+brojevi[xmax--]);
			//String str = String.valueOf(brojevi[xmin++]+brojevi[xmax--]);
			//s=s+" "+str;
			System.out.print("\t");
			if (xmax==xmin) {
				System.out.print(brojevi[xmin]);
				//str=String.valueOf(brojevi[xmin]);
				//s=s+" "+str;
			}
		}
		
		System.out.println();
		System.out.println(s);
		System.out.println(n);
		
//		int a1=brojevi[xmin++]+brojevi[xmax--];
//		noviBrojevi=new int[1];
//		noviBrojevi[0]=a1;
//		int a2=brojevi[xmin++]+brojevi[xmax--];
//		//noviBrojevi=new int[2];
//		int a3=brojevi[xmin++]+brojevi[xmax--];
//		int a4=brojevi[xmin++]+brojevi[xmax--];
//		System.out.println();
//		System.out.println(a1+" "+a2+" "+a3+" "+a4);
//		System.out.println(xmin+" "+xmax);
		//paran broj -> dodavati dok xmin>xmax
		//neparan broj -> jednaki xmin i xmax dodati taj jos
		
				
		return 0;
	}
}
