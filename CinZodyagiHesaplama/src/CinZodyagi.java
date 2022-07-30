package PratiklerveOdevler2;

import java.util.Scanner;
public class CinZodyagi {

	public static void main(String[] args) {
		
		int tarih,kalan;
		String zodyak = "";
		Scanner in = new Scanner(System.in);
		
		System.out.println("Doðum yýlýnýzý giriniz: ");
		tarih = in.nextInt();
	
		kalan = tarih % 12;
		
		switch(kalan) {
			
			case 0: 
				zodyak ="Maymun";
				break;
			case 1:
				zodyak ="Horoz";
				break;
			case 2:
				zodyak ="Köpek";
				break;
			case 3:
				zodyak ="Domuz";
				break;
			case 4:
				zodyak ="Fare";
				break;
			case 5:
				zodyak ="Öküz";
				break;
			case 6:
				zodyak ="Kaplan";
				break;
			case 7:
				zodyak ="Tavþan";
				break;	
			case 8:
				zodyak ="Ejderha";
				break;
			case 9:
				zodyak ="Yýlan";
				break;
			case 10:
				zodyak ="At";
				break;
			case 11:
				zodyak ="Koyun";
				break;
			default:
				System.out.println("Sistem Hatasý !");
		}
		System.out.println("Çin Zodyaðý Burcunuz: "+zodyak);
		

	}

}
