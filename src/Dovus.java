import java.util.Scanner;

public class Dovus {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("İlk Dövüşçünün Adı");
        String f1name = input.nextLine();

        System.out.println("İkinci Dövüşçünün Adı");
        String f2name = input.nextLine();

        System.out.println(f1name + " Kilosu");
        int f1weight = input.nextInt();

        System.out.println(f2name + " Kilosu");
        int f2weight = input.nextInt();

        System.out.println(f1name + " Ortalama round başı hasarı");
        int f1damage = input.nextInt();

        System.out.println(f2name + " Ortalama round başı hasarı");
        int f2damage = input.nextInt();



        Fighter f1 = new Fighter(f1name , f1damage , 100, f1weight, Math.random());
        Fighter f2 = new Fighter(f2name , f2damage , 100, f2weight, Math.random());
        Ring r = new Ring(f1,f2 , 90 , 100);
        r.run();
    }
}