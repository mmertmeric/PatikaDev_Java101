import java.util.Scanner;

public class   BuyukKucukBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz: ");
        int adet = input.nextInt();

        int sayi;
        int enBuyuk = 0;
        int enKucuk = 0;

        for (int i = 1; i <= adet; i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            sayi = input.nextInt();

            if (i == 1) {
                // İlk sayıysa, başlangıç değerlerini belirle
                enBuyuk = sayi;
                enKucuk = sayi;
            } else {
                if (sayi > enBuyuk)
                    enBuyuk = sayi;
                if (sayi < enKucuk)
                    enKucuk = sayi;
            }
        }

        System.out.println("En büyük sayı: " + enBuyuk);
        System.out.println("En küçük sayı: " + enKucuk);
    }
}
