package PratiklerveOdevler2;

import java.util.Scanner;
public class Sýralama {

	public static void main(String[] args) {
		int a,b,c;
		Scanner in = new Scanner(System.in);
			
		System.out.println("1.sayi :");
		a = in.nextInt();
		System.out.println("2.sayi :");
		b = in.nextInt();
		System.out.println("3.sayi :");
		c = in.nextInt();
		
		//	Büyükten Küçüðe doðru sýralama:
		/* 	
		if((a>b)&& (a>c)) {
			if (b>c) {
				System.out.println(" a > b > c");
			}else {
				System.out.println(" a > c > b");
			}
		}else if ((b>a) && (b>c)) {
			if (a>c) {
				System.out.println("b > a > c");
			}else {
				System.out.println("b > c > a");
			}	
		}else if((c>a) && (c>b)) {
			if(a>b) {
				System.out.println("c > a > b");
			}else {
				System.out.println("c > b > a");
			}
		}else {
			System.out.println("Program dogru calismadi.Ozur dileriz!");
		}
		*/
		
		if((a<b)&& (a<c)) {
			if (b<c) {
				System.out.println(" a < b < c");
			}else {
				System.out.println(" a < c < b");
			}
		}else if ((b<a) && (b<c)) {
			if (a<c) {
				System.out.println("b < a < c");
			}else {
				System.out.println("b < c < a");
			}	
		}else if((c<a) && (c<b)) {
			if(a<b) {
				System.out.println("c < a < b");
			}else {
				System.out.println("c < b < a");
			}
		}else {
			System.out.println("Program dogru calismadi.Ozur dileriz!");
		}
			
		
	}

}
