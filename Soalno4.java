import java.util.*;
import java.lang.Math;

public class Soalno4 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, i, totalshift, maxshift, minshift;
        double ratarata;
        String maxnama, minnama, kesimpulan;

        totalshift = 0;
        maxshift = -1;
        minshift = 1000;
        n = Integer.parseInt(input.nextLine());
        String[] nama = new String[n];
        int[] shift = new int[n];

        for (i = 0; i <= n - 1; i++) {
            nama[i] = input.nextLine();
            shift[i] = Integer.parseInt(input.nextLine());
        }
        for (i = 0; i <= n - 1; i++) {
            totalshift = totalshift + shift[i];
            if (shift[i] > maxshift) {
                maxshift = shift[i];
            }
            if (shift[i] < minshift) {
                minshift = shift[i];
                minnama = nama[i];
            }
        }
        ratarata = (double) totalshift / n;
        System.out.println("Daftar shift");
        for (i = 0; i <= n - 1; i++) {
            System.out.println(nama[i] + "=" + shift[i]);
        }
        System.out.println("");
        System.out.println("totalshift=" + totalshift);
        System.out.println("ratarata=" + ratarata);
        System.out.println("Shift terbanyak :" + maxnama + "(" + maxshift + ")");
        System.out.println("");
        kesimpulan = cekkesimpulan(maxshift, minshift);
    }
    
    public static String cekkesimpulan(int maxval, int minval) {
        String pesan;
        int selisih;

        selisih = maxval - minval;
        if (selisih >= 3) {
            pesan = "Distribusi shift tidak merata berapa asisten terbeban";
        } else {
            pesan = "Distribusi shift cukup merata";
        }
        
        return pesan;
    }
}
