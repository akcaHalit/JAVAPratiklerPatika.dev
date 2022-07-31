package PratikveOdevler3;

import java.util.Scanner;
public class BasamaklarýHesaplama {

	public static void main(String[] args) {
		int sayi,sum = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Sayiyi giriniz: ");
		sayi = in.nextInt();
		
		while(sayi!=0) {
			sum += sayi%10;
			sayi /= 10;
		}
		System.out.println("Cevap: "+sum);
		
	}

}
