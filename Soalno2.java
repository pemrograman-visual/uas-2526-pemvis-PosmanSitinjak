import java.util.*;
import java.lang.Math;

public class Soalno2 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, i, sisa;
        String status;

        System.out.println("jumlah barang");
        n = Integer.parseInt(input.nextLine());
        String[] barang = new String[n];
        int[] stok = new int[n];
        int[] terjual = new int[n];
        int[] jumlahterjual = new int[n];
        int[] stokawal = new int[n];

        stokawal[n] = 0;
        for (i = 0; i <= n - 1; i++) {
            System.out.println("nama barang");
            barang[i] = input.nextLine();
            System.out.println("jumlah stoknya");
            stok[i] = Integer.parseInt(input.nextLine());
            System.out.println("jumlah yang terjual");
            terjual[i] = Integer.parseInt(input.nextLine());
            if (jumlahterjual[n] <= stokawal) {
                System.out.println("invalid!ulangi");
            }
        }
        System.out.println("hasil laporan");
        System.out.println("barang" + "|" + "stokawal" + "|" + "terjual" + "|" + "sisa" + "|" + "status");
        for (i = 0; i <= n - 1; i++) {
            sisa = stok[i] - terjual[i];
            status = statusstok(sisa);
        }
        System.out.println(barang[i] + "" + stok[i] + "" + terjual[i] + "" + sisa + "" + status);
    }
    
    public static String statusstok(int sisabarang) {
        String pesan;

        if (sisabarang == 0) {
            pesan = "Habis segera restock!";
        } else {
            if (sisabarang < 5) {
                pesan = "stok menipis";
            } else {
                if (sisabarang >= 5) {
                    pesan = "stok aman";
                }
            }
        }
        
        return pesan;
    }
}
