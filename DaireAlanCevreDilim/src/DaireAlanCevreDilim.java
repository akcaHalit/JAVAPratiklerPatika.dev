package PratiklerveOdevler;

import java.util.Scanner;
public class DaireAlanCevreDilim {

	public static void main(String[] args) {
		
		double r,pi = 3.14,alan,cevre,dilimAlani,dilimAci;
		Scanner in = new Scanner(System.in);
		
		//Ýnputlar:
		System.out.println("Dairenin yarýçapýný giriniz: ");
		r = in.nextDouble();
		System.out.println("Daire dilimin Açýsýný giriniz: ");
		dilimAci = in.nextDouble();
		
		// Alan ve çevre hesaplama:
		alan = pi*r*r;
		cevre = 2*pi*r;
		dilimAlani = (pi*(r*r)*dilimAci)/360;
		
        System.out.println("------------------------------------------------------");
		System.out.println(" Dairenin Yarýçap Deðeri : "+r);
        System.out.println(" Daire Dilimin Açýsýný   : "+dilimAci);
        System.out.println(" Tüm Dairenin Çevresi    : "+cevre);
        System.out.println(" Tüm Dairenin Alaný      : "+alan);
        System.out.println(" Daire Dilimin Alaný     : "+dilimAlani);	
	
	}
	

}
