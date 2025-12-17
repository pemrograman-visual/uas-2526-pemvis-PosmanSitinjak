import java.util.*;
import java.lang.Math;

public class Soalno3 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int i, jumlahorang, jumlahbarang, totalorang, totalkamar;
        String nama;

        totalkamar = 0;
        jumlahorang = 0;
        System.out.println("totalkomsumsi:");
        for (i = 0; i <= jumlahorang; i++) {
            nama = input.nextLine();
            jumlahbarang = Integer.parseInt(input.nextLine());
            totalorang = hitungtotalbarang(jumlahbarang);
            System.out.println(nama + "=" + totalorang + "wh");
            totalkamar = totalkamar + jumlahbarang;
        }
        System.out.println("");
        System.out.println("total konsumsi kamar=" + totalkamar + "wh");
        System.out.println(hitungkamar(banyakitem));
    }
    
    public static int hitungtotal(int banyakitem) {
        int total;
        int j, nilai, total;

        total = 0;
        for (j = 0; j <= banyakitem; j++) {
            nilai = Integer.parseInt(input.nextLine());
            total = total + nilai;
        }
        
        return total;
    }
    
    public static int totalkamar(int banyakitem) {
        int totalkamar;

        if (totalkamar <= 1200) {
            System.out.println("Komsumsi masih dalam batas wajar");
        } else {
            System.out.println("Konsumsi melebihi batas wajar");
        }
        
        return total;
    }
}
