package PratikveOdevler3;

import java.util.Scanner;
public class TeklerinToplamý {

	public static void main(String[] args) {
		int n,sum = 0;
		Scanner in = new Scanner(System.in);
		
		
		do {
			System.out.println("Sayý giriniz: ");
			n = in.nextInt();
			
			sum += n;
		}while(n%2 == 0);
		
		sum -= n;
		
		System.out.println("Toplam: "+sum);
		
		
		
	}

}
