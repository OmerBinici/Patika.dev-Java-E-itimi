import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double mat,fizik,turkce,kimya,muzik,toplam,derssayisi,ortalama;
        toplam = 0;
        derssayisi = 0;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz :  ");
        mat = inp.nextDouble();
        if (mat < 0 || mat > 100){
            System.out.println("Matematik notunuz 0 - 100 araliginda olmadigi icin ortalamaya dahil edilmeyecektir.");
        }else {
            toplam += mat;
            derssayisi += 1;
        }

        System.out.print("Fizik notunuzu giriniz :  ");
        fizik = inp.nextDouble();
        if (fizik < 0 || fizik > 100){
            System.out.println("Fizik notunuz 0 - 100 araliginda olmadigi icin ortalamaya dahil edilmeyecektir.");
        }else {
            toplam += fizik;
            derssayisi += 1;
        }

        System.out.print("Turkce notunuzu giriniz :  ");
        turkce = inp.nextDouble();
        if (turkce < 0 || turkce > 100){
            System.out.println("Turkce notunuz 0 - 100 araliginda olmadigi icin ortalamaya dahil edilmeyecektir.");
        }else {
            toplam += turkce;
            derssayisi += 1;
        }

        System.out.print("Kimya notunuzu giriniz :  ");
        kimya = inp.nextDouble();
        if (kimya < 0 || kimya > 100){
            System.out.println("Kimya notunuz 0 - 100 araliginda olmadigi icin ortalamaya dahil edilmeyecektir.");
        }else {
            toplam += kimya;
            derssayisi += 1;
        }

        System.out.print("Muzik notunuzu giriniz :  ");
        muzik = inp.nextDouble();
        if (muzik < 0 || muzik > 100){
            System.out.println("Muzik notunuz 0 - 100 araliginda olmadigi icin ortalamaya dahil edilmeyecektir.");
        }else {
            toplam += muzik;
            derssayisi += 1;
        }

        ortalama = toplam / derssayisi;

        if (ortalama < 55){
            System.out.println("Sinifta Kaldınız!!!");
        }else {
            System.out.println("Sinifi Gectiniz!!!");
        }
        System.out.println("Ortalamaniz : " + ortalama);
    }
}
