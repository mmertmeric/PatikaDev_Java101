import java.util.Scanner;

public class asalBul {


    static boolean isPrime(int n, int i) {

        if (n <= 1)
            return false;

        if (n % i == 0)
            return false;

        if (i*i > n)
            return true;

        return isPrime(n,i+1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Sayı giriniz : ");
        int sayi = sc.nextInt();

        if (isPrime(sayi, 2)) {
            System.out.println(sayi + " asaldır");
        } else {
            System.out.println(sayi + " asal değildir");
        }
    }
}
