package Pratice2;

import java.util.Scanner;

public class Pratice2Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите значение переменной x:");
        int x = scanner.nextInt();

        System.out.println("Введите значение переменной y:");
        int y = scanner.nextInt();

        System.out.println("a) 7 см");
        System.out.println("b) " + x + " * 25 = " + (x * 25));
        System.out.println("c) " + x + " * " + y + " = " + (x * y));
        

        /*int a = 7;
        System.out.println(a);
        System.out.println("Entre com  o valor de x");
        Scanner scan1 = new Scanner(System.in);
        int x = scan1.nextInt();
        scan1.nextLine();
        
        int excB = x * 25;
        
        System.out.println("O resultado de x * 25 é: " + excB);
        
        System.out.println("Entre com  o valor de y");
        Scanner scan2 = new Scanner(System.in);
        int y = scan2.nextInt();
        scan2.nextLine();

        int excC = x * y;
        System.out.println("O resultado de x * y é: " + excC);*/


    }

}
