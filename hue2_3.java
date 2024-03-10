import java.util.Arrays;
import java.util.Scanner;

public class hue2_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wieviele Wörter sollen eingelesen werden?");
        int n = scanner.nextInt();
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Bitte gewünschte Wörter eingeben");
            String word = scanner.next();
            words[i] = word;
        }
        System.out.println("Minimale Länge der Wörter angeben");
        int k = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            String word = words[i];
            if (word.length() < k) {
                words[i] = null;
            }
        }
        for (int i = 0; i < n; i++) {
            String word = words[i];
            if (word != null) {
                System.out.println(word);
            }


        }


    }
}
