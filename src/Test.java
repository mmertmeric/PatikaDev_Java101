import java.util.Scanner;

public class Test {
    public static void main (String[]args){

        Scanner input = new Scanner(System.in);
        int sayi;

        while (true) {
            System.out.print("Sayı gir (0 çıkış): ");
            sayi = input.nextInt();

            if (sayi < 0)
                continue;  // negatif sayıları atla

            if (sayi == 0)
                break;     // 0 girince döngüden çık

            System.out.println("Girdiğiniz sayı: " + sayi);
        }
        System.out.println("Program bitti.");
    }
}
