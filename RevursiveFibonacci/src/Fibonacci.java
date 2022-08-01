package PratikveOdevler4;

public class Fibonacci {

	static int fibo(int n) {
		 
		if( n==1 || n==2) {
			return 1;
		}
		int result = fibo(n-1)+fibo(n-2);
		return result;
	}
	
	public static void main(String[] args) {

		int a = fibo(6);
		System.out.println(a);
		
	}

}
