package PratiklerveOdevler2;

import java.util.Scanner;
public class S�n�f�GecmeDurumu {

	public static void main(String[] args) {
		int mat,fizik,turkce,kimya,muzik;
		double ortalama=0;
		int sayac=5;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Matematik notunu giriniz: ");
		mat = in.nextInt();
		System.out.println("Fizik notunu giriniz: ");
		fizik = in.nextInt();
		System.out.println("Turkce notunu giriniz: ");
		turkce = in.nextInt();
		System.out.println("Kimya notunu giriniz: ");
		kimya = in.nextInt();
		System.out.println("Muzik notunu giriniz: ");
		muzik = in.nextInt();
		
		// D�ng� ile yap�lmas� gerek :
		if(mat>100 || mat<0) {
			sayac -=1;
		}else {
			ortalama += mat;
		}
		if(fizik>100 || fizik<0) {
			sayac -=1;
		}else {
			ortalama += fizik;
		}
		if(turkce>100 || turkce<0) {
			sayac -=1;
		}else {
			ortalama += turkce;
		}
		if(kimya>100 || kimya<0) {
			sayac -=1;
		}else {
			ortalama += kimya;
		}
		if(muzik>100 || muzik<0) {
			sayac -=1;
		}else {
			ortalama += muzik;
		}
	
		ortalama /= sayac;
		
		if(ortalama <= 55) {
			System.out.println("Sinifta kald�n�z !");
		}else {
			System.out.println("S�n�f� ge�tiniz.");
		}
		
		System.out.println("Ortalaman�z :" +ortalama);
		
	}

}
