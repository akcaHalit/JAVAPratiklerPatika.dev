package PratikveOdevler4;

import java.util.Scanner;
public class DeseneGoreMetotOlusturma {

	
	static int negative(int N) {
		if(N <= 0) {
			return N;
		}else {
			System.out.print(N + " ");
			return negative(N-5);
		}
		
		
	}
	
	static int positive(int N,int M) {
		if(N>M) {
			return N;
		}else {
			System.out.print(N+" ");
			return positive(N+5,M);
		}
		
	}
	

	public static void main(String[] args) {
		
		int N;
		Scanner in = new Scanner(System.in);
		
		System.out.println("N sayýsýný giriniz: ");
		N = in.nextInt();
		
		positive(negative(N),N);
		
	}

}
