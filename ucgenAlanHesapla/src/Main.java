import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double ilkkenar,ikincikenar,ucuncukenar,ucgencevresi,alan;

        Scanner inp = new Scanner(System.in);

        System.out.print("Ucgenin ilk kenar uzunlugunu giriniz : ");
        ilkkenar = inp.nextDouble();

        System.out.print("Ucgenin ikinci kenar uzunlugunu giriniz : ");
        ikincikenar = inp.nextDouble();

        System.out.print("Ucgenin ucuncu kenar uzunlugunu giriniz : ");
        ucuncukenar = inp.nextDouble();

        ucgencevresi = ilkkenar + ikincikenar + ucuncukenar;
        double u = ucgencevresi / 2;
        alan = Math.sqrt((u * (u-ilkkenar) * (u-ikincikenar) * (u-ucuncukenar)));

        System.out.println("Ucgenin alan olcusu : " + alan);
    }
}
