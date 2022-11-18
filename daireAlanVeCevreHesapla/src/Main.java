import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double r, pi,alan,cevre,alfaacısı,dilimalanı;
        pi = 3.14;

        Scanner inp = new Scanner(System.in);

        System.out.print("Yaricap olcusu giriniz : ");
        r = inp.nextDouble();

        System.out.print("Merkez acisini giriniz : ");
        alfaacısı = inp.nextDouble();

        alan = pi * r * r;
        System.out.println("Dairenin alan : " + alan);

        cevre = 2 * pi * r;
        System.out.println("Dairenin cevre : " + cevre);

        dilimalanı =(pi * (r * r) * alfaacısı) / 360;
        System.out.println("Merkez acisi  " + alfaacısı + " olan dairenin alani :  " + dilimalanı);
    }
}
