package kombinasyonHesaplama;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		
		int n, r, total1, total2, i, j, C;
		total1 = 1;
		total2 = 1;
		
		System.out.print("Kombinasyon için ilk degeri giriniz : ");
		n= inp.nextInt();
		for(i = 1; i <= n; i++) {
			total1 *= i;
		}
		//System.out.println(total1);
		
		System.out.print("Kombinasyon için ikinci değeri giriniz : ");
		r = inp.nextInt();
		for(j = 1; j <= r; j++) {
			total2 *= j;
		}
		//System.out.println(total2);
		
		C = total1 / (total2 * (n - r));
		
		System.out.print("C(n,r) kombinasyonunun sonucu : " + C);
	}

}
