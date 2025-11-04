import java.util.Scanner;

public class KuvvetBulma {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Sayı giriniz");
        int sayi = input.nextInt();

        for (int i = 1; i <= sayi; i *=4) {
            System.out.println("4 ün katları: " + i);
            }
        for (int j = 1; j <= sayi; j *= 5) {
            System.out.println("5 in katları: " + j);
        }
    }
}
