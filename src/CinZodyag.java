import java.util.Scanner;

public class CinZodyag{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Doğum yılınızı giriniz");
        int yil=input.nextInt();

        double kalan;

        kalan =yil%12;

        if (kalan==0){
            System.out.println("Maymun");
        } else if(kalan==1){
            System.out.println("Horoz");
        } else if (kalan==2) {
            System.out.println("Köpek");
        } else if (kalan==3) {
            System.out.println("Domuz");
        } else if (kalan==4) {
            System.out.println("Fare");
        } else if (kalan==5) {
            System.out.println("Öküz");
        } else if (kalan==6) {
            System.out.println("Kaplan");
        }  else if (kalan==7) {
            System.out.println("Tavşan");
        } else if (kalan==8) {
            System.out.println("Ejderha");
        } else if (kalan==9) {
            System.out.println("Yılan");
        } else if (kalan==10) {
            System.out.println("At");
        } else {
            System.out.println("Koyun");
        }
    }
}
