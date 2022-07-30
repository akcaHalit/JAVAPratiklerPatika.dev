package PratiklerveOdevler;
import java.util.Scanner;
public class KDVhesapla {

	public static void main(String[] args) {
		
		double tutar,kdvOran,kdvTutar,kdvliTutar;
		boolean kdvDurumu;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Tutarý giriniz :");
		tutar = in.nextDouble();
		
	
		// 0-1000 TL arasý %18 KDV 1000 TL üstü %8 oranýnda hesaplaancaktýr.
		// KDV Oraný Kontrolü
		kdvDurumu= (0<tutar) && (tutar<1000);
        kdvOran=kdvDurumu ? 0.18d: 0.08d;
        
        System.out.println("--------------------------------------");
		System.out.println("KDV Oraný :"+kdvOran);
		
		kdvTutar=tutar*kdvOran;
	    kdvliTutar=kdvTutar+tutar;
	    
	    System.out.println(" KDV'siz Tutar: "+tutar);
        System.out.println(" KDV oraný    : "+kdvOran);
        System.out.println(" KDV Tutarý   : "+kdvTutar);
        System.out.println(" KDV'li Tutarý: "+kdvliTutar);

	}

}
