package PratiklerveOdevler;

import java.util.Scanner;
public class ManavKasaProgram� {

	public static void main(String[] args) {
		
		double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patl�can=5.0,toplam;
		double armutkg,elmakg,domateskg,muzkg,patl�cankg;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Ka� kilo armut? : ");
		armutkg = in.nextDouble();
		System.out.println("Ka� kilo elma? : ");
		elmakg = in.nextDouble();
		System.out.println("Ka� kilo domates? : ");
		domateskg = in.nextDouble();
		System.out.println("Ka� kilo muz? : ");
		muzkg = in.nextDouble();
		System.out.println("Ka� kilo patl�can? : ");
		patl�cankg = in.nextDouble();
		
		toplam = (armut*armutkg)+(elma*elmakg)+(domates*domateskg)+(muz*muzkg)+(patl�can*patl�cankg);
		
		System.out.println("Toplam Tutar: "+toplam+" TL");
	}

}
