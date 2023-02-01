import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double km,age,typeoftrip,perkm,price;
        perkm = 0.10;

        Scanner inp = new Scanner(System.in);

        System.out.print("Yolculuk tipini giriniz (1 --> Tek yon , 2 --> Gidis-Donus) : ");
        typeoftrip = inp.nextDouble();

        if (typeoftrip == 1 || typeoftrip == 2){
        }else {
            System.out.println("Hatali veri girdiniz !");
            return;
        }

        System.out.print("Mesafeyi km cinsinden giriniz : ");
        km = inp.nextDouble();

        if (km > 0){
        }else {
            System.out.println("Hatali veri girdiniz !");
            return;
        }

        System.out.print("Yasinizi giriniz : ");
        age = inp.nextDouble();

        if (age > 0 ){
        }else {
            System.out.println("Hatali veri girdiniz !");
            return;
        }

        price = km * perkm;

        if (age < 12){
            price -= (price * 0.50);
        } else if (age >=12 && age <= 24 ) {
            price -= (price * 0.10);
        } else if (age >= 65 ) {
            price -= (price * 0.30);
        }

        if (typeoftrip == 1){
            price = price ;
        }else {
            price = (price - (price * 0.20)) * 2;
        }

        System.out.println("Toplam ucak bileti ucretiniz : " + price);


    }
}