package PratikveOdevler3;

import java.util.Scanner;
public class AtmProjesi {

	public static void main(String[] args) {

		String userName,password;
		int choice,balance = 1500,right = 3;
		Scanner in = new Scanner(System.in);

		
		while(right>0) {
			System.out.println("--------------------------------------------------------");
			System.out.println("Kullan�c� Ad�n�z� giriniz: ");
			userName = in.nextLine();
			System.out.println("Parolan�z� giriniz: ");
			password  = in.nextLine();
			
			if(userName.equals("patika") && password.equals("dev")) {
				System.out.println("Merhaba,Kodluyoruz Bankas�na Ho�geldiniz.");	
				
				do {
					System.out.println("Ne yapmak istiyorsunuz*: ");
					System.out.println("1-Para yat�rmak\n"+ 
							"2-Para �ekmek\n"+
							"3-Bakiye Sorgula\n"+
							"4-��k�� yap.");
					choice = in.nextInt();
					
					switch(choice) {
					case 1:
						System.out.println("Para miktar�: ");
						int price = in.nextInt();
						balance += price;
						System.out.println("Para yat�rma i�leminiz ba�ar�yla ger�ekle�mi�tir.");
						System.out.println("Yeni bakiyeniz: "+balance);
						break;
					case 2:
						System.out.println("Ne kadar �ekeceksiniz: ");
						price = in.nextInt();
						if(price > balance) {
							System.out.println("Yetersiz Bakiye! ");
							System.out.println("�ekebilece�iniz max tutar: "+balance);
						}else {
							balance -= price;
							System.out.println("Para �ekme i�leminiz ba�ar�yla ger�ekle�mi�tir.");
							System.out.println("Yeni bakiyeniz: "+balance);
						}
						break;
					case 3:
						System.out.println("Bakiyeniz: "+balance);
						continue;
					case 4:
						System.out.println("��k�� i�leminiz ba�ar�yla ger�ekle�mi�tir.");
						System.out.println("Tekrar g�r��mek �zere !");
						break;
					default:
						System.out.println("Invalid Choice ! ");
					}
				}while(choice !=4);
				break;
				
				
				
				
			}else {
				right--;
				if(right==0) {
					System.out.println("Hesab�n�z bloke olmu�tur. L�tfen banka ile ileti�ime ge�iniz.");
				}else {
					System.out.println("Girdi�iniz veriler hatal� !");
					System.out.println("Kalan hakk�n�z: "+right);
					System.out.println("Tekrar Deneyiniz! ");
					continue;
				}
				
			}
			
			
			
		}
		
	
		
		
		
	}

}
