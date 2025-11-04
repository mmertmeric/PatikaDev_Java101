import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Yılı giriniz");
        int yil = input.nextInt();

        double artikyil = yil%4.0;

        if(artikyil==0){
            System.out.println(yil + " Artık yıldır");
        } else {
            System.out.println(yil + " Artık yıl değildir");
        }
    }
}
