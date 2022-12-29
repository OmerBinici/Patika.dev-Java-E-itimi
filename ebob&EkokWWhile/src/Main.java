import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		System.out.print("N1 Sayisini giriniz : ");
		int N1 = inp.nextInt();

		System.out.print("N2 Sayisini giriniz : ");
		int N2 = inp.nextInt();

		int ebob = 1;
		int ekok = 0;
		if (N2 > N1) {
			int i = 1;
			while (i <= N1) {
				if (N1 % i == 0 && N2 % i == 0) {
					ebob = i;
				}
				i++;
			}
			System.out.println(N1 + " ve " + N2 + " sayilarinin EBOB degeri : " + ebob);
		} else {
			int i = 1;
			while (i <= N2) {
				if (N1 % i == 0 && N2 % i == 0) {
					ebob = i;
				}
				i++;
			}
			System.out.println(N1 + " ve " + N2 + " sayilarinin EBOB degeri : " + ebob);
		}
		System.out.println("---------------------------------");

		int k = 1;
		while (k <= N1 * N2) {
			if (k % N1 == 0 && k % N2 == 0) {
				ekok = k;
				System.out.println(N1 + " ve " + N2 + " sayilarinin EKOK degeri : " + ekok);
				break;
			}
			k++;
		}

	}

}
