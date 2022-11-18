import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        double a,b,c;

        Scanner inp = new Scanner(System.in);

        System.out.print("Ilk sayiyi giriniz : ");
        a = inp.nextDouble();

        System.out.print("Ikinci sayiyi giriniz : ");
        b = inp.nextDouble();

        System.out.print("Ucuncu sayiyi giriniz : ");
        c = inp.nextDouble();

        if (a > b && a > c){
            if (b > c){
                System.out.println("c < b < a");
            }else {
                System.out.println("b < c < a");
            }
        } else if (b > a && b > c) {
            if (a > c){
                System.out.println("c < a < b");
            }else {
                System.out.println("a < c< b");
            }
        } else if (c > a && c > b) {
            if (b > a){
                System.out.println("a < b < c");
            }else {
                System.out.println("b < a < c");
            }
        }
    }
}
