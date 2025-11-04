import java.util.Scanner;

public class ters {

    static int reverse(int n, int temp) {
        // Taban durum: sayı bittiğinde temp son haliyle dön
        if (n == 0)
            return temp;

        int last = n % 10;              // son basamak
        temp = temp * 10 + last;        // ters sayıya ekle
        return reverse(n / 10, temp);   // kalan için kendini çağır
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int n = sc.nextInt();

        int result = reverse(n, 0);
        System.out.println("Ters: " + result);
    }
}
