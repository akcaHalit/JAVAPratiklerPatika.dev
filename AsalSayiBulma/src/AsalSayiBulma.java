package PratikveOdevler3;

public class AsalSayiBulma {

	public static void main(String[] args) {
		
		//Java ile 1 - 100 aras�ndaki asal say�lar� ekrana yazd�ran program� yaz�n�z.
		int i,j;
		
		for(i=2;i<=100;i++) {
			int count = 0;
			
			for(j=2;j<i;j++) {
				
				if(i%j==0) {
					count++;
				}
						
			}
			if(count == 0 ) {
				System.out.print(i+" ");
			}	
			
		}
		
		
	}

}
