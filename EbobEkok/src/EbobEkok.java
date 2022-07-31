package PratikveOdevler3;

import java.util.Scanner;
public class EbobEkok {

	public static void main(String[] args) {
		int sayi1,sayi2,i=1;
		int ebob=1,ekok=1;
		Scanner in = new Scanner(System.in);
		
		System.out.println("1.sayýyý gir: ");
		sayi1 = in.nextInt();
		System.out.println("2.sayýyý gir: ");
		sayi2 = in.nextInt();
		
		int greater = (sayi1>sayi2)? sayi1: sayi2;	
		/*		EBOB for ile:
		for(i=1;i<=greater;i++) {
			if(sayi1%i == 0 && sayi2%i == 0) {
				ebob = i;
			}
		}	
		*/
		//    EBOB while ile:
		while(i<=greater) {
			if(sayi1%i == 0 && sayi2%i == 0) {
				ebob = i;
			}
			i++;
		}
		
		int n = sayi1*sayi2;
		/*     EKOK for ile:
		for(i=1;i<=n;i++) {
			if(i%sayi1==0 && i%sayi2==0) {
				ekok = i;
				break;
			}
		}
		*/
		// EKOK   while ile:
		i=1; // tekrardan i'yi 1 e eþitlemeliyim.
		while(i<=n) {
			if(i%sayi1==0 && i%sayi2==0) {
				ekok = i;
				break;
			}	
			i++;
		}
		System.out.println("ebob " + ebob);
		System.out.println("ekok: " + ekok);
		
	}

}
