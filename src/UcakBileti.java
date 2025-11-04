import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {

        double yasucreti,sonucret;

        Scanner input = new Scanner(System.in);

        System.out.println("Kaç km yol gideceksiniz");
        int yol = input.nextInt();

        double ilkucret = yol * 0.10;

        System.out.println("Yaşınızı giriniz");
        int yas = input.nextInt();


        if (yas<12){
            yasucreti = ilkucret * 0.5; // %50 indirim
        } else if (yas<=24) {
            yasucreti = ilkucret * 0.9; // %10 indirim
        } else if (yas<65) {
            yasucreti= ilkucret; // indirim yok
        } else {
            yasucreti = ilkucret * 0.7; // %30 indirim
        }


        System.out.println("Yolculuk tipini seçiniz (1 - Tek Yön) , (2 , Gidiş Dönüş ) :");
        int secim = input.nextInt();



        if (secim==1){
            sonucret = yasucreti * 2;
            System.out.println("Toplam Tutarınız:" + yasucreti + "TL' dir");
        } else if (secim==2) {
            sonucret = yasucreti * 0.8 *2; // %20 indirim uygulanır
        } else {
            sonucret = yasucreti;
            System.out.println("Hatalı seçim yaptınız");
        }


        System.out.println(sonucret);
    }
}
