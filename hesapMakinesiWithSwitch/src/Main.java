import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double n1,n2;
        int select;

        Scanner inp = new Scanner(System.in);

        System.out.print("Ilk Sayiyi giriniz : ");
        n1 = inp.nextDouble();

        System.out.print("Ikinci Sayiyi giriniz : ");
        n2 = inp.nextDouble();

        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        System.out.print("Seciminiz : ");
        select = inp.nextInt();

        switch (select) {
            case 1:
                System.out.println("Toplam : " + (n1 + n2));
                break;
            case 2:
                System.out.println("Cikarma : " + (n1 - n2));
                break;
            case 3:
                System.out.println("Carpma : " + (n1 * n2));
                break;
            case 4:
                if (n2 != 0) {
                    System.out.println("Bolme : " + (n1 / n2));
                } else {
                    System.out.println("Bir sayi 0'a bolunemez!!!");
                }

                break;
            default:
                    System.out.println("Yanlis secim yaptiniz. Tekrar deneyiniz.");

        }

    }
}
