package PratiklerveOdevler2;

import java.util.Scanner;
public class ArtýkYýl {

	public static void main(String[] args) {
		int year;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Yýlý giriniz: ");
		year = in.nextInt();
		
		if(year %4 == 0) {
			
			if(year%100 == 0) {
				
				if(year%400 == 0) {
					System.out.println("Girdiðiniz yýl artýk bir yýldýr.");
				}else {
					System.out.println("Girdiðiniz yýl artýk bir yýl deðildir.");
				}
			}else {
				System.out.println("Girdiðiniz yýl artýk bir yýldýr.");
			}
			
		}else {
			System.out.println("Girdiðiniz yýl artýk bir yýl deðildir.");
		}
		
	}

}
