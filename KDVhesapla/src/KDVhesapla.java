package PratiklerveOdevler;
import java.util.Scanner;
public class KDVhesapla {

	public static void main(String[] args) {
		
		double tutar,kdvOran,kdvTutar,kdvliTutar;
		boolean kdvDurumu;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Tutar� giriniz :");
		tutar = in.nextDouble();
		
	
		// 0-1000 TL aras� %18 KDV 1000 TL �st� %8 oran�nda hesaplaancakt�r.
		// KDV Oran� Kontrol�
		kdvDurumu= (0<tutar) && (tutar<1000);
        kdvOran=kdvDurumu ? 0.18d: 0.08d;
        
        System.out.println("--------------------------------------");
		System.out.println("KDV Oran� :"+kdvOran);
		
		kdvTutar=tutar*kdvOran;
	    kdvliTutar=kdvTutar+tutar;
	    
	    System.out.println(" KDV'siz Tutar: "+tutar);
        System.out.println(" KDV oran�    : "+kdvOran);
        System.out.println(" KDV Tutar�   : "+kdvTutar);
        System.out.println(" KDV'li Tutar�: "+kdvliTutar);

	}

}
