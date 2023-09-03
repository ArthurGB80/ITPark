import java.util.Scanner;

public class Paratice4Ex5 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter with a month: ");
            int month = Integer.parseInt(System.console().readLine());

            switch (month) {
                case 1:
                    System.out.println("January");
                    System.out.println("Winter");
                    System.out.println("January has 31 days");
                    break;
                case 2:
                    System.out.println("February");
                    System.out.println("Winter");
                    System.out.println("February has 28 days");
                    break;
                case 3:
                    System.out.println("March");
                    System.out.println("Spring");
                    System.out.println("March has 31 days");
                    break;
                case 4:
                    System.out.println("April");
                    System.out.println("Spring");
                    System.out.println("April has 30 days");
                    break;
                case 5:
                    System.out.println("May");
                    System.out.println("Spring");
                    System.out.println("May has 31 days");
                    break;
                case 6:
                    System.out.println("June");
                    System.out.println("Summer");
                    System.out.println("June has 30 days");
                    break;
                case 7:
                    System.out.println("July");
                    System.out.println("Summer");
                    System.out.println("July has 31 days");
                    break;
                case 8:
                    System.out.println("August");
                    System.out.println("Summer");
                    System.out.println("August has 31 days");
                    break;
                case 9:
                    System.out.println("September");
                    System.out.println("Autumn");
                    System.out.println("September has 30 days");
                    break;
                case 10:
                    System.out.println("October");
                    System.out.println("Autumn");
                    System.out.println("October has 31 days");
                    break;
                case 11:
                    System.out.println("November");
                    System.out.println("Autumn");
                    System.out.println("November has 30 days");
                    break;
                case 12:
                    System.out.println("December");
                    System.out.println("Spring");
                    System.out.println("December has 31 days");
                    break;
                default:
                    System.out.println("Not correct number");
            }
        }


    }
}