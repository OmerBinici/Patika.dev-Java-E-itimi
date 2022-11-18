import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double mat,fizik,turkce,kimya,muzik,ortalama;

        Scanner inp = new Scanner(System.in);


        System.out.print("Matematik Notunuzu giriniz : ");
        mat = inp.nextDouble();

        System.out.print("Fizik Notunuzu giriniz : ");
        fizik = inp.nextDouble();

        System.out.print("Turkce Notunuzu giriniz : ");
        turkce = inp.nextDouble();

        System.out.print("Kimya Notunuzu giriniz : ");
        kimya = inp.nextDouble();

        System.out.print("Muzik Notunuzu giriniz : ");
        muzik = inp.nextDouble();


        ortalama = (mat + fizik + turkce + kimya + muzik) / 5 ;

        if (ortalama <= 55){
            System.out.println("Sinifta Kaldiniz!!");
        }else {
            System.out.println("Tebrikler, Sinifi Gectiniz!!");
        }
        System.out.println("Ortalamaniz : " + ortalama);
    }
}
