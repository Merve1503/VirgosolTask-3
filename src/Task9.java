import java.util.Scanner;

public class Task9 {

    /*
    9. Kullanıcıdan alınan sayılarla toplama işlemi yapan ve kullanıcı 0 girene kadar devam eden do-while döngüsü kullanan bir Java programı yazın.
     */

    public static void main(String[] args) {

        // Scanner sınıfını kullanarak kullanıcıdan giriş almak için bir nesne oluşturuyoruz
        Scanner scanner = new Scanner(System.in);

        // Toplamı tutmak için bir değişken oluşturuyoruz
        int toplam = 0;
        int sayi;

        // Kullanıcı 0 girene kadar sayıları alıp topluyoruz
        do {
            System.out.print("Bir sayı giriniz (çıkmak için 0): ");
            sayi = scanner.nextInt();
            toplam += sayi;
        } while (sayi != 0);

        // Sonucu ekrana yazdırıyoruz
        System.out.println("Girdiğiniz sayıların toplamı: " + toplam);

        // Kaynakları serbest bırakıyoruz
        scanner.close();
    }
}
