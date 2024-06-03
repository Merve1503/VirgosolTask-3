import java.util.Scanner;

public class Task11 {

    /*
    11. For döngüsü kullanarak bir String ifadede tekrar eden karakterleri bulan bir Java programı yazın.
     */

    public static void main(String[] args) {

        // Scanner sınıfını kullanarak kullanıcıdan giriş almak için bir nesne oluşturuyoruz
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan bir String ifade girmesini istiyoruz
        System.out.print("Bir String ifade giriniz: ");
        String ifade = scanner.nextLine();

        // String ifadedeki tekrar eden karakterleri bulmak için bir döngü kullanıyoruz
        System.out.println("Tekrar eden karakterler:");
        for (int i = 0; i < ifade.length(); i++) {
            char karakter = ifade.charAt(i);
            for (int j = i + 1; j < ifade.length(); j++) {
                if (karakter == ifade.charAt(j)) {
                    System.out.println(karakter);
                    break;
                }
            }
        }

        // Kaynakları serbest bırakıyoruz
        scanner.close();
    }
}
