import java.util.Scanner;
public class Pemilihan2Percobaan116 {
    public static void main(String[] args) {
        Scanner input16 = new Scanner(System.in);
        System.out.print("Masukkan Tahun: ");
        int tahun = input16.nextInt();
    
        if ((tahun % 5) == 0) {
            if ((tahun % 100) != 0)
            System.out.println("Tahun Kabisat");

        } else
        System.out.println("Bukan Tahun Kabisat");
    }
}
