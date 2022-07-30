package PratiklerveOdevler;

import java.util.Scanner;
public class ManavKasaProgramý {

	public static void main(String[] args) {
		
		double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlýcan=5.0,toplam;
		double armutkg,elmakg,domateskg,muzkg,patlýcankg;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Kaç kilo armut? : ");
		armutkg = in.nextDouble();
		System.out.println("Kaç kilo elma? : ");
		elmakg = in.nextDouble();
		System.out.println("Kaç kilo domates? : ");
		domateskg = in.nextDouble();
		System.out.println("Kaç kilo muz? : ");
		muzkg = in.nextDouble();
		System.out.println("Kaç kilo patlýcan? : ");
		patlýcankg = in.nextDouble();
		
		toplam = (armut*armutkg)+(elma*elmakg)+(domates*domateskg)+(muz*muzkg)+(patlýcan*patlýcankg);
		
		System.out.println("Toplam Tutar: "+toplam+" TL");
	}

}
