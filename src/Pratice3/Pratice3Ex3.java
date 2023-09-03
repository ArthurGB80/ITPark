package Pratice3;

import java.util.Scanner;

public class Pratice3Ex3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите значение переменной x:");
        double x = sc.nextDouble();

        System.out.println("Введите значение переменной y:");
        double y = sc.nextDouble();

        double z = Math.pow(x, 3) - 2.5 * x * y + 1.78 * Math.pow(x, 2) - 2.5 * y + 1;

        System.out.println();
        System.out.println("Для переменной x = " + x + "; Для переменной y = " + y);
        System.out.println();
        System.out.println("z = " + z);

    }

}
