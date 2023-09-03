package Aulas;

import java.util.Scanner;

class ItPatk_2023_04_22 {

    public static void main(String[] args) {
        boolean a = true;
        System.out.println(a);
        boolean b = false;
        System.out.println(b);
        System.out.println(!a);
        System.out.println(!b);
        System.out.println(a | b);
        System.out.println(a & b);


        Scanner scanner = new Scanner (System.in);

        byte x = scanner.nextByte();
        // byte y = 100;
        System.out.println(x);
        // System.out.println(x + y);

/*
        byte x = 1;
        char c = 'A';
        String s = "A";
        System.out.println(x + c);
        System.out.println(x + s);
*/


    }

}
