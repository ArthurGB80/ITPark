package Pratice4;

import java.util.Scanner;

public class Pratice4Ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = 3;
        int max = 0;
        int min = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            int num = input.nextInt();
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        System.out.println("Max value: " + max);
        System.out.println("Min value: " + min);
    }
}
