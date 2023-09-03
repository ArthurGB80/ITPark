package Pratice1;

import java.util.Scanner;

public class Pratice1Ex2 {
    public static void main(String[] args) {
        System.out.println("Эта программа вычисляет периметр и площадь прямоугольника.");
        System.out.println("Введите значение длины:");
        double length = new Scanner(System.in).nextDouble();
        System.out.println("Введите значение ширины:");
        double width = new Scanner(System.in).nextDouble();

        double perimiter = 2 * (length * width);
        double area = length * width;
        System.out.println();
        System.out.println("Для прямоугольника с длиной = " + length + " и " + "шириной   = " + width + ":");

        System.out.println("Периметр = " + perimiter);
        System.out.println("Площадь = " + area);

        /*
         import java.util.Scanner;

public class Test {
    


 //This program calculates the perimeter and area of a rectangle.
 //The length and width values are expected to be provided as doubles.
 //The function returns nothing.
 
public static void calculateRectangle(double length, double width) {
    double perimiter = 2 * (length * width);
    double area = length * width;
    System.out.println();
    System.out.println("For a rectangle with length = " + length + " and " + "width = " + width + ":");
    System.out.println();
    
    System.out.println("Perimeter = " + perimiter);
    System.out.println("Area = " + area);
}

//The main function that prompts user input for rectangle dimensions and calls calculateRectangle.
 
    public static void main(String[] args) {
    System.out.println("This program calculates the perimeter and area of a rectangle.");
    System.out.println("Enter the length value:");
    double length = new Scanner(System.in).nextDouble();
    System.out.println("Enter the width value:");
    double width = new Scanner(System.in).nextDouble();

    calculateRectangle(length, width);
}

}

         */

    }
}
