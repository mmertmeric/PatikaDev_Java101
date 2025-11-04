import java.util.Scanner;

public class Weather1 {
    public static void main(String[] args) {

        
        Scanner input = new Scanner(System.in);

        System.out.println("Hava kaç derece");
        double hava = input.nextDouble();
        
        if (hava<5){
            System.out.println("Kayak yapalım");
        } else if (hava<15) {
            System.out.println("Sinemaya gidelim");
        } else if (hava<25) {
            System.out.println("Pikniğe gidelim");
        } else {
            System.out.println("Yüzmeye gidelim");
        }
    }
}
