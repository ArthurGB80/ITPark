package Pratice5;

public class Pratice5Ex4 {

    public static void main(String[] args) {


        int maxInt = Integer.MAX_VALUE;
        int i = 0;
        for (int j = 0; j < maxInt; j++) {
            if (j % 10 == 7 && j % 9 == 0 && j > 100 && i < 10) {
                System.out.println(j);
                i++;
            }


        }


    }

}

