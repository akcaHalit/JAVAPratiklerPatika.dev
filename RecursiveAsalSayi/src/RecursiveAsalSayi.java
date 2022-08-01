package PratikveOdevler4;

import java.util.Scanner;
public class RecursiveAsalSayi {

	public static void asalMi(int number,int i) {
		
		while(true){
		if( number ==1 || number<=0) {			
			System.out.println(number+ " bir asal sayý deðildir.");
			break;
		}else if(i == number) {
			System.out.println(number+" bir asal sayýdýr.");
			break;	
		}else if(number%i==0) {
			System.out.println(number+" bir asal sayý deðildir.");
			break;
		}
		asalMi(number,i+1);
		break;
		}
		
	}
	
	public static void main(String[] args) {
		
		int number;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Sayý giriniz: ");
		number = in.nextInt();
		
		asalMi(number,2);
		
	}

}
