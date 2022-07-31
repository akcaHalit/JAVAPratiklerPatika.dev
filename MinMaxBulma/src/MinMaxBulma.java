package PratikveOdevler3;

import java.util.Scanner;
public class MinMaxBulma {

	public static void main(String[] args) {

		int n,max=1,min=1,sayi;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Kaç tane sayi gireceksiniz?: ");
		n = in.nextInt();
		
		for(int i =1;i<=n;i++) {
			 System.out.println(i+". Sayýyý Giriniz: ");
			 sayi = in.nextInt();
			 if(i==1) {			// ilk sayýlarý almak için ve tek seferlik oldu.
				 min=sayi;
				 max=sayi;
			 }
			 if(sayi<min) {
				 min = sayi;
			 }
			 if(sayi>max) {
				 max = sayi;
			 }
		}
		
		System.out.println("min: "+min);
		System.out.println("max: "+max);
		
	}

}
