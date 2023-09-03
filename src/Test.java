import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("Жыраф", "Шына", "Рыба", "Жыраф", "Шыповник"));
        int errorsCount = 0;

        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);

            if (word.contains("жы")) {
                word = word.replace("жы", "жи");
                words.set(i, word);
                errorsCount++;
            }

            if (word.contains("шы")) {
                word = word.replace("шы", "ши");
                words.set(i, word);
                errorsCount++;
            }
        }

        System.out.println("Corrected words: " + words);
        System.out.println("Number of errors: " + errorsCount);
    }
}
