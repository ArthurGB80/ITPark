package Pratice7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Pratice7Ex4 {
    public static void main(String[] args) {

        // Point a)

        // "ротор"
        // "шалаш"
        // "казак"

        String random_word = "racecar";
        String[] wordsParts = random_word.split("");
        ArrayList<String> wordList = new ArrayList<String>(Arrays.asList(wordsParts));
        ArrayList<String> reverseWord = new ArrayList<String>(wordList);
        Collections.reverse(reverseWord);

        // System.out.println(wordList);
        // System.out.println(reverseWord);

        if (wordList.equals(reverseWord)) {
            System.out.println("This word is a polindromous word.");
        } else {
            System.out.println("This word is not a polindromous word.");
        }

        System.out.println();

        
        // Point b)

        // "A man, a plan, a canal, Panama!"
        // "Madam, in Eden, I'm Adam."

        String randomSentence = "Существует 2 типов людей в мире: те, кто понимает двоичный код, и те, кто этого не понимает.";
        String randomSentenceLettersOnly = randomSentence.replaceAll("[^\\p{L}]", "");
        String[] sentenceParts = randomSentenceLettersOnly.split("");
        ArrayList<String> sentenceList = new ArrayList<String>(Arrays.asList(sentenceParts));
        ArrayList<String> reverseSentence = new ArrayList<String>(sentenceList);
        Collections.reverse(reverseSentence);

        if (sentenceList.equals(reverseSentence)) {
            System.out.println("This sentence is a polindromous sentence.");
        } else {
            System.out.println("This sentence is not a polindromous sentence.");
        }

    }
}