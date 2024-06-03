import java.util.Scanner;

public class Task3 {

    /*
    3. Kullanıcıdan alınan bir sayıya kadar Fibonacci serisini while döngüsü kullanarak yazdıran bir Java programı yazın.

    Fibonacci serisi, her bir sayının kendisinden önceki iki sayının toplamı olduğu bir sayı dizisidir. Genellikle F(n) şeklinde ifade edilir ve n. terim olarak adlandırılır.

    Fibonacci serisinin ilk birkaç terimi şu şekildedir:
    1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ...
     */

    public static void main(String[] args) {

        // Scanner sınıfını kullanarak kullanıcıdan giriş almak için bir nesne oluşturuyoruz
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan bir sayı girmesini istiyoruz
        System.out.print("Bir sayı giriniz: ");
        int limit = scanner.nextInt();

        // Fibonacci serisi için ilk iki terim
        int a = 0, b = 1;

        // Fibonacci serisini while döngüsü kullanarak hesaplayıp ekrana yazdırıyoruz
        System.out.println("Fibonacci serisi:");
        System.out.print(a + " " + b + " ");
        while (a + b <= limit) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }

        // Kaynakları serbest bırakıyoruz
        scanner.close();
    }
}
