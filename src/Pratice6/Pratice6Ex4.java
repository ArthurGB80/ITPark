import java.util.Random;

public class Pratice6Ex4 {
    public static void main(String[] args) {

        Random random = new Random();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int maxi = 0;
        int mini = 0;
        int maxj = 0;
        int minj = 0;

        int[][] a = new int[7][7];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = random.nextInt(50); // random.nextInt(5, 10)
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }


        for (int x = 0; x < a.length; x++) {
            for (int y = 0; y < a[x].length; y++) {
                if (a[x][y] > max) {
                    max = a[x][y];
                    maxi = x;
                    maxj = y;
                }
                if (a[x][y] < min) {
                    min = a[x][y];
                    mini = x;
                    minj = y;
                }
            }
        }

        System.out.println("The maximum value is: " + max);
        System.out.println("The minimum value is: " + min);
        System.out.println("Coordinates of the maximum value: " + "(" + maxi + ", " + maxj + ")");
        System.out.println("Coordinates of the minimum value: " + "(" + mini + ", " + minj + ")");
        


        /*
        for (int[] x : a) {
            for (int y : x) {
                if (y > max) {
                    max = y;
                }
            }
        }
        System.out.println(max);
        */

    }

}
