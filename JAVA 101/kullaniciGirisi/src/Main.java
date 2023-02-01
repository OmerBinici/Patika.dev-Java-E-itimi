import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String userName, password,question,newPassword;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanici adiniz : ");
        userName = inp.nextLine();

        System.out.print("Sifreniz : ");
        password = inp.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Hosgeldiniz !!!");
            return;
        } else {
            System.out.println("Kullanici adiniz veya Sifreniz yanlis");
        }
        System.out.print("Sifrenizi sifirlamak icin Evet, istemiyorsaniz Hayir yazin : ");
        question = inp.nextLine();

        if (question.equals("Hayir")){
            System.out.println("Kullanici girisi yapilamadi!!!");
        }else {
            System.out.println("Sifreniz, eski sifreniz ve suan hatali girdiginiz sifre ile ayni olamaz !!!");

            System.out.print("Yeni sifrenizi giriniz : ");
            newPassword = inp.nextLine();

            if (newPassword.equals("java123")){
                System.out.println("Sifre olusturulamadi. Lütfen,baska sifre giriniz !!!");
            }else {
                System.out.println("Sifre olusturuldu.");
            }
        }




    }
}
