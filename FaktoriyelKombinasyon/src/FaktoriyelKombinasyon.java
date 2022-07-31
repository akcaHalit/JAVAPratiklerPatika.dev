package PratikveOdevler3;

import java.util.Scanner;
public class FaktoriyelKombinasyon {

	public static void main(String[] args) {
		int i,n,r,fk = 1,fkN = 1,fkR = 1,c;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Ýlk küme kaç elemanlý?: ");
		n = in.nextInt();
		System.out.println("Ýkinci küme kaç elemanlý?: ");
		r = in.nextInt();

		
		for(i=1; i<=n; i++) {
			fkN *= i;			// fkN = n!
		}
		for(i=1;i<=r; i++) {
			fkR *= i;
		}
		for(i=1;i<=(n-r);i++) {
			fk *= i;
		}
		// n elemanlý bir küme ile r elemanlý bir küme
		
		c = fkN/(fkR*fk);
		System.out.println(c);
		
		
	}

}
