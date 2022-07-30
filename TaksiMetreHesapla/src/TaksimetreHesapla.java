package PratiklerveOdevler;
import java.util.Scanner;

public class TaksimetreHesapla {

	public static void main(String[] args) {
		
		/*			*Taksimetre Programý:
	        -  Taksimetre KM baþýna 2.20 TL tutmaktadýr.
	        -  Minimum ödenecek tutar 20 TL'dir. 20 TL altýnda ki ücretlerde yine 20 TL alýnacaktýr.
	        -  Taksimetre açýlýþ ücreti 10 TL'dir
	    */
		
		double mesafe,startPrice = 10,perKm = 2.20,totalPrice;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Mesafeyi km cinsinden giriniz: ");
		mesafe = in.nextDouble();
		
		totalPrice = (mesafe*perKm) + startPrice;
		
		//Toplam Tutarý Kontrol:
        totalPrice=(totalPrice<20) ? 20: totalPrice;
        
        System.out.println("----------------------------------------------------------");
        System.out.println(" Gidilen Mesafe(km)      : "+mesafe);
        System.out.println(" Taksimetre Açýlýþ Ücreti: "+startPrice);
        System.out.println(" Ödenecek Toplam Tutar   : "+totalPrice);

		
	}

}
