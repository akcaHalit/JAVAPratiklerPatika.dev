package PratikveOdevler3;


import java.util.Scanner;
public class DortBesKuvvetleri {

	public static void main(String[] args) {

		int n,i;
		Scanner in = new Scanner(System.in);
	
		System.out.println("Hangi say�ya kadar?: ");
		n = in.nextInt();
		
		/*
		for(int i=1; i<=n; i*=2) {
			System.out.println(i);
		}
		*/
		System.out.println("4'�n kuvvetleri: ");
		for(i=4; i<=n; i*=4) {
			System.out.println(i);
		}
		System.out.println("5'in kuvvetleri: ");
		for(i=5; i<=n; i*=5) {
			System.out.println(i);
		}
		
	}

}

