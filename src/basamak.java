import java.util.Scanner;

public class basamak {

    // Recursive metot
    static int bulma(int sayi) {
        // Taban durum: sayı sıfır olduğunda toplam sıfır olur
        if (sayi == 0)
            return 0;

        // Son basamağı al
        int sonBasamak = sayi % 10;

        // Kalan sayının basamak toplamını recursive olarak bul
        int kalanToplam = bulma(sayi / 10);

        // Şu anki basamak + alt toplamı geri döndür
        return sonBasamak + kalanToplam;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Basamak toplamını bulmak istediğin sayıyı gir: ");
        int sayi = sc.nextInt();

        int sonuc = bulma(sayi);
        System.out.println("Basamak toplamı: " + sonuc);
    }
}
