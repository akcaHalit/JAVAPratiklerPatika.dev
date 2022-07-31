package PratikveOdevler3;

import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		int n;
		Scanner in = new Scanner(System.in);
		int sayi1 = 0,sayi2= 1;
		
		System.out.println("kaç elemanlý?:");
		n = in.nextInt();

		System.out.print(sayi1+" "+sayi2+" ");
			
		for(int i=1;i<n-1;i++) {
			
			int sayi = sayi1 + sayi2;
			System.out.print(sayi+" ");
			sayi1 = sayi2;
			sayi2 = sayi;
			
		}
		
	}

}
