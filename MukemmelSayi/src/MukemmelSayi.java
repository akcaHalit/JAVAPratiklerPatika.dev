package PratikveOdevler3;

import java.util.Scanner;
public class MukemmelSayi {

	public static void main(String[] args) {
		int sayi,sum = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Say�y� giriniz: ");
		sayi = in.nextInt();
		
		//Bir say�n�n kendisi hari� pozitif tam say� �arpanlar� (kalans�z b�len say�lar�n) toplam�,
		//kendisine e�it olan say�ya m�kemmel say� denir.
		
		for(int i=1;i<sayi;i++) {
			if(sayi%i == 0) {
				sum +=i;
			}	
		}
		
		if(sum == sayi) {
			System.out.println(sayi+" M�kemmel say�d�r.");
		}else {
			System.out.println(sayi+" M�kemmel say� de�ildir.");
		}
		
		
	}

}
