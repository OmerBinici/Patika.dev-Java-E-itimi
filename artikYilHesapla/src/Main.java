import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int year,remainder;

        Scanner inp = new Scanner(System.in);

        System.out.print("Yil Giriniz : ");
        year = inp.nextInt();

        remainder = year % 400 ;

        if (remainder == 0 ){
            System.out.println(year + " bir artik yildir !");
        }else {
            System.out.println(year + " bir artik yil degildir !");
        }
    }
}