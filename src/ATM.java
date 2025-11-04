import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password;
        int right = 3;
        int balance = 1500;
        int select;

        while (right > 0) {
            System.out.print("Kullanıcı Adınız: ");
            userName = input.nextLine();
            System.out.print("Parolanız: ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");

                do {
                    System.out.println("""
                            1- Para Yatırma
                            2- Para Çekme
                            3- Bakiye Sorgula
                            4- Çıkış Yap
                            """);
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                    select = input.nextInt();

                    switch (select) {
                        case 1 -> {
                            System.out.print("Para miktarı: ");
                            int price = input.nextInt();
                            balance += price;
                        }
                        case 2 -> {
                            System.out.print("Para miktarı: ");
                            int price = input.nextInt();
                            if (price > balance)
                                System.out.println("Bakiye yetersiz.");
                            else
                                balance -= price;
                        }
                        case 3 -> System.out.println("Bakiyeniz: " + balance);
                        case 4 -> System.out.println("Tekrar görüşmek üzere.");
                        default -> System.out.println("Geçersiz seçim!");
                    }

                } while (select != 4);
                break; // doğru giriş yaptıktan sonra sistemden çık
            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur, lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız: " + right);
                }
            }
        }
    }
}
