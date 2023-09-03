package Pratice7;

import java.util.HashMap;
import java.util.Map;

public class Pratice7Ex3 {
    public static void main(String[] args) {
        String word = "Существует";

        // Method 1
        Map m = new HashMap();

        for (char x : word.toCharArray()) {
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