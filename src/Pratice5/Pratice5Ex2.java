package Pratice5;

import java.util.Scanner;

public class Pratice5Ex2 {

    public static void main(String[] args) {
            
        /*      
            int sum = 1;
            for (int i = 2; i <= 1000; i++){
            sum = sum + i;
            }   
        System.out.println(sum/1000);
        */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number k to calculate the sum from 1 to k and the arithmetic mean of the sum of k numbers: ");
        int k = scanner.nextInt();

        float sum = 0;
        for (int i = 1; i <= k; i++) {
            sum += i;
        }

        float mean = sum / k;
        System.out.printf("The sum of 1 to %d is %f.%n", k, sum);
        //System.out.println(String.format("The arithmetic mean of the sum of 1 to %d is %g." , k , mean));
        System.out.printf("The arithmetic mean of the sum of 1 to %d is %.2f.%n", k, mean);

    }

}