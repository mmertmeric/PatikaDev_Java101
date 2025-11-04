import java.util.Scanner;

public class yakin {
    public static void main(String[] args) {
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};

        Scanner scan = new Scanner(System.in);
        System.out.println("Bulunmasını istediğiniz sayıyı giriniz: ");
        int sayi = scan.nextInt();

        Integer minClose = null; // küçük en yakın sayı
        Integer maxClose = null; // büyük en yakın sayı

        for (int i : list) {
            if (i < sayi) {
                if (minClose == null || i > minClose) {
                    minClose = i;
                }
            }

            if (i > sayi) {
                if (maxClose == null || i < maxClose) {
                    maxClose = i;
                }
            }
        }

        System.out.println("Girilen sayı : " + sayi);
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + minClose);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + maxClose);
    }
}
