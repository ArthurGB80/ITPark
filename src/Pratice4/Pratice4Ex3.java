package Pratice4;

import java.util.Scanner;

public class Pratice4Ex3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int day;

        System.out.print("Enter day of the year: ");

        while (true) {
            if (scanner.hasNextInt()) {
                day = scanner.nextInt();
                if (day >= 1 && day <= 365) {
                    break;
                }
            }
            System.out.println("Invalid birth date");
            scanner.nextLine();
        }

        int x = Math.round(day / 7);
        int workday1 = 1 + 7 * x;
        int workday2 = 2 + 7 * x;
        int workday3 = 3 + 7 * x;
        int workday4 = 4 + 7 * x;
        int workday5 = 5 + 7 * x;
        int saturday = 6 + 7 * x;
        int sunday = 7 + 7 * x;

        if (day == workday1 || day == workday2 || day == workday3 || day == workday4 || day == workday5) {
            System.out.println("Day " + day + " is a workday!");
        } else if (day == saturday) {
            System.out.println("Day " + day + " is Saturday!");
        } else if (day == sunday) {
            System.out.println("Day " + day + " is Sunday!");
        } else {
            System.out.println(day + " It's not a workday!");
        }
    }
}
