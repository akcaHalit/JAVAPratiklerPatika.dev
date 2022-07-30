package PratiklerveOdevler;

import java.util.Scanner;
public class notOrt {

	public static void main(String[] args) {
		int mat,fizik,tarih,turkce,muzik,kimya;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("mat gir ");
		mat = input.nextInt();
		System.out.println("fizik gir ");
		fizik = input.nextInt();
		System.out.println("tarih gir ");
		tarih = input.nextInt();
		System.out.println("turkce gir ");
		turkce = input.nextInt();
		System.out.println("muzik gir ");
		muzik = input.nextInt();
		System.out.println("kimya gir ");
		kimya = input.nextInt();
		
		int toplam = (mat + fizik + tarih + turkce + muzik + kimya );
		double ort = toplam/6;
		System.out.println("Ortalamanýz : "+ort);
		
		boolean sonuc = ort > 60;
		String state = sonuc ? "Sýnýfý gecti" : "Sýnýfta kaldý ";
		System.out.println(state);
		
	}

}
