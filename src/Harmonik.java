import java.util.Scanner;

public class Harmonik {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Harmonik sayıyı giriniz");
        double sayi = scan.nextInt();

        double toplam = 0;
        double har;

        for (double i = 1; i <= sayi; i++) {
            har = 1 / i;
            toplam += har;
        }
        System.out.println(toplam);
    }
}
