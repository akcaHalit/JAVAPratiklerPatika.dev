package PratikveOdevler3;

import java.util.Scanner;
public class HarmonikSeri {

	public static void main(String[] args) {
		int n;
		double result = 0.0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("N say�s�n� giriniz: ");
		n = in.nextInt();
		
		for(double i=1; i<=n;i++) {  //int olursa g�rm�yor double olmal� ki yar�mlar� als�n.
			result += (1/i);
		}
		System.out.println("Cevap"+result);
		
	}

}
