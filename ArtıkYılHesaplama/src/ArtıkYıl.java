package PratiklerveOdevler2;

import java.util.Scanner;
public class Art�kY�l {

	public static void main(String[] args) {
		int year;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Y�l� giriniz: ");
		year = in.nextInt();
		
		if(year %4 == 0) {
			
			if(year%100 == 0) {
				
				if(year%400 == 0) {
					System.out.println("Girdi�iniz y�l art�k bir y�ld�r.");
				}else {
					System.out.println("Girdi�iniz y�l art�k bir y�l de�ildir.");
				}
			}else {
				System.out.println("Girdi�iniz y�l art�k bir y�ld�r.");
			}
			
		}else {
			System.out.println("Girdi�iniz y�l art�k bir y�l de�ildir.");
		}
		
	}

}
