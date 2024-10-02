import java.util.Scanner;
public class latihan3 {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String merk, kategori;
    int harga, ukuran;
        System.out.println("-----------------------------");
        System.out.println("======== MERK SEPATU ========");
        System.out.println("-----------------------------");
        System.out.println("1.Converse \n2.Skecher \n3.Nike");

        System.out.println("Masukkan Merk:");
        merk = input.nextLine();
        switch (merk) {
            case "converse":
                System.out.println("Masukkan kategori (Slip On /High Top)");
                break;
            case "skecher":
                System.out.println("Masukkan kategori (Woman /Man)");
                break;
            case "nike":
                System.out.println("Masukkan kategori (Kids /Adult)");
                break;
            default:
            System.out.println("Merk tidak valid");
                return;
        }
        kategori = input.nextLine();
        System.out.println("Masukkan ukuran:");
        ukuran = input.nextInt();
        
        harga = 0;

        if (merk.equalsIgnoreCase("Converse")) {
            if (kategori.equalsIgnoreCase("Slip on") && ukuran > 35 && ukuran < 41) {
                harga = 800000;
            } else if (kategori.equalsIgnoreCase("High Top") && ukuran > 39 && ukuran < 45) {
                harga = 1200000;
            } else {
                System.out.println("Ukuran tidak valid");
            }
        } else if (merk.equalsIgnoreCase("Skecher")) {
            if (kategori.equalsIgnoreCase("Woman") && ukuran > 35 && ukuran < 42) {
                harga = 1000000;
            } else if (kategori.equalsIgnoreCase("Man") && ukuran > 40 && ukuran < 45) {
                harga = 1800000;
            } else {
                System.out.println("Ukuran tidak valid");
            }
        } else if (merk.equalsIgnoreCase("Nike"))
            if (kategori.equalsIgnoreCase("Kids") && ukuran > 35 && ukuran < 41) {
                harga = 750000;
            } else if (kategori.equalsIgnoreCase("Adult") && ukuran > 39 && ukuran < 45) {
                harga = 1500000;
            } 
         else {
                System.out.println("Ukuran tidak valid");
            }
        System.out.println("Sepatu bermerk " + merk + " berukuran " + ukuran + " dengan total harga " + harga);
}
}