import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n, i, j;
		
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Sinir sayisini giriniz : ");
		n = inp.nextInt();
		
		System.out.println("Girilen sayiya kadar 4'un kuvvetleri : ");
		for(i = 1; i <= n; i *= 4) {
			System.out.println(i);
		}
		System.out.print("------------------------------------\n");
		System.out.println("Girilen sayiya kadar 5'un kuvvetleri  : ");
		for(j = 1; j <= n; j *= 5) {
			System.out.println(j);
		}

	}

}
