import java.util.Scanner;

public class usBul {

    static int power (int as , int us) {
        if (us == 0)
            return 1;
        else
            return as * power(as, us - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Tabanı gir");
        int as = sc.nextInt();

        System.out.println("Üssü gir");
        int us = sc.nextInt();

        int sonuc = power (as, us);

        System.out.println("Sonuç : " + sonuc);
    }
}

