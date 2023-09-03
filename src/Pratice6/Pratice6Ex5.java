package Pratice6;

import java.util.Random;
import java.util.Scanner;

public class Pratice6Ex5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        int[][] a = new int[3][3];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = random.nextInt(10); // random.nextInt(5, 10)
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        int size = a.length;
        int targetSum = size * (size * size + 1) / 2;

        // Check rows and columns
        for (int x = 0; x < size; x++) {
            int rowSum = 0;
            int colSum = 0;
            for (int y = 0; y < size; y++) {
                rowSum += a[x][y];
                colSum += a[y][x];
            }
            if (rowSum != targetSum || colSum != targetSum) {
                System.out.println("This is not a magic square.");
                return;
            }
        }

        // Check diagonals
        int diagSum1 = 0;
        int diagSum2 = 0;
        for (int x = 0; x < size; x++) {
            diagSum1 += a[x][x];
            diagSum2 += a[x][size - 1 - x];
        }
        if (diagSum1 != targetSum || diagSum2 != targetSum) {
            System.out.println("This is not a magic square.");
            return;
        }
        System.out.println("This is a magic square!");

    }
}