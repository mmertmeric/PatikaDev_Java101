import java.sql.SQLOutput;
import java.util.Scanner;

public class LoginUX {
    public static void main(String[] args) {

        String username, password, resetChoice, newPassword;

        Scanner input = new Scanner(System.in);

        System.out.println("Kullanıcı adınız");
        username = input.nextLine();
        System.out.println("Şifreniz");
        password = input.nextLine();

        if (username.equals("mert") && password.equals("6161")) {
            System.out.println("Başarıyla giriş yapıldı");
        } else {
            System.out.println("Hatalı kullanıcı adı veya şifre");

            System.out.println("Şifreni sıfırlamak istiyorsan (sıfırla) yaz");
            resetChoice =input.nextLine();

            if (resetChoice.equalsIgnoreCase("sıfırla")){
                System.out.println("Yeni şifreyi gir");
                newPassword = input.nextLine();

                if (newPassword.equals("6161")){
                    System.out.println("Eski şifre girilemez , başka bir şifre oluştur");
                }else {
                    System.out.println("Şifre değiştirildi");
                }
            } else {
                System.out.println("Sıfırlama iptal edildi");
            }
        }
    }
}
