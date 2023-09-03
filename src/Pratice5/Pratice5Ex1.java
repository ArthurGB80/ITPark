package Pratice5;

public class Pratice5Ex1 {

    public static void main(String[] args) {

        double km = 10;
        System.out.println("The Distance in the day 1 is 10,00 km");

        for (int i = 1; i <= 9; i++) {
            km = km + (km * 0.1);
            System.out.printf("The Distance in the day %d is %.2f km%n", i + 1, km);

        }

        System.out.println();
        System.out.printf("Total Distance: %.2f km %n", km);
    }

}
