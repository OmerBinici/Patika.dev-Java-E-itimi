import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double heat;

        Scanner inp = new Scanner(System.in);

        System.out.print("Sicaklik degeri giriniz : ");
        heat = inp.nextDouble();

        if (heat <= 5) {
            System.out.println("Kayak yapabilirsiniz.");
        } else if (heat <= 25) {
            if (heat > 5 && heat <= 15) {
                System.out.println("Sinemaya gidebilirsiniz.");
            }
            if (heat >= 15 && heat <= 25) {
                System.out.println("Piknige gidebilirsiniz.");
            }
        }else {
                System.out.println("Yuzmeye gidebilirsiniz.");
            }

    }
}
