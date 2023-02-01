package tersUcgen;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner (System.in);
		
		System.out.print("Basamak sayisini giriniz : ");
		int n = inp.nextInt();
		
		for (int i = n; i >= 1; i--) {

			for (int j = n-i+1; j >=1; j--) {
				System.out.print(" ");
			}
			for (int k = 2*i-1; k >=1; k--) {
				System.out.print("*");
			}
			System.out.println();

		}

	}

}
