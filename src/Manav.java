import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {

        double fiyatarmut = 2.14;
        double fiyatelma = 3.67;
        double fiyatdomates = 1.11;
        double fiyatmuz = 0.95;
        double fiyatpatlican = 5.0;


        Scanner input = new Scanner(System.in);
        System.out.println("Hangi ürünlerden kaç kilo aldınız?");
        System.out.println("Armut");
        double kiloarmut=input.nextDouble();
        System.out.println("Elma");
        double kiloelma=input.nextDouble();
        System.out.println("Domates");
        double kilodomates=input.nextDouble();
        System.out.println("Muz");
        double kilomuz=input.nextDouble();
        System.out.println("Patlican");
        double kilopatlican=input.nextDouble();

        double sepet= (fiyatarmut*kiloarmut +
                fiyatelma*kiloelma +
                fiyatdomates*kilodomates +
                fiyatmuz*kilomuz +
                fiyatpatlican*kilopatlican);

        System.out.println("Sepet tutarınız:" + sepet + "TL ' dir.");

    }
}
