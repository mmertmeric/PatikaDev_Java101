import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = input.nextInt();

        int toplam = 0;
        int basamak;

        while (sayi != 0) {
            basamak = sayi % 10;   // son basamak
            toplam += basamak;     // toplama ekle
            sayi /= 10;            // sayıyı küçült
        }

        System.out.println("Basamaklar toplamı: " + toplam);
    }
}
