package PratikveOdevler3;

import java.util.Scanner;
public class FaktoriyelKombinasyon {

	public static void main(String[] args) {
		int i,n,r,fk = 1,fkN = 1,fkR = 1,c;
		Scanner in = new Scanner(System.in);
		
		System.out.println("�lk k�me ka� elemanl�?: ");
		n = in.nextInt();
		System.out.println("�kinci k�me ka� elemanl�?: ");
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
		// n elemanl� bir k�me ile r elemanl� bir k�me
		
		c = fkN/(fkR*fk);
		System.out.println(c);
		
		
	}

}
