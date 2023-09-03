package Pratice1;

import java.util.Scanner;

public class Pratice1Ex1 {

public static void main(String[]args) {

        System.out.println("Введите значение:");
        double a = new Scanner(System.in).nextInt();
        System.out.println("Был предоставлен номер: " + a);
        
        double x = 12*(Math.pow(a, 2)) + 7*a - 16;
        double y = 7*(Math.pow(a, 2)) + 3*a + 6;
        System.out.println("Результат уравнения 12a^2 + 12a - 16 = "+ x);
        System.out.println("Результат уравнения 7a^2 + 3a + 6 = "+ y);
    }

}