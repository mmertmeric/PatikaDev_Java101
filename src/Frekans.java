public class Frekans {
    public static void main(String[] args) {

        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] freq = new int[list.length];

        for (int i = 0; i < list.length; i++) {
            int count = 1; // elemanın kendisini say
            if (freq[i] == -1) // eğer daha önce işaretlenmişse atla
                continue;

            for (int j = i + 1; j < list.length; j++) {
                if (list[i] == list[j]) {
                    count++;
                    freq[j] = -1; // bu elemanı işaretle, bir daha sayma
                }
            }
            freq[i] = count; // frekans dizisine kaydet
        }

        System.out.println("Tekrar Sayıları:");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != -1)
                System.out.println(list[i] + " sayısı " + freq[i] + " kere tekrar edildi.");
        }
    }
}
