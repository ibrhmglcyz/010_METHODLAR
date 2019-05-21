package com.vektorel;

public class Runner {

	public static void main(String[] args) {
		
		yaz();
		yaz("Benim Dediğimi Yaz");
		toplam(50, 90);
		int sonuc = toplamR(12, 232);
		kmBul(1600,345,"Dizel");
		System.out.println(sonuc);
	}

	static int toplamR(int s1,int s2) {
		return s1+s2;
	}
	
	static int kmBul(double motorhacmi, double yol, String yakitturu) {
		return 3;
	}
	static void toplam(int s1,int s2) {
		System.out.println("Toplam..: "+(s1+s2));
	}
	
	static void yaz() {
		System.out.println("Selam");		
	}
	
	static void yaz(String ifade) {
		System.out.println(ifade);
	}

}


