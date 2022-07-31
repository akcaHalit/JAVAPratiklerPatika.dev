package PratikveOdevler3;

import java.util.Scanner;
public class CiftBulma {

	public static void main(String[] args) {

		int k,sum = 0,count = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Kaçýncý sayýya kadar ?:");
		k = in.nextInt();
		
		for(int i=1; i<=k; i++) {
			if( (i%3 == 0) || (i%4==0) ) {
				sum += i;
				count++;
			}
		}
		
		double ortalama = sum/count;
		System.out.println("3 ve 4'e tam bölünenlerin oralamasý: "+ortalama);
			
	}

}
