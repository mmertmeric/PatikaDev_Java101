import java.util.Scanner;

public class DaireAlan {
    public static void main(String[] args) {

        double pi = 3.14;
        int r;

        Scanner input = new Scanner(System.in);
        System.out.println("Yarıçap giriniz");
        r = input.nextInt();

        double alan = pi * r * r;
        System.out.println("Dairenin alanı :" + alan);

        double cevre = 2 * pi * r;
        System.out.println("Dairenin çevresi :" + cevre);

    }
}
