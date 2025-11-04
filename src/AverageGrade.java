import java.util.Scanner;

public class AverageGrade {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,tarih,muzik;
        Scanner input = new Scanner (System.in);

        System.out.print("Matematik notunuz: ");
        mat = input.nextInt();

        System.out.print("Fizik notunuz: ");
        fizik = input.nextInt();

        System.out.print("Kimya notunuz: ");
        kimya = input.nextInt();

        System.out.print("Turkce notunuz: ");
        turkce = input.nextInt();

        System.out.print("Muzik notunuz: ");
        muzik = input.nextInt();

        System.out.print("Tarih notunuz: ");
        tarih = input.nextInt();

        int not = (mat+fizik+kimya+turkce+tarih+muzik)/6;

        if (not<55){
            System.out.println("Sınıf tekrarı , ortalamanız" + not );
        } else {
            System.out.println("Sınıfı geçtiniz , ortalamanız" + not);
        }
    }
}
