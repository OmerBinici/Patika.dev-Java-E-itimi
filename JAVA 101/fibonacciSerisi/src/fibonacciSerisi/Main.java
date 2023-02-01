package fibonacciSerisi;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Lütfen serinin eleman sayisini yaziniz : ");
		int n = inp.nextInt();
		
		int n1 = 0, n2 = 1, sum = 0;
		
		System.out.print(n1+ " " +n2);
		
		for (int i = 2; i <= n; i++) {
			sum = n1 + n2;
			System.out.print(" "+sum);
			n1 = n2;
			n2 = sum;
		}

	}

}
