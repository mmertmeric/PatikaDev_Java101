import java.util.Scanner;

public class desen {

    static void pattern(int n) {
        System.out.print(n + " ");
        if (n <= 0) return;         // taban durum: durma noktası
        pattern(n - 5);             // problem küçültme (gidiş)
        System.out.print(n + " ");  // dönüşte tekrar yaz (artış)
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N sayısını giriniz: ");
        int n = sc.nextInt();

        pattern(n);
    }
}
