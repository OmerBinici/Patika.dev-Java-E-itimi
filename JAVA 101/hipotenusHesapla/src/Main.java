import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double ilkkenar,ikincikenar,hipotenus;

        Scanner inp = new Scanner(System.in);

        System.out.print("Ucgenin ilk kenar olcusunu giriniz : ");
        ilkkenar = inp.nextDouble();

        System.out.print("Ucgenin ikinci kenar olcusunu giriniz : ");
        ikincikenar = inp.nextDouble();

        hipotenus = Math.sqrt((ilkkenar * ilkkenar) + (ikincikenar * ikincikenar));
        System.out.println("Hipotenus uzunlugu : " + hipotenus);
    }
}
