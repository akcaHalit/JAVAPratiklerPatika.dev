package PratiklerveOdevler2;
import java.util.Scanner;
public class KullaniciGirisi {

	public static void main(String[] args) {
		String userName,password,newPassword;
		int choice;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Kullanici adinizi giriniz : ");
		userName = in.nextLine();
		System.out.println("Sifrenizi giriniz: ");
		password = in.nextLine();
		
		if(userName.equals("patika") && password.equals("dev")) {
			System.out.println("Giris basariyla gerceklesti.");
		}else if (userName.equals("patika") && password != "dev"){
			System.out.println("Sifreniz yanlis !");
			System.out.println("Sifrenizi sýfýrlamak ister misiniz? :\n 1-Evet  2-Hayýr");
			choice = in.nextInt();
			if(choice==1) {
				System.out.println("Yeni sifreniz ?:");
				newPassword = in.next();
				if(newPassword.equals("dev")) {
					System.out.println("Eski sifre ile yeni sifre ayni olamaz !");
				}else {
					System.out.println("Yeni sifreniz basari ile olusturuldu.");
				}
			}
		}else if(userName != "patika" && password.equals("dev")){
			System.out.println("Kullanici adiniz yanlis !");
		}else {
		}
			System.out.println("Giris Yapilamadi!");
	
	}
		
}


