import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double ucret,kdvliucret,kdvtutarı,kdvoranı;


        Scanner inp = new Scanner(System.in);

        System.out.print("Lutfen, Ucret tutarini giriniz : ");
        ucret = inp.nextDouble();

        kdvoranı = (ucret >= 0 && ucret <= 1000) ? 0.18 : 0.08;

        System.out.println("KDV'siz Fiyat : " + ucret);

        kdvliucret = ucret + (ucret * kdvoranı);
        System.out.println("KDV'li Fiyat : " + kdvliucret);

        kdvtutarı = kdvliucret - ucret;
        System.out.println("KDV Tutari :  " + kdvtutarı);
        System.out.println("KDV Orani : " + kdvoranı);

    }
}
