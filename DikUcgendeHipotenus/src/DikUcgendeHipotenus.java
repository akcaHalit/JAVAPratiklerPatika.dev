package PratiklerveOdevler;

import java.util.Scanner;
public class DikUcgendeHipotenus {

	public static void main(String[] args) {
		
		double a,b,c,u,cevre,alan;
		Scanner in = new Scanner(System.in);
		
		System.out.println("1.Kenarý giriniz: ");
		a = in.nextDouble();
		System.out.println("2.Kenarý giriniz: ");
		b = in.nextDouble();;
		
		c = Math.sqrt((a*a) + (b*b));
		
		u = (a+b+c)/2;
		cevre = 2*u;
		
		alan = Math.sqrt((u*(u-a)*(u-b)*(u-c)));
		System.out.println("Birinci Kenar: "+a);
		System.out.println("Ikinci Kenar: "+b);
		System.out.println("Hipotenus: "+c);
		System.out.println("Cevre: "+cevre);
		System.out.println("Alan: "+alan);
	}

}
