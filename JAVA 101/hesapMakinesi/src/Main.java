import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double n1,n2,select;

        Scanner inp = new Scanner(System.in);

        System.out.print("Ilk Sayiyi giriniz : ");
        n1 = inp.nextDouble();

        System.out.print("Ikinci Sayiyi giriniz : ");
        n2 = inp.nextDouble();

        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        System.out.print("Seciminiz : ");
        select = inp.nextDouble();

        if (select == 1){
            System.out.println("Toplam : " + (n1 + n2));
        } else if (select == 2) {
            System.out.println("Cikarma : " + (n1 - n2));
        } else if (select == 3) {
            System.out.println("Carpma : " + (n1 * n2));
        } else if (select == 4) {
            if (n2 !=0){
                System.out.println("Bolme : " + (n1 / n2));
            }else {
                System.out.println("Bir sayi 0'a bolunemez!!!");
            }
        }else {
            System.out.println("Yanlis secim yaptiniz. Tekrar deneyiniz.");
        }

    }
}
