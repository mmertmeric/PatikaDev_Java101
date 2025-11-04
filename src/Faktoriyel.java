import java.util.Scanner;

public class Faktoriyel {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Faktöriyelini hesaplamak istediğiniz sayıyı giriniz");
        int sayi = input.nextInt();
        int fak = 1;

        for (int j = 1; j <= sayi; j++) {
            fak = fak * j;
        }
        System.out.println(fak);
    }
}
