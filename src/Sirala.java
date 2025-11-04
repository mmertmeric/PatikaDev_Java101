import java.util.Arrays;
import java.util.Scanner;

public class Sirala {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dizinin boyutunu giriniz: ");
        int size = input.nextInt();

        int[] list = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println( ( i + 1 )  + ". elemanı giriniz");
            list[i] = input.nextInt();

        }

        System.out.println("Dizinin elemanları");
        for (int i = 0; i < size; i++){
            System.out.print(list[i] + " ");
        }

        Arrays.sort(list);

        System.out.print(Arrays.toString(list));




    }
}
