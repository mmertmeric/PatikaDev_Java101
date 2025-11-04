public class asal {
    public static void main(String[] args) {

        for (int sayi = 2; sayi <= 100; sayi++) { // 1 asal değil, o yüzden 2'den başla
            boolean asalMi = true; // her sayıyı başta "asal" varsay

            for (int i = 2; i < sayi; i++) { // 2'den kendisinden 1 önceye kadar kontrol et
                if (sayi % i == 0) { // eğer tam bölünüyorsa
                    asalMi = false; // asal değildir
                    break; // artık gerek yok, çık döngüden
                }
            }

            if (asalMi) {
                System.out.print(sayi + " ");
            }
        }
    }
}
