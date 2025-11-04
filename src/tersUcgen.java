import java.util.Scanner;

public class tersUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz: ");
        int n = input.nextInt();

        for (int i = n; i >= 1; i--) { // Satırlar
            for (int j = 1; j <= (2 * i - 1); j++) { // Yıldızlar
                System.out.print("*");
            }
            System.out.println(); // Satır bitince alt satıra geç
        }
    }
}
