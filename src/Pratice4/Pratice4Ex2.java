import java.time.LocalDateTime;
import java.util.Scanner;

public class Pratice4Ex2 {

    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        int day = now.getDayOfMonth();
        int month = now.getMonthValue();
        int year = now.getYear();
        int hour = now.getHour();
        int minute = now.getMinute();
        int second = now.getSecond();
        System.out.println("Current date and time: " + day + "/" + month + "/" + year + " " + hour + ":" + minute + ":" + second);

        Scanner sc = new Scanner(System.in);
        int birthDay = 0;
        int birthMonth = 0;
        int birthYear = 0;

        System.out.println("Enter your birth date: ");
        while (true) {
            if (sc.hasNextInt()) {
                birthDay = sc.nextInt();
                if (birthDay >= 1 && birthDay <= 31) {
                    break;
                }
            }
            System.out.println("Invalid birth date");
            sc.nextLine();
        }

        System.out.println("Enter the month of your birth: ");

        while (true) {
            if (sc.hasNextInt()) {
                birthMonth = sc.nextInt();
                if (birthMonth >= 1 && birthMonth <= 12) {
                    break;
                }
            }
            System.out.println("Invalid birth month");
            sc.nextLine();
        }

        System.out.println("Enter the year of your birth: ");
        while (true) {
            if (sc.hasNextInt()) {
                birthYear = sc.nextInt();
                if (birthYear >= 1900 && birthYear <= 2020) {
                    break;
                }
            }
            System.out.println("Invalid birth year");
            sc.nextLine();
        }

        int years = LocalDateTime.now().getYear() - birthYear;
        int months = LocalDateTime.now().getMonthValue() - birthMonth;
        int days = LocalDateTime.now().getDayOfMonth() - birthDay;

        if (months < 0 || (months == 0 && days < 0)) {
            years--;
            months += 12;
        }

        System.out.println("Your age is: " + years + " years " + months + " months " + days + " days");
    }

} 
