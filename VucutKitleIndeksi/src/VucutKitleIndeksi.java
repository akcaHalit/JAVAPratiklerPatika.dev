package PratiklerveOdevler;

import java.util.Scanner;
public class VucutKitleIndeksi {

	public static void main(String[] args) {

		double boy,kilo,indeks;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Boyunuzu metre cinsinden giriniz: ");
		boy = in.nextDouble();
		System.out.println("Kilonuzu kg cinsinden giriniz: ");
		kilo = in.nextDouble();
		
		indeks = kilo/(boy*boy);
		System.out.println("Vücut Kitle Indeksiniz: "+indeks);
		
	}

}
