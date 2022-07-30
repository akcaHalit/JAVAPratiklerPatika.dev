package PratiklerveOdevler2;

import java.util.Scanner;
public class UcakBileti {

	public static void main(String[] args) {
		int km,type,age;
		double perKm = 0.10,normalTutar,yasIndirimi,indirimliTutarYas,indirimliTutarTip,tip2Bilet,toplamTutar;
		Scanner in = new Scanner(System.in);
		
	
		System.out.println("Mesafeyi giriniz: ");
		km = in.nextInt();
		System.out.println("1=> Tek Y�n, 2=>Gidi�-D�n��");
		type = in.nextInt();
		System.out.println("Ya��n�z� giriniz: ");
		age = in.nextInt();
		
		// km ba��na 0.10 TL
		// yas<12 %50 indirim
		// 12-24 yas %10 indirim
		// yas>65 %30 indirim 
		// gidi� d�n�� %20 indirim
		
		
		
		if(km>0 && age>0 && (type==1 || type ==2)) {
			
			normalTutar = km*perKm;
			
			System.out.println("Normal Tutar:" + normalTutar +" TL");
			if(age < 12) {
				yasIndirimi = 0.5;
			}else if (age>=12 && age<=24) {
				yasIndirimi = 0.10;
			}else if(age>65) {
				yasIndirimi = 0.30;
			}else {
				yasIndirimi = 1;
			}
			
			indirimliTutarYas = normalTutar*yasIndirimi;
			
			System.out.println("Toplam ya� indirimi: "+ indirimliTutarYas + " TL");
			
			
			switch(type) {
				case 1:
					toplamTutar = normalTutar - indirimliTutarYas;	
					System.out.println("Toplam fiyat: "+toplamTutar+" TL");
					break;
				case 2:
					tip2Bilet = 0.20;
					indirimliTutarTip = (normalTutar - yasIndirimi)*tip2Bilet;
					System.out.println("Gidi�-D�n�� oldu�u i�in toplam indirim: "+indirimliTutarTip+" TL");
					toplamTutar = (normalTutar - yasIndirimi - indirimliTutarTip)*2; // 2 bilet
					System.out.println("Toplam fiyat : "+toplamTutar +" TL");
					break;
				default:
					System.out.println("Tip k�sm�na yanl�� bir de�er girdiniz !");
			}
			
		}else {
			System.out.println("Hatal� Veri girdiniz! Tekrar Deneyiniz.");
		}
		
	}

}
