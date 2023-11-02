import java.util.Scanner;

/**
 * The type Hitung rata.
 */
public class HitungRata {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah bilangan yang ingin dihitung rata-ratanya: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Masukkan jumlah bilangan yang valid (bilangan bulat positif).");
            return;
        }

        double total = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Masukkan bilangan ke-" + i + ": ");
            double num = scanner.nextDouble();
            total += num;
        }

        double average = PembagiRataRata(n, total);
        System.out.println("Rata-rata dari " + n + " bilangan adalah: " + average);

        scanner.close();
    }

       private static double PembagiRataRata(int total, double n){
            double Average = n / total;
            return Average;
        }
}
