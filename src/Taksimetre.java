import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {

        double taksimetre;
        int gidilen,enaz,acilis;

        Scanner input = new Scanner(System.in);
        System.out.print("Kaç km gidildi");
        gidilen = input.nextInt();

        acilis = 10;
        enaz= acilis + 10;
        taksimetre = acilis + (gidilen*2.20);

        taksimetre=Math.max(taksimetre,20);


        System.out.println("Toplam ücret:" +taksimetre + "TL");

    }
}
