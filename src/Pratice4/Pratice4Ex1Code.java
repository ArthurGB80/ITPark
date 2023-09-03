import java.util.Scanner;

public class Pratice4Ex1Code {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number of numbers: ");
    
        int n = input.nextInt();
        int max = Integer.MIN_VALUE; // set initial values to max and min to min and max integer values
        int min = Integer.MAX_VALUE;
    
        try {
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
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        } finally {
            input.close(); // close the scanner to avoid resource leak
        }
    
        System.out.println("Max value: " + max);
        System.out.println("Min value: " + min);
    }

}