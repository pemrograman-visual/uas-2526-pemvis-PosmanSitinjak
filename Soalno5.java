import java.util.*;
import java.lang.Math;

public class Soalno5 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int jumlahdata, i, gaji, datalain;
        double ipk;
        String nama;
        boolean status;

        jumlahdata = Integer.parseInt(input.nextLine());
        for (i = 1; i <= jumlahdata; i++) {
            nama = input.nextLine();
            ipk = Double.parseDouble(input.nextLine());
            gaji = Integer.parseInt(input.nextLine());
            datalain = Integer.parseInt(input.nextLine());
            status = cekkelulusan(ipk, gaji);
            if (status) {
                System.out.println(nama + "->tidaklolos");
            } else {
                System.out.println(nama + "->lolos syarat awal");
            }
        }
    }
    
    public static boolean cekkelulusan(double nilaiipk, int penghasilan) {
        int ipk;
        boolean hasil;

        ipk = 0;
        if (ipk >= 3.0 && penghasilan <= 3000000) {
            hasil = true;
        } else {
            hasil = false;
        }
        
        return hasil;
    }
}
