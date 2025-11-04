import java.util.Scanner;

public class Transpoze {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 1) Boyutları al
        System.out.print("Satır sayısı (r): ");
        int r = in.nextInt();
        System.out.print("Sütun sayısı (c): ");
        int c = in.nextInt();

        // Girdi doğrulama (negatif/0 ise hata)
        if (r <= 0 || c <= 0) {
            System.out.println("Hata: Satır ve sütun sayıları pozitif olmalıdır.");
            return;
        }

        // 2) Matrisi oluştur ve doldur
        int[][] A = new int[r][c];
        System.out.println("Matrisi sırayla girin (toplam " + (r * c) + " sayı):");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                A[i][j] = in.nextInt();
            }
        }

        // 3) Transpoz (boyutlar ters)
        int[][] AT = new int[c][r];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                AT[j][i] = A[i][j];  // indisleri tersle
            }
        }

        // 4) Yazdır
        System.out.println("Matris :");
        printMatrix(A);

        System.out.println("Transpoze :");
        printMatrix(AT);
    }

    // Yardımcı: matrisi düzgün yazdır
    private static void printMatrix(int[][] M) {
        for (int i = 0; i < M.length; i++) {          // satır sayısı
            for (int j = 0; j < M[i].length; j++) {   // sütun sayısı
                System.out.print(M[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
