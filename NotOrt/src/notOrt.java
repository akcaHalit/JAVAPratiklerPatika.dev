package PratiklerveOdevler;

import java.util.Scanner;
public class notOrt {

	public static void main(String[] args) {
		int mat,fizik,tarih,turkce,muzik,kimya;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("matematik notunu gir :");
		mat = input.nextInt();
		System.out.println("fizik notunu gir :");
		fizik = input.nextInt();
		System.out.println("tarih notunu gir :");
		tarih = input.nextInt();
		System.out.println("turkce notunu gir :");
		turkce = input.nextInt();
		System.out.println("muzik notunu gir :");
		muzik = input.nextInt();
		System.out.println("kimya notunu gir :");
		kimya = input.nextInt();
		
		int toplam = (mat + fizik + tarih + turkce + muzik + kimya );
		double ort = toplam/6;
		System.out.println("Ortalamaniz : "+ort);
		
		boolean sonuc = ort > 60;
		String state = sonuc ? "Sinifi gecti" : "Sinifta kaldi ";
		System.out.println(state);
		
	}

}
