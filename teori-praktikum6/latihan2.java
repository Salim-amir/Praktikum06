import java.util.Scanner;
public class latihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlah_buku;
        double diskon = 0;
        String buku;
       
        System.out.println("-----------------------------");
        System.out.println("======= KATEGORI BUKU =======");
        System.out.println("-----------------------------");
        System.out.println("1.Kamus \n2.Novel \n3.Lainnya");
        System.out.println("Masukkan kategori buku:");
        buku = input.nextLine();
        System.out.println("Masukkan jumlah buku:");
        jumlah_buku = input.nextInt();
        System.out.println("-----------------------------");

    
        if (buku.equalsIgnoreCase("kamus")) {
            diskon = 0.1;
            if (jumlah_buku > 2) {
                diskon = 0.12;
            }
        } else if (buku.equalsIgnoreCase("Novel")) {
            if (jumlah_buku > 3) {
                diskon = 0.09;
            } else {
                diskon = 0.08;
            }
        } else {
            if (jumlah_buku > 3) {
                diskon = 0.05;
            } else {
                diskon = 0;
            }
        }
        System.out.println(buku + " dengan jumlah " + jumlah_buku + " mendapatkan diskon sebesar " + diskon + "%");
    }
    }
