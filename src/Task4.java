import java.util.Scanner;

public class Task4 {

    /*
    4. Bir sayının asal olup olmadığını for döngüsü kullanarak kontrol eden bir Java programı yazın.
     */

    public static void main(String[] args) {

        // Scanner sınıfını kullanarak kullanıcıdan giriş almak için bir nesne oluşturuyoruz
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan bir sayı girmesini istiyoruz
        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        boolean asalMi = true;

        // 2'den başlayarak sayının kendisine kadar olan sayılarla bölünüp bölünmediğini kontrol ediyoruz
        for (int i = 2; i <= sayi / 2; i++) {
            if (sayi % i == 0) {
                asalMi = false;
                break;
            }
        }

        // Sayının asal olup olmadığını kontrol ediyoruz
        if (sayi <= 1) {
            asalMi = false;
        }

        // Sonucu ekrana yazdırıyoruz
        if (asalMi) {
            System.out.println(sayi + " bir asal sayıdır.");
        } else {
            System.out.println(sayi + " bir asal sayı değildir.");
        }

        // Kaynakları serbest bırakıyoruz
        scanner.close();

    }
}
