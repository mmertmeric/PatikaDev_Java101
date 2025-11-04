import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Fibonacci kaç basamaklı olsun");
        int basamak = input.nextInt();

        int a= 0;
        int b = 1;

        System.out.println(a + " " + b + " ");

        for ( int i = 2; i < basamak ; i++){
            int c = a + b;
            System.out.println(c + " ");
            a=b;
            b=c;
        }
    }
}
