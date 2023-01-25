package patternWRecursive;

import java.util.Scanner;

public class Main {
	
	static void pattern(int n, int i) {
		
		if(i == 0) {
			return;
		}
		
		if(i == 1) {
			System.out.println(n + " ");
		}
		
		if(i >= 1) {
			int temp = n - 5;
			System.out.println(temp + " ");
			int j = i;
			
			if(temp > 0) {
				pattern(temp, i+1);
			}
			
			if(temp <= 0) {
				pattern(n, -j);
			}
		}
		
		if(i < 1) {
			System.out.println(n + " ");
			pattern(n+5, i+1);	
		}	
	}

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("Lütfen bir sayi giriniz : ");
		int n = inp.nextInt();
		
		pattern(n, 1);
	}

}
