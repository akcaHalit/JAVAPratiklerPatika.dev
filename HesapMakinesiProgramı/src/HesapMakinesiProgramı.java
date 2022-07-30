package PratiklerveOdevler2;

import java.util.Scanner;
public class HesapMakinesiProgramý {

	public static void main(String[] args) {

		int n1,n2,choice;
		Scanner in = new Scanner(System.in);
		
		System.out.println("1.sayýyý gir: ");
		n1 = in.nextInt();
		System.out.println("2.sayýyý gir: ");
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
				System.out.println("Carpým :" +(n1*n2));

				break;
			case 4:
				 if(n2 == 0 ) {
					 System.out.println("Bir sayi sýfýra bolunemez !! Baska bir sayi giriniz.");
				 }else {
					 System.out.println("Bolum :" +(n1/n2));
				 }
				break;
			default:
				System.out.println("Invalid Choice ! ");	
		}
		
		
		
	}

}
