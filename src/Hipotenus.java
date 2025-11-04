import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args) {

        int dik1,dik2;
        double hip;

        Scanner input = new Scanner(System.in);
        System.out.println("Dik kenar uzunluklarını giriniz");
        System.out.println("1. Dik kenar uzunluk");
        dik1 = input.nextInt();
        System.out.println("2. Dik kenar uzunluk");
        dik2 = input.nextInt();

        hip = Math.sqrt((dik1*dik1)+(dik2*dik2));
        System.out.println("Hipotenüs:" + hip);



    }
}
