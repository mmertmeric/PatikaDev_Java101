import java.util.Scanner;

public class mukemmelSayi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = input.nextInt();

        int toplam = 0;

        for (int i = 1; i < sayi; i++) {     // kendisi hariç bölenler
            if (sayi % i == 0) {             // tam bölünüyorsa
                toplam += i;                 // böleni toplama ekle
            }
        }

        if (toplam == sayi) {
            System.out.println(sayi + " mükemmel sayıdır.");
        } else {
            System.out.println(sayi + " mükemmel sayı değildir.");
        }
    }
}
