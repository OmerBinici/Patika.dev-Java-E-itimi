package asalSayiBulWRecursive;

import java.util.Scanner;

public class Main {
	
	static boolean isPrime(int p, int i) {
		
		if(p <= 2) {
			return (p == 2) ? true : false;
		}
		
		if(p == i ) {
			return true;
		}
		
		if(p % i == 0) {
			return false;
		}
		
		return isPrime(p, i+1);
	}

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Lütfen bir sayi giriniz : ");
		int p = inp.nextInt();
		
		if(isPrime(p, 2)) {
			System.out.println(p + " is a Prime Number");
		}else {
			System.out.println(p + " is NOT a Prime Number");
		}
		

	}

}
