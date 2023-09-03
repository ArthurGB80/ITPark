import java.util.Arrays;

public class Pratice6Ex3 {
    public static void main(String[] args) {

        double[] nums = {3.14, 2.71, 1.618, -1.0, 0.0, -2.0, -4.0, 6.0, 8.0, 0.0};
        double avg = Arrays.stream(nums).average().getAsDouble();

        System.out.println("Initial Array:");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println();
        System.out.println();


        System.out.println("Average: " + avg);

        System.out.println();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                nums[i] += 1;
            } else if (nums[i] < 0) {
                nums[i] -= 1;
            } else if (nums[i] == 0) {
                nums[i] = avg;
            }
        }

        System.out.println("Final Array:");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

}
