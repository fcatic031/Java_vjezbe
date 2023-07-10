package javaVjezbe;

import java.util.Arrays;

public class LjubavniKalkulator {
	public static void main(String[] args) {
		LjubavniPostotak("Slavko", "Severina");
	}
	
	
	public static int LjubavniPostotak(String ime1, String ime2) {
		String imena = ime1+ime2;
		imena=imena.toLowerCase();
		
		int[] brojevi= new int[imena.length()];
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
		int n=0;
		for (int en:brojevi) {
			if (en<10) {
				n++;
			} else if (en>9 && en<100) {
				n+=2;
			}
			else if (en>99) {
				n+=3;
			}
		}
		int[] noviBrojevi=new int[n];
		n=0;
		for (int en: brojevi) {
			if (en<10) {
				noviBrojevi[n++]=en;
			} else if (en>9 && en<100) {
				noviBrojevi[n++]=en/10;
				noviBrojevi[n++]=en%10;
			}
			else if (en>99) {
				noviBrojevi[n++]=en/100;
				noviBrojevi[n++]=(en/10)%10;
				noviBrojevi[n++]=en%10;
			}
		}
		
		
		
		System.out.println(Arrays.toString(noviBrojevi));
		
		int[] noviPopis=new int[2];
		noviPopis=Postupak(noviBrojevi);
		
		int postotak=noviPopis[0]*10+noviPopis[1];
		System.out.println("Ljubav izmedju osobe "+ime1+" i "+ime2+" iznosi "+ postotak+"%");
		
		return postotak;
	}
	
	public static int[] Postupak(int[] brojevi){
		int xmin=0;
		int xmax=brojevi.length-1;
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
		
		
		int[] brojevi2 = new int[n];
		xmin=0;
		xmax=brojevi.length-1;
		int i=0;
		
		while (xmax>xmin) {
			int x=brojevi[xmin++]+brojevi[xmax--];
			if (x<10) {
				brojevi2[i++]=x;
			} else if (x>9 && x<100) {
				brojevi2[i++]=x/10;
				brojevi2[i++]=x%10;
			}
			//brojevi2[xmin]=brojevi[xmin++]+brojevi[xmax--];
		
			if (xmax==xmin) {
				brojevi2[i]=brojevi[xmin];
			}
		}
		
		if (n>2) {
			System.out.println(Arrays.toString(brojevi2));
			brojevi2=Postupak(brojevi2);
		}
		return brojevi2;
		
		
		
	}
}
