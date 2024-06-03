public class Task14 {

    /*
    14. Belirli bir aralıktaki tüm Armstrong sayıları bulan bir Java programı yazın.
    Bir sayının Armstrong sayısı olup olmadığını kontrol eden bir algoritma yazın.
    Armstrong sayısı, n basamaklı bir sayının, basamaklarının n’inci kuvvetleri toplamına eşit olduğu sayıdır (örneğin 153 = 1³ + 5³ + 3³).
     */

    public static void main(String[] args) {

        int aralikBaslangic = 1;
        int aralikSon = 1000;

        System.out.println(aralikBaslangic + " ile " + aralikSon + " arasındaki Armstrong sayıları:");
        for (int i = aralikBaslangic; i <= aralikSon; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }

    // Bir sayının Armstrong sayısı olup olmadığını kontrol eden metod
    private static boolean isArmstrong(int sayi) {
        int toplam = 0;
        int geciciSayi = sayi;
        int basamakSayisi = String.valueOf(sayi).length();

        while (geciciSayi != 0) {
            int basamak = geciciSayi % 10;
            toplam += Math.pow(basamak, basamakSayisi);
            geciciSayi /= 10;
        }

        return toplam == sayi;

    }
}
