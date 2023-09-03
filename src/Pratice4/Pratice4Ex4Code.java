package Pratice4;

import java.util.Scanner;

public class Pratice4Ex4Code {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of games played by the team: ");
            int n = sc.nextInt();

            int[] results = new int[n];

            for (int i = 0; i < n; i++) {
                System.out.println("Enter the result of game " + (i + 1) + ": ");
                results[i] = sc.nextInt();
            }

            int wonPont = 0;
            int wonGame = 0;
            int losedGame = 0;
            int drawPoint = 0;
            int drawGame = 0;

            for (int i = 0; i < n; i++) {
                int result = results[i];
                if (result == 3) {
                    wonGame += 1;
                    wonPont += 3;
                } else if (result == 0) {
                    losedGame += 1;
                } else if (result == 1) {
                    drawGame += 1;
                    drawPoint += 1;
                }
            }

            int totalPoints = wonPont + drawPoint;
            System.out.println("The number of games played by the team: " + n);
            System.out.println("Games won: " + wonGame);
            System.out.println("Games lost: " + losedGame);
            System.out.println("Games draw: " + drawGame);
            System.out.println("Total Points: " + totalPoints);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
