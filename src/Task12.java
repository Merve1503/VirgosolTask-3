import java.util.Scanner;

public class Task12 {

    /*
    12. Bir sayının asal çarpanlarını bulan bir Java programı yazın.
    Kullanıcının girdiği bir sayının asal çarpanlarını ve bu çarpanların sayısını ekrana yazdırın.
     */

    public static void main(String[] args) {

        // Scanner sınıfını kullanarak kullanıcıdan giriş almak için bir nesne oluşturuyoruz
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan bir sayı girmesini istiyoruz
        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        // Asal çarpanları bulmak için bir döngü kullanıyoruz
        System.out.print(sayi + " sayısının asal çarpanları: ");
        int sayac = 0;
        for (int i = 2; i <= sayi; i++) {
            while (sayi % i == 0) {
                System.out.print(i + " ");
                sayi /= i;
                sayac++;
            }
        }

        // Toplam asal çarpan sayısını ekrana yazdırıyoruz
        System.out.println("\nToplam asal çarpan sayısı: " + sayac);

        // Kaynakları serbest bırakıyoruz
        scanner.close();
    }
}
