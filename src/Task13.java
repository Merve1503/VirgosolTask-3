public class Task13 {

    /*
    13. Bir aralık belirleyerek (örneğin 1 ile 1000 arası) bu aralıktaki palindromik sayıların toplamını hesaplayan bir Java programı yazın.
    Palindromik sayılar, aynı şekilde okunan sayılardır (örneğin 121, 131).
     */

    public static void main(String[] args) {

        int aralikBaslangic = 1;
        int aralikSon = 1000;

        int toplam = 0;

        for (int i = aralikBaslangic; i <= aralikSon; i++) {
            if (isPalindromic(i)) {
                toplam += i;
            }
        }

        System.out.println(aralikBaslangic + " ile " + aralikSon + " arasındaki palindromik sayıların toplamı: " + toplam);
    }

    // Bir sayının palindromik olup olmadığını kontrol eden yardımcı bir metod
    private static boolean isPalindromic(int sayi) {
        int tersi = 0;
        int geciciSayi = sayi;

        while (geciciSayi != 0) {
            int kalan = geciciSayi % 10;
            tersi = tersi * 10 + kalan;
            geciciSayi /= 10;
        }

        return tersi == sayi;

    }
}
