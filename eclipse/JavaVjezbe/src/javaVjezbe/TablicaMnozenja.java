package javaVjezbe;

import java.util.Scanner;



public class TablicaMnozenja {
	
	public static Scanner ulaz;
	
	public static void main(String[] args) {
		ulaz = new Scanner(System.in);
		int redovi = unosBroja("Unesi broj redaka","Pogreska",100);
		int stupci = unosBroja("Unesi broj stupaca","Pogreska",100);
		tablica (redovi,stupci);
		ulaz.close();
	}
	
	private static int unosBroja(String poruka,String pogreska, int max) {
		int i;
		System.out.print(poruka+": ");
		i = Integer.parseInt(ulaz.nextLine());
		while (true) {
			if (i>0 && i <= max) {
				return i;
			} else {
				System.out.println(pogreska);
			}
		}
		
	}
	
	private static void tablica(int redovi, int stupci) {
		String ukupanRazmak;
		int max = redovi*stupci;
		int znakoviStupca=0;
		
		NaslovCredits("Tablica mnozenja",redovi,stupci,true);
		
		for (int i=0;i<=stupci;i++) {
			if (i!=0) {
				znakoviStupca+=brojZnamenki(max)+1;
			} else {
				znakoviStupca+=brojZnamenki(redovi)+1;
			}
			//i!=0 ? znakoviStupca+=brojZnamenki(redovi)+1  : znakoviStupca=brojZnamenki(max)+1; 
			System.out.print(i==0 ? Razmaci(brojZnamenki(redovi)-brojZnamenki(i)," ")+"*|" : Razmaci(brojZnamenki(max)-brojZnamenki(i)," ")+" "+i);
		}
		System.out.println();
		System.out.println(Razmaci(znakoviStupca,"="));
		
		for (int i=1; i<=redovi; i++) {
			for (int j=1; j<=stupci; j++) {
				ukupanRazmak ="";
				int umnozak = i*j;
				for (int k=brojZnamenki(max);k>0; k-- ) {
					ukupanRazmak=ukupanRazmak+" ";
					if (brojZnamenki(umnozak)==k) {
						break;
					}
				}
				
				if (j==1) {
					
					System.out.print(Razmaci(brojZnamenki(redovi)-brojZnamenki(i)," ")+umnozak+"|");
				}
				
				System.out.print(ukupanRazmak+ umnozak + "");
			}
			System.out.println();
		}

		NaslovCredits("Filip",redovi,stupci,false);
	}
	
	private static void NaslovCredits(String naslov,int redovi, int stupci, boolean jeliNaslov) {
		int max= brojZnamenki(redovi*stupci)+1;
		int maxRedovi = brojZnamenki(redovi)+1;
		int znakoviStupca=0;
		for (int i=0;i<=stupci;i++) {
			if (i!=0) {
				znakoviStupca+=max;
			} else {
				znakoviStupca+=maxRedovi;
			}
		}
		//znakoviStupca uvijek neparan broj ako je redovi dvoznamenkasti
		// Naslov TABLICA MNOZENJA je 16 -> paran
		
		
		System.out.println(Razmaci(znakoviStupca,"="));
		
		//System.out.println(naslov.length());
		
		System.out.println((jeliNaslov) ? Razmaci((znakoviStupca-naslov.length())/2,":")+naslov+Razmaci((znakoviStupca-naslov.length())/2+1,":") 
		: Razmaci(znakoviStupca-naslov.length()-3,":") + "by "+naslov);
		
		System.out.println(Razmaci(znakoviStupca,"="));
	}
	
	
	private static int brojZnamenki(int broj) {
		int n = 1;
		while (true) {
			if (broj/10<1){
				break;
			} else {
				broj /=10;
				n++;
			}
		}
		
		return n;
	}
	
	private static String Razmaci(int broj,String string) {
		String razmaci = "";
		if (broj == 0) {
			return razmaci;
		}
		for (int i=0; i<broj; i++) {
			razmaci = razmaci +string;
		}
		return razmaci;
	}
}
