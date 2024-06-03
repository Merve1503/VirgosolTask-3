import java.util.HashMap;
import java.util.Map;

public class Task16 {

    /*
    16. Verilen bir string içerisindeki benzersiz karakterleri bulan ve bunları ekrana yazdıran bir Java programı yazın.
    Benzersiz karakterler, string içerisinde sadece bir kez geçen karakterlerdir.
     */

    public static void main(String[] args) {

        String str = "Merhaba Dunya";

        Map<Character, Integer> karakterler = new HashMap<>();

        // String içindeki karakterlerin sayısını bulma
        for (char c : str.toCharArray()) {
            karakterler.put(c, karakterler.getOrDefault(c, 0) + 1);
        }

        // Benzersiz karakterleri ekrana yazdırma
        System.out.println("String içindeki benzersiz karakterler:");
        for (Map.Entry<Character, Integer> entry : karakterler.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}
