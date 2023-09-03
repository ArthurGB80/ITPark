package Pratice7;

public class Pratice7Ex1 {
    public static void main(String[] args) {

        // Method1

        // String str = "алигортм";
        // String[] words = str.split("");
        // words[2] = "г";
        // words[3] = "о";
        // words[4] = "р";
        // words[5] = "и";
        // words[6] = "т";
        // words[7] = "м";

        // for (int i = 0; i < words.length; i++) {
        //     System.out.print(words[i]);
        // }

        // System.out.println();
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        // Method2

        String str = "алигортм";
        StringBuilder strChange = new StringBuilder(str);

        char[] strToChar = str.toCharArray();
        strChange.deleteCharAt(2);
        strChange.insert(5, "и");

        System.out.println(strChange);


    }

}
