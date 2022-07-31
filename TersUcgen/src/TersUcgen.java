package PratikveOdevler3;

import java.util.Scanner;
public class TersUcgen {

	public static void main(String[] args) {

		int n;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Kaç basamaklý?: ");
		n = in.nextInt();
		
		
		for(int i=0; i<=n; i++) {
			
			for(int k=n; k>(n-i); k--) {
				System.out.print(" ");
			}
			
			for(int j =1; j<=(2*(n-i))-1; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

		
		
	}

}
