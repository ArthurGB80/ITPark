package Pratice7;

import java.util.HashMap;
import java.util.Map;

public class Pratice7Ex2 {

    public static void main(String[] args) {

        String phrase = "Существует 2 типов людей в мире: те, кто понимает двоичный код, и те, кто этого не понимает.";

        // Method 1
        String[] words = phrase.split(" ");

        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].contains("е")) {
                count++;
            }
        }
        System.out.println(count);

        System.out.println();

        // Method 2
        Map m = new HashMap();

        for (char x : phrase.toCharArray()) {
            if (m.containsKey(x)) {
                int old = (int) m.get(x);
                m.put(x, old + 1);

            } else {
                m.put(x, 1);
            }
        }
        System.out.println(m);
        



        
    }

}
