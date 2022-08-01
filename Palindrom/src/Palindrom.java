package PratikveOdevler4;

public class Palindrom {
	
	static boolean isPalindrom(int number) {
		int temp = number,reverseNumber = 0,lastNumber;
		
		while(temp !=0) {
			//System.out.println("sayı ==> "+temp);
			lastNumber = temp%10;
			//System.out.println("son basamak ==>"+lastNumber);
			reverseNumber =(reverseNumber*10)+lastNumber;
			//System.out.println("Reverse number ==>"+reverseNumber);
			temp /=10;
			//System.out.println("Yeni sayı ==>"+temp);
		}
		if(number == reverseNumber) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println(isPalindrom(4));
		
	}

}
