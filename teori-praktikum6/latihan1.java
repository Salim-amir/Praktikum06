import java.util.Scanner;
public class latihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bil1, bil2, bil3;

        System.out.println("Masukkan bilangan 1 :");
        bil1 = input.nextInt();
        System.out.println("Masukkan bilangan 2 :");
        bil2 = input.nextInt();
        System.out.println("Masukkan bilangan 3 :");
        bil3 = input.nextInt();

        if (bil1 > bil2) {
            if (bil1 > bil3)
            System.out.println("Bilangan 1 adalah Bilangan Terbesar");
            else 
            System.out.println("Bilangan 3 adalah Bilangan Terbesar");
        }
        
        else if (bil2 > bil1) {
            if (bil2 > bil3)
            System.out.println("Bilangan 2 adalah Bilangan Terbesar");
            else
            System.out.println("Bilangan 3 adalah Bilangan Terbesar");
        }
        

    }
}
