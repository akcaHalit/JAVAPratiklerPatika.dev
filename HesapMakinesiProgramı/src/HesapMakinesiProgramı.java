package PratiklerveOdevler2;

import java.util.Scanner;
public class HesapMakinesiProgram� {

	public static void main(String[] args) {

		int n1,n2,choice;
		Scanner in = new Scanner(System.in);
		
		System.out.println("1.say�y� gir: ");
		n1 = in.nextInt();
		System.out.println("2.say�y� gir: ");
		n2 = in.nextInt();
		System.out.println("Seciminiz Nedir? :");
		System.out.println("1-Toplama\n 2-Cikarma\n 3-Carpma\n 4-Bolme");
		choice = in.nextInt();
		
		switch(choice) {
			case 1:
				System.out.println("Toplam :" +(n1+n2));
				break;
			case 2:
				System.out.println("Kalan :" +(n1-n2));

				break;
			case 3:
				System.out.println("Carp�m :" +(n1*n2));

				break;
			case 4:
				 if(n2 == 0 ) {
					 System.out.println("Bir sayi s�f�ra bolunemez !! Baska bir sayi giriniz.");
				 }else {
					 System.out.println("Bolum :" +(n1/n2));
				 }
				break;
			default:
				System.out.println("Invalid Choice ! ");	
		}
		
		
		
	}

}
