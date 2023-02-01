import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double armut,elma,domates,muz,patlican,toplam;
        double armutF=2.14,elmaF=3.67,domatesF=1.11,muzF=0.95,patlicanF=5.00;

        Scanner inp = new Scanner(System.in);

        System.out.print("Armut Kac Kilo ? : ");
        armut = inp.nextDouble();

        System.out.print("Elma Kac Kilo ? : ");
        elma = inp.nextDouble();

        System.out.print("Domates Kac Kilo ? : ");
        domates = inp.nextDouble();

        System.out.print("Muz Kac Kilo ? : ");
        muz = inp.nextDouble();

        System.out.print("Patlican Kac Kilo ? : ");
        patlican = inp.nextDouble();

        toplam = (armut*armutF) + (elma*elmaF) + (domates*domatesF) + (muz*muzF) + (patlican*patlicanF);
        System.out.println("Toplam Tutar : " + toplam);

    }
}
