import java.util.Scanner;

public class Siralama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("1. Sayı");
        int a=input.nextInt();

        System.out.println("2. Sayı");
        int b=input.nextInt();

        System.out.println("3. Sayı");
        int c=input.nextInt();

        if ((a>b && a>c)) {
            if (b > c) {
                System.out.println("a > b > c");
            } else {
                System.out.println("a > c > b");
            }
        }
            else if (b>c && b>a) {
                if (c>a){
                    System.out.println("b > c > a");
                } else  {
                    System.out.println("b > a > c");
                }
            }
            else {
                if (a>b){
                    System.out.println("c > a > b");
                } else {
                    System.out.println("c > b > a");
                }
        }
    }
}
