import java.util.Scanner;
public class modifikasipeercobaan1 {
    public static void main(String[] args) {
        Scanner input16 = new Scanner(System.in);
        System.out.print("Masukkan Tahun: ");
        int tahun = input16.nextInt();
    
        if ((tahun % 9) == 0) {
            if ((tahun % 100) != 0)
            System.out.println("tahun kabisat");

        } else 
        System.out.println("Bukan Tahun Kabisat");
    }
}
