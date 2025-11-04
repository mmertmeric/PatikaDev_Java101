import java.util.Scanner;

public class KdvCalc {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Sepet Tutarını Giriniz: ");
        double sepet = input.nextDouble();

        double kdvOrani;
        double kdvTutar;
        double toplam;

        if (sepet <= 1000) {
            kdvOrani = 0.18;
        } else {
            kdvOrani = 0.08;
        }

        kdvTutar = sepet * kdvOrani;
        toplam = sepet + kdvTutar;

        System.out.println("KDV Tutarı: " + kdvTutar);
        System.out.println("KDV Dahil Toplam: " + toplam);
    }
}
