import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double perkm,taksimetreacılıs,taksimetre,km;

        perkm = 2.20;
        taksimetreacılıs = 10;

        Scanner inp = new Scanner(System.in);

        System.out.print("Gidilecek mesafeyi km cinsinden yaziniz : ");
        km = inp.nextDouble();

        taksimetre = taksimetreacılıs + (km * perkm);

        double sonuc = (taksimetre <= 20) ? 20 : taksimetre;

        System.out.println("Taksi ucretiniz : " + sonuc);
    }
}
