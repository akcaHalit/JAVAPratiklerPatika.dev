package PratikveOdevler3;

import java.util.Scanner;
public class UsluSayiHesaplama {

	public static void main(String[] args) {
		int a,b,sum = 1;
		Scanner in = new Scanner(System.in);
		
		System.out.println("�ss� al�nacak de�er?: ");
		a = in.nextInt();
		System.out.println("�s olacak de�er?: ");
		b = in.nextInt();
		/*	While ile:
		int i=1;
		while(i<=b) {
			sum *=a;
			i++;
		}
		System.out.println(sum);
		*/ 
		// For ile:
		
		for(int i=1; i<=b; i++) {
			sum *= a;
		}
		System.out.println("Cevap: "+sum);
	
	}

}
