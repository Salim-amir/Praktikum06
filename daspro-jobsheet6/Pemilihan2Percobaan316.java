import java.util.Scanner;
public class Pemilihan2Percobaan316 {
    public static void main(String[] args) {
        Scanner input16 = new Scanner(System.in);
        String kategori;
        int penghasilan, gajibersih;
        double pajak = 0;
        System.out.println("Masukkan kategori (pekerja/pebisnis):");
        kategori = input16.nextLine();
        System.out.println("Masukkan penghasilan:");
        penghasilan = input16.nextInt();

        if (kategori.equalsIgnoreCase("pekerja")) {
        if (penghasilan <= 2000000)
            pajak = 0.1;
        else if (penghasilan <= 3000000)
            pajak = 0.15;
        else 
        pajak = 0.2;
        gajibersih = (int) (penghasilan - (pajak * penghasilan));   
        System.out.println("Penghasilan bersih: " + gajibersih);
        }

        else if (kategori.equalsIgnoreCase("pebisnis")) {
        if (penghasilan <= 250000)
        pajak = 0.15;
        else if (penghasilan <= 3500000 )
        pajak = 0.2;
        else
        pajak = 0.25;
        gajibersih = (int) (penghasilan - (pajak * penghasilan));
        System.out.println("Penghasilan bersih: " + gajibersih);
        }
        else 
        System.out.println("Masukkan kategori salah:");
    }
}