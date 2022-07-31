package PratikveOdevler3;

import java.util.Scanner;
public class HarmonikSeri {

	public static void main(String[] args) {
		int n;
		double result = 0.0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("N sayýsýný giriniz: ");
		n = in.nextInt();
		
		for(double i=1; i<=n;i++) {  //int olursa görmüyor double olmalý ki yarýmlarý alsýn.
			result += (1/i);
		}
		System.out.println("Cevap"+result);
		
	}

}
