package PratikveOdevler4;

import java.util.Scanner;
public class RecursiveUsluSayi {

	static int result =1;
	
	static int usluSayiHesapla(int a,int b) {
		if (b==0) {
			return 1;
		}
		if(a!=0) {
			result *= a;
			usluSayiHesapla(a,b-1);
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		int a,b;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Taban değerini giriniz: ");
		a = in.nextInt();
		System.out.println("üs değerini giriniz: ");
		b = in.nextInt();
		int result = usluSayiHesapla(a,b);
		System.out.println("Cevap ==> "+result);
	}

}
