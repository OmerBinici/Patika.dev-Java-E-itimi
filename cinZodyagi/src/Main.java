import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int yearOfBirth, remainder;
        String zodyak = "";

        Scanner inp = new Scanner(System.in);

        System.out.print("Dogum yilinizi giriniz : ");
        yearOfBirth = inp.nextInt();
        if (yearOfBirth > 2022){
            System.out.println("Hatali veri girisi yaptiniz !");
            return;
        }

        remainder = yearOfBirth % 12;
        System.out.println(remainder);

        switch (remainder) {
            case 0:
                zodyak = ("Maymun");
                break;
            case 1:
                zodyak = ("Horoz");
                break;
            case 2:
                zodyak = ("Kopek");
                break;
            case 3:
                zodyak = ("Domuz");
                break;
            case 4:
                zodyak = ("Fare");
                break;
            case 5:
                zodyak = ("Okuz");
                break;
            case 6:
                zodyak = ("Kaplan");
                break;
            case 7:
                zodyak = ("Tavsan");
                break;
            case 8:
                zodyak = ("Ejderha");
                break;
            case 9:
                zodyak = ("Yilan");
                break;
            case 10:
                zodyak = ("At");
                break;
            case 11:
                zodyak = ("Koyun");
                break;
            default:
                System.out.println("Hatali veri girdiniz!");

        }
        System.out.println("Cin Zodyagi Burcunuz : " + zodyak);
    }
}