package Pratice3;

import java.util.Scanner;

public class Pratice3Ex2 {
    public static void main(String[] args) {
        // x1 = a = R = R1 = m = m1
        // x2 = b = t = = m2 = R2 = I = g
        // x3 = c = v = v0 = gama
        // x4 = d = h = alfa = r = x

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Введите значение переменной x1:");
            double x1 = sc.nextDouble();
            System.out.println("Введите значение переменной x2:");
            double x2 = sc.nextDouble();
            System.out.println("Введите значение переменной x3:");
            double x3 = sc.nextDouble();
            System.out.println("Введите значение переменной x4:");
            double x4 = sc.nextDouble();


            double a = Math.sqrt(Math.pow(x1, 2) + Math.pow(x2, 2));
            double б = x1 * x2 + x1 * x3 + x2 * x3;
            double в = x3 * x2 + x1 * Math.pow(x2, 2) / 2;
            double г = x1 * Math.pow(x3, 2) / 2 + x1 * x2 * x4;
            double д = 1 / x1 + 1 / x2;
            double е = x1 * x2 * Math.cos(x4);
            double ж = 2 * Math.PI * x1;
            double з = Math.pow(x2, 2) - 4 * x1 * x3;
            double и = x3 * x1 * x2 / Math.pow(x4, 2);
            double к = Math.pow(x2, 2) * x1;
            double л = x1 * x2 * Math.sin(x3);
            double м = Math.sqrt(Math.pow(x1, 2) + Math.pow(x2, 2) - 2 * x1 * x2 * Math.cos(x3));
            double н = (x1 * x4 + x2 * x3) / x1 * x4;
            double о = Math.sqrt(1 - Math.pow(Math.sin(x1), 2));
            double п = 1 / Math.sqrt(x1 * Math.pow(x4, 2) + x2 * x4 + x3);
            double р = (Math.sqrt(x4 + 1) - Math.sqrt(x4 - 1)) / 2 * Math.sqrt(x4);
            double с = Math.abs(x4) + Math.abs(x4 + 1);
            double т = Math.abs(1 - Math.abs(x4));

            System.out.println("Для переменной x1 = " + x1 + "; Для переменной x2 = " + x2 + "; Для переменной x3 = " + x3 + "; Для переменной x4 = " + x4);
            System.out.println(" ");
            System.out.println("a) " + a);
            System.out.println(" ");
            System.out.println("б) " + б);
            System.out.println(" ");
            System.out.println("в) " + в);
            System.out.println(" ");
            System.out.println("г) " + г);
            System.out.println(" ");
            System.out.println("д) " + д);
            System.out.println(" ");
            System.out.println("е) " + е);
            System.out.println(" ");
            System.out.println("ж) " + ж);
            System.out.println(" ");
            System.out.println("з) " + з);
            System.out.println(" ");
            System.out.println("и) " + и);
            System.out.println(" ");
            System.out.println("к) " + к);
            System.out.println(" ");
            System.out.println("л) " + л);
            System.out.println(" ");
            System.out.println("м) " + м);
            System.out.println(" ");
            System.out.println("н) " + н);
            System.out.println(" ");
            System.out.println("о) " + о);
            System.out.println(" ");
            System.out.println("п) " + п);
            System.out.println(" ");
            System.out.println("р) " + р);
            System.out.println(" ");
            System.out.println("с) " + с);
            System.out.println(" ");
            System.out.println("т) " + т);


        }

    }
}
