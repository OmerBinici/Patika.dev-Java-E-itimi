import java.util.Scanner;

public class Main {
	
	static int f(int a, int b) {
		if(a == 1 || b == 0) {
			return 1;
		}
		
		return a * f(a, b-1);
		}
		

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("Ilk sayiyi giriniz : ");
		int a = inp.nextInt();
		
		System.out.print("Ikinci sayiyi giriniz : ");
		int b = inp.nextInt();
		
		System.out.println(f(a, b));

	}

}
