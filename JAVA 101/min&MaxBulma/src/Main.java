import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);

		System.out.print("Kac tane sayi gireceksiniz : ");
		int n = inp.nextInt();
		int enBuyuk = 0;
		int enKucuk = 0;

		int i = 1;
		while (i <= n) {
			System.out.print(i + ". sayiyi giriniz : ");
			int x = inp.nextInt();
			i++;

			if (x > enBuyuk) {
				enBuyuk = x;
			}

			if (x < enKucuk) {
				enKucuk = x;
			}

		}

		System.out.println("En buyuk sayi : " + enBuyuk);
		System.out.println("En kucuk sayi : " + enKucuk);

	}

}
