package PratiklerveOdevler;
import java.util.Scanner;

public class TaksimetreHesapla {

	public static void main(String[] args) {
		
		/*			*Taksimetre Program�:
	        -  Taksimetre KM ba��na 2.20 TL tutmaktad�r.
	        -  Minimum �denecek tutar 20 TL'dir. 20 TL alt�nda ki �cretlerde yine 20 TL al�nacakt�r.
	        -  Taksimetre a��l�� �creti 10 TL'dir
	    */
		
		double mesafe,startPrice = 10,perKm = 2.20,totalPrice;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Mesafeyi km cinsinden giriniz: ");
		mesafe = in.nextDouble();
		
		totalPrice = (mesafe*perKm) + startPrice;
		
		//Toplam Tutar� Kontrol:
        totalPrice=(totalPrice<20) ? 20: totalPrice;
        
        System.out.println("----------------------------------------------------------");
        System.out.println(" Gidilen Mesafe(km)      : "+mesafe);
        System.out.println(" Taksimetre A��l�� �creti: "+startPrice);
        System.out.println(" �denecek Toplam Tutar   : "+totalPrice);

		
	}

}
