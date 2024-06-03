import java.util.Scanner;

public class Task10 {

    /*
    10. For döngüsü kullanarak bir sayının basamaklarını toplayan bir Java programı yazın.
     */

    public static void main(String[] args) {

        // Scanner sınıfını kullanarak kullanıcıdan giriş almak için bir nesne oluşturuyoruz
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan bir sayı girmesini istiyoruz
        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        // Basamakları toplamak için bir değişken oluşturuyoruz
        int toplam = 0;

        // Sayının basamaklarını topluyoruz
        for (; sayi != 0; sayi /= 10) {
            toplam += sayi % 10;
        }

        // Sonucu ekrana yazdırıyoruz
        System.out.println("Basamakların toplamı: " + toplam);

        // Kaynakları serbest bırakıyoruz
        scanner.close();
    }
}
