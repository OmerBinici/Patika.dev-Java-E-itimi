import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		int a, i, sum, average, counter;
		sum = 0;
		counter = 0;
		
		Scanner inp = new Scanner(System.in);
		System.out.print("Lütfen bir sayi giriniz : ");
		a = inp.nextInt();
		
		for(i = 1; i <= a; i++) {
			if(i % 3 == 0  && i % 4 == 0) { 
				System.out.println(i);
				sum += i; 
				counter++;
			}
		}
		
		
		if (sum != 0) {
			average = sum / counter;
			System.out.println("0 ve " + a + " sayıları arasındaki 3 ve 4'e tam bölünen sayıların ortalaması : " + average);
		}else {
			System.out.println("0 ve " + a + " sayilari arasında 3 ve 4'e tam bölünen sayi bulunmamaktadır.");
		}
		
		

	}

}
