package gelismisHesapMakinesi;

import java.util.Scanner;

public class Main {

	static void plus() {
		Scanner inp = new Scanner(System.in);
		int number, result = 0, i = 1;

		while (true) {
			System.out.print(i++ + " . sayi : ");
			number = inp.nextInt();
			if (number == 0) {
				break;
			}
			result += number;
		}
		System.out.println("Sonuc : " + result);
	}

	static void minus() {
		Scanner inp = new Scanner(System.in);
		System.out.print("Kac adet sayi gireceksiniz : ");
		int counter = inp.nextInt();
		int number, result = 0;

		for (int i = 1; i <= counter; i++) {
			System.out.print(i + ". sayi : ");
			number = inp.nextInt();

			if (i == 1) {
				result += number;
				continue;
			}
			result -= number;

		}

		System.out.println("Sonuc : " + result);
	}

	static void times() {
		Scanner inp = new Scanner(System.in);
		int number, result = 1, i = 1;

		while (true) {
			System.out.print(i++ + ". sayi : ");
			number = inp.nextInt();

			if (number == 1) {
				break;
			}

			if (number == 0) {
				result = 0;
				break;
			}
			result *= number;

		}

		System.out.println("Sonuc : " + result);
	}

	static void divided() {
		Scanner inp = new Scanner(System.in);
		System.out.print("Kac adet sayi gireceksiniz : ");
		int counter = inp.nextInt();
		double number, result = 0.0;

		for (int i = 1; i <= counter; i++) {
			System.out.print(i + ". sayi : ");
			number = inp.nextDouble();

			if (i != 1 && number == 0) {
				System.out.println("Boleni 0(Sıfır) giremezsiniz ");
				continue;
			}
			if (i == 1) {
				result = number;
				continue;
			}
			result /= number;
		}

		System.out.println("Sonuc : " + result);
	}

	static void power() {
		Scanner inp = new Scanner(System.in);
		System.out.print("Taban degeri giriniz : ");
		int base = inp.nextInt();
		System.out.print("Us degeri giriniz : ");
		int exp = inp.nextInt();
		int result = 1;

		for (int i = 1; i <= exp; i++) {
			result *= base;
		}

		System.out.println("Sonuc : " + result);
	}

	static void factorial() {
		Scanner inp = new Scanner(System.in);
		System.out.print("Sayi giriniz : ");
		int n = inp.nextInt();
		int result = 1;

		for (int i = 1; i <= n; i++) {
			result *= i;
		}

		System.out.println("Sonuc : " + result);
	}

	static void mod() {
		Scanner inp = new Scanner(System.in);
		System.out.print("Ilk sayiyi giriniz : ");
		int a = inp.nextInt();
		System.out.print("Ikinci sayiyi giriniz : ");
		int b = inp.nextInt();

		int result = a % b;

		System.out.println("Sonuc : " + result);

	}

	static void rectangle() {
		Scanner inp = new Scanner(System.in);
		System.out.print("Ilk kenar olcusunu giriniz : ");
		int a = inp.nextInt();
		System.out.print("Ikinci kenar olcusunu giriniz : ");
		int b = inp.nextInt();

		int alan = a * b;
		int cevre = 2 * (a + b);

		System.out.println("Dikdortgenin cevresi : " + cevre);
		System.out.println("Dikdortgenin alani : " + alan);

	}

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);

		int select;

		String menu = "1 - Toplama islemi\n" + "2 - Cıkarma islemi\n" + "3 - Carpma islemi\n" + "4 - Bolme islemi\n"
				+ "5 - Uslu sayi hesaplama\n" + "6 - Faktoriyel Hesaplama\n" + "7 - Mod alma islemi\n"
				+ "8 - Dikdortgen alan ve cevre hesabı\n" + "0 - Cıkıs yap";

		do {
			System.out.println(menu);
			System.out.print("Lutfen bir islem seciniz : ");
			select = inp.nextInt();

			switch (select) {
			case 1:
				plus();
				break;
			case 2:
				minus();
				break;
			case 3:
				times();
				break;
			case 4:
				divided();
				break;
			case 5:
				power();
				break;
			case 6:
				factorial();
				break;
			case 7:
				mod();
				break;
			case 8:
				rectangle();
				break;
			case 0:
				break;
			default:
				System.out.println("Yanlıs bir deger girdiniz, tekrar deneyiniz.");
			}

		} while (select != 0);

	}

}
