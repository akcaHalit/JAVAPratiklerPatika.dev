package PratiklerveOdevler;

import java.util.Scanner;
public class DaireAlanCevreDilim {

	public static void main(String[] args) {
		
		double r,pi = 3.14,alan,cevre,dilimAlani,dilimAci;
		Scanner in = new Scanner(System.in);
		
		//�nputlar:
		System.out.println("Dairenin yar��ap�n� giriniz: ");
		r = in.nextDouble();
		System.out.println("Daire dilimin A��s�n� giriniz: ");
		dilimAci = in.nextDouble();
		
		// Alan ve �evre hesaplama:
		alan = pi*r*r;
		cevre = 2*pi*r;
		dilimAlani = (pi*(r*r)*dilimAci)/360;
		
        System.out.println("------------------------------------------------------");
		System.out.println(" Dairenin Yar��ap De�eri : "+r);
        System.out.println(" Daire Dilimin A��s�n�   : "+dilimAci);
        System.out.println(" T�m Dairenin �evresi    : "+cevre);
        System.out.println(" T�m Dairenin Alan�      : "+alan);
        System.out.println(" Daire Dilimin Alan�     : "+dilimAlani);	
	
	}
	

}
