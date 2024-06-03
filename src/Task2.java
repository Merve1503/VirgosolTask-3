import java.util.Scanner;

public class Task2 {

    /*
    2. Bir sayının faktöriyelini for döngüsü kullanarak hesaplayan bir Java programı yazın.
    Örneğin, 5'in faktöriyeli 120'dir.
     */

    public static void main(String[] args) {

        // Scanner sınıfını kullanarak kullanıcıdan giriş almak için bir nesne oluşturuyoruz
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan bir sayı girmesini istiyoruz
        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        // Faktöriyel değerini hesaplamak için bir değişken oluşturuyoruz
        int faktoriyel = 1;

        // Sayının faktöriyelini hesaplıyoruz
        for (int i = 1; i <= sayi; i++) {
            faktoriyel *= i;
        }

        // Sonucu ekrana yazdırıyoruz
        System.out.println(sayi + "'in faktöriyeli: " + faktoriyel);

        // Kaynakları serbest bırakıyoruz
        scanner.close();

    }
}
