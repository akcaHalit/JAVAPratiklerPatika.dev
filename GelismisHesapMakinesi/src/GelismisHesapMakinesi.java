package PratikveOdevler4;

import java.util.Scanner;
public class GelismisHesapMakinesi {

	static int sum(int a,int b) {
		int result = a+b;
		System.out.println("Toplam: "+result);
		return result;
	}
	static int substract(int a,int b) {
		int result = a-b;
		System.out.println("Kalan: "+result);
		return result;
	}
	static int multiply(int a,int b) {
		int result = a*b;
		System.out.println("�arp�m: "+result);
		return result;
	}
	static double divide(int a,int b) {
		if(b==0) {
			System.out.println("Bir say� s�f�ra b�l�nemez !");
			return 0;
		}else {
			double result = a/b;
			System.out.println("B�l�m: "+result);
			return result;
		}
	}
	static int exponent(int a,int b) {
		int result = 1;
		for(int i=1;i<=b;i++) {
			result *=a;
		}
		System.out.println("�ss�: "+result);
		return result;
	}
	static int modAl(int a,int b) {
		int result = a%b;
		System.out.println("Modu: "+result);
		return result;
	}
	static void dikdortgen(int a,int b) {
		int cevre = 2*(a+b);
		int alan = a*b;
		System.out.println("Cevre: "+cevre);
		System.out.println("Alan: "+alan);
	}
	
	
	
	public static void main(String[] args) {
		
		int choice;
		Scanner in  = new Scanner(System.in);
		int a,b;
		String menu = "1-Toplama ��lemi\n"
				+ "2-��karma ��lemi\n"
				+ "3-�arpma ��lemi\n"
				+ "4-B�lme ��lemi\n"
				+ "5-�sl� Say� Hesaplama\n"
				+ "6-Mod Alma\n"
				+ "7-Dikd�rtgen Alan ve �evre Hesab�\n"
				+ "0-��k�� Yap";
		
		while(true) {
			System.out.println(menu);
			System.out.println("Bir i�lem se�iniz: ");
			choice = in.nextInt();
			
			if(choice ==0) {
				break;
			}
			
			System.out.println("�lk say�y� giriniz:");
			a = in.nextInt();
			System.out.println("�kinci say�y� giriniz: ");
			b = in.nextInt();
		
			switch(choice) {
			case 1:
				sum(a,b);			
									break;

			case 2:
				substract(a,b);
									break;
			case 3:
				multiply(a,b);
									break;
			case 4:
				divide(a,b);
									break;
			case 5:
				exponent(a,b);	
									break;
			case 6:
				modAl(a,b);
									break;
			case 7:
				dikdortgen(a,b);
									break;
									
			default:
				System.out.println("Invalid Choice");
			
			}		
		}
		
		System.out.println("Sistem kapat�lm��t�r.");

	}

}
