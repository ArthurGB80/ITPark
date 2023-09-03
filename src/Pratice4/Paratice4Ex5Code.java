import java.util.Scanner;

public class Paratice4Ex5Code {
    
    public static void main(String[] args) {

        String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String[] seasonNames = {"Winter", "Winter", "Spring", "Spring", "Spring", "Summer", "Summer", "Summer", "Autumn", "Autumn", "Autumn", "Winter"};
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a month number (1-12): ");
            int monthNumber = Integer.parseInt(scanner.nextLine());
    
            if (monthNumber >= 1 && monthNumber <= 12) {
                String monthName = monthNames[monthNumber - 1];
                int days = daysInMonth[monthNumber - 1];
                String seasonName = seasonNames[monthNumber - 1];
    
                System.out.println(monthName + " has " + days + " days");
                System.out.println(seasonName);
            } else {
                System.out.println("Invalid month number");
            }
        }
    }
    
}