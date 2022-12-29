package atmProjesiWSwitchCase;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String username, password;
		Scanner inp = new Scanner(System.in);
		int right = 3;
		int balance = 2000;
		int select;
		
		while(right > 0) {
			System.out.print("Kullanici adiniz : ");
			username = inp.nextLine();
			
			System.out.print("Parolaniz : ");
			password = inp.nextLine();
			
			if(username.equals("patika.dev") && password.equals("java1237")) {
				System.out.println("Kodluyoruz Bankasina Hoşgeldiniz !!!!");
				
				do {
					System.out.println("1-Para yatırma\n" + 
							"2-Para çekme\n" + 
							"3-Bakiye sorgula\n" +
							"4-Cikiş yap");
					System.out.print("Lütfen, yapmak istediginiz islemi seciniz : ");
					select = inp.nextInt();
					
					switch(select) {
					case 1:
					System.out.print("Yatırmak istediginiz miktar : ");
					int price = inp.nextInt();
					System.out.println("Paraniz yatirildi.");
					balance += price;
					break;
					
					case 2:
					System.out.print("Cekmek istediginiz miktar : ");
					price = inp.nextInt();
					if(price > balance) {
						System.out.println("Bakiye Yetersiz!!!");
					}else {
						
						balance -= price;
						System.out.println("Lütfen, paranizi aliniz.");
					}
					break;
					
					case 3:
					System.out.println("Bakiyeniz : " + balance);
					break;
					
					case 4:
						System.out.println("Tekrar görüşmek üzere.");
						break;
						
					default:
						System.out.println("Yanlıs secim yaptiniz.");
						
					}
					
					
				}while(select != 4);
				break;
				
			}else {
				right--;
				System.out.println("Hatali kullanici adi veya sifre. Tekrar deneyiniz.");
				if(right == 0) {
					System.out.println("Hesabiniz bloke olmustur, lütfen banka ile iletisime geciniz.");
				}else {
					System.out.println("Kalan hakkiniz : " + right);
				}
			}
		}

	}

}
