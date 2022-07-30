package PratiklerveOdevler2;

import java.util.Scanner;
public class EtkinlikOnerme {

	public static void main(String[] args) {
		int temp,choice;
		Scanner in = new Scanner(System.in);
		
		/*
		System.out.println("Sýcaklýk kaç derece? :");
		temp = in.nextInt();
	
		if(temp<5) {
			System.out.println("Kayak yapabilirsiniz.");
		}else if(temp>=5 && temp<=15){ 
			System.out.println("Sinemaya gidebilirsiniz.");
		}else if(temp>15 && temp<=25) {
			System.out.println("Piknik yapabilirsiniz.");
		}else if(temp>25){
			System.out.println("Yüzmeye gidebilirsiniz.");
		}
		
		*/
		System.out.println("Sýcaklýk hangi deðerler arasýnda ? :");
		System.out.println("1) 5 ve 5'ten küçük \n2) 5 - 15 arasý \n3) 15-25 arasý \n4) 25 ve üstü");
		choice = in.nextInt();
		switch(choice) {
			case 1:
				System.out.println("Kayak yapabilirsiniz");
				break;
			case 2:
				System.out.println("Sinemaya gidebilirsiniz.");
				break;
			case 3:
				System.out.println("Piknik yapabilirsiniz.");
				break;
			case 4:
				System.out.println("Yüzmeye gidebilirsiniz.");
				break;
			default:
				System.out.println("Gecerli bir secim giriniz:");
		}
		
		
	}

}
