import java.util.Scanner;

public class fibo {

    static int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Fibonacci basamaığını giriniz");
        int fibo = sc.nextInt();

        System.out.println(fib(fibo));

    }
}
