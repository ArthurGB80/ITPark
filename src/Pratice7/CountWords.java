package Pratice7;

public class CountWords {
    private final String phrase;

    public CountWords(String phrase) {
        this.phrase = phrase;
    }

    public String getPhrase() {
        return phrase;
    }

    public int countWordsWithLetterE() {
        String[] words = phrase.split(" ");
        int count = 0;

        for (String word : words) {
            if (word.contains("е")) {
                count++;
            }
        }

        return count;
    }
}
