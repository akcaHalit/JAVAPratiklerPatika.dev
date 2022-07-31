package PratikveOdevler3;

import java.util.Scanner;
public class MukemmelSayi {

	public static void main(String[] args) {
		int sayi,sum = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Sayýyý giriniz: ");
		sayi = in.nextInt();
		
		//Bir sayýnýn kendisi hariç pozitif tam sayý çarpanlarý (kalansýz bölen sayýlarýn) toplamý,
		//kendisine eþit olan sayýya mükemmel sayý denir.
		
		for(int i=1;i<sayi;i++) {
			if(sayi%i == 0) {
				sum +=i;
			}	
		}
		
		if(sum == sayi) {
			System.out.println(sayi+" Mükemmel sayýdýr.");
		}else {
			System.out.println(sayi+" Mükemmel sayý deðildir.");
		}
		
		
	}

}
