import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Çalışanın ismi");
        String name = input.nextLine();

        System.out.println("Güncel brüt maaşı");
        double salary = input.nextDouble();

        System.out.println("Haftalık çalışma saati");
        int workHours = input.nextInt();

        System.out.println("İşe başlama yılı");
        int hireYear = input.nextInt();


        Employee e = new Employee(name, salary, workHours, hireYear);
        System.out.println(e.toString());
    }
}
