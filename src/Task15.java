import java.util.Scanner;

public class Task15 {

    /*
    15. Verilen bir string kelimenin  palindromik olup olmadığını bulan bir Java programı yazın.
    Palindromik ileri ve geri okunduğunda aynı olan kelimedir. (Örnek:  kayak)
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir kelime giriniz: ");
        String kelime = scanner.nextLine();

        if (isPalindromic(kelime)) {
            System.out.println(kelime + " bir palindromik kelimedir.");
        } else {
            System.out.println(kelime + " bir palindromik kelime değildir.");
        }

        scanner.close();
    }

    private static boolean isPalindromic(String kelime) {
        int uzunluk = kelime.length();
        for (int i = 0; i < uzunluk / 2; i++) {
            if (kelime.charAt(i) != kelime.charAt(uzunluk - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
