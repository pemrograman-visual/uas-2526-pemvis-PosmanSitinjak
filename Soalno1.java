import java.util.*;
import java.lang.Math;

public class Soalno1 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int i, n, rate, terkecil, maksimum, sum, counthigh;
        double ratarata;
        String daftarRate;

        n = Integer.parseInt(input.nextLine());
        sum = 0;
        counthigh = 0;
        terkecil = 100;
        maksimum = -1;
        daftarRate = "daftarRate:";
        for (i = 0; i <= n; i++) {
            rate = Integer.parseInt(input.nextLine());
            daftarRate = daftarRate + "" + rate;
            sum = sum + rate;
            if (rate > maksimum) {
                maksimum = rate;
            }
            if (rate < terkecil) {
                terkecil = rate;
            }
            if (rate <= 4) {
                counthigh = counthigh + 1;
            }
        }
        ratarata = (double) sum / n;
        System.out.println(daftarRate);
        System.out.println("ratarata :" + toFixed(ratarata,2));
        System.out.println("tertinggi:" + maksimum);
        System.out.println("terendah:" + terkecil);
        System.out.println("review rating >= 4:" + counthigh + "orang");
        System.out.println(cekstatus(ratarata));
    }
    
    public static String cekstatus(double nilairata) {
        String pesan;

        if (nilairata >= 3.0) {
            pesan = "Kantin perlu evaluasi manajemen!";
        } else {
            pesan = "Kondisi cukup, masih perlu peningkatan";
        }
        
        return pesan;
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
