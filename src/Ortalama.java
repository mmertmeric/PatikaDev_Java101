import java.util.Scanner;

public class Ortalama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Kaç ders var: ");
        int n = sc.nextInt();

        int[] notlar = new int[n];
        int toplam = 0;

        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". not: ");
            notlar[i] = sc.nextInt();
            toplam += notlar[i];
        }

        double ort = (double) toplam / n;
        System.out.println("Ortalama: " + ort);
    }
}
