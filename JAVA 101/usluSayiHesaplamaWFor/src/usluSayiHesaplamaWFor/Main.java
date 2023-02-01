package usluSayiHesaplamaWFor;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n, k, i, total;
		
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Ussu alinacak sayi : ");
		n= inp.nextInt();
		
		System.out.print("Us olacak sayi : ");
		k = inp.nextInt();
		
		total = 1;
		for(i = 1; i <= k; i++) {
			total *= n;
		}
		
		System.out.println("Sonuc : " + total);
	}

}
