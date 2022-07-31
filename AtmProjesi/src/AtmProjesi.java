package PratikveOdevler3;

import java.util.Scanner;
public class AtmProjesi {

	public static void main(String[] args) {

		String userName,password;
		int choice,balance = 1500,right = 3;
		Scanner in = new Scanner(System.in);

		
		while(right>0) {
			System.out.println("--------------------------------------------------------");
			System.out.println("Kullanýcý Adýnýzý giriniz: ");
			userName = in.nextLine();
			System.out.println("Parolanýzý giriniz: ");
			password  = in.nextLine();
			
			if(userName.equals("patika") && password.equals("dev")) {
				System.out.println("Merhaba,Kodluyoruz Bankasýna Hoþgeldiniz.");	
				
				do {
					System.out.println("Ne yapmak istiyorsunuz*: ");
					System.out.println("1-Para yatýrmak\n"+ 
							"2-Para Çekmek\n"+
							"3-Bakiye Sorgula\n"+
							"4-Çýkýþ yap.");
					choice = in.nextInt();
					
					switch(choice) {
					case 1:
						System.out.println("Para miktarý: ");
						int price = in.nextInt();
						balance += price;
						System.out.println("Para yatýrma iþleminiz baþarýyla gerçekleþmiþtir.");
						System.out.println("Yeni bakiyeniz: "+balance);
						break;
					case 2:
						System.out.println("Ne kadar çekeceksiniz: ");
						price = in.nextInt();
						if(price > balance) {
							System.out.println("Yetersiz Bakiye! ");
							System.out.println("Çekebileceðiniz max tutar: "+balance);
						}else {
							balance -= price;
							System.out.println("Para çekme iþleminiz baþarýyla gerçekleþmiþtir.");
							System.out.println("Yeni bakiyeniz: "+balance);
						}
						break;
					case 3:
						System.out.println("Bakiyeniz: "+balance);
						continue;
					case 4:
						System.out.println("Çýkýþ iþleminiz baþarýyla gerçekleþmiþtir.");
						System.out.println("Tekrar görüþmek üzere !");
						break;
					default:
						System.out.println("Invalid Choice ! ");
					}
				}while(choice !=4);
				break;
				
				
				
				
			}else {
				right--;
				if(right==0) {
					System.out.println("Hesabýnýz bloke olmuþtur. Lütfen banka ile iletiþime geçiniz.");
				}else {
					System.out.println("Girdiðiniz veriler hatalý !");
					System.out.println("Kalan hakkýnýz: "+right);
					System.out.println("Tekrar Deneyiniz! ");
					continue;
				}
				
			}
			
			
			
		}
		
	
		
		
		
	}

}
