public class diziHarmonik {
    public static void main(String[] args) {

        double[] numbers = {1, 2, 3, 4, 5};
        double sum = 0.0;

        for (double num : numbers) {
            sum += 1.0 / num; // her elemanın tersini ekle
        }

        double harmonicMean = numbers.length / sum;

        System.out.println("Harmonik Ortalama: " + harmonicMean);
    }
}
