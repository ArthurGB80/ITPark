import java.util.Arrays;
import java.util.Random;

public class Pratice6Ex2 {
    public static void main(String[] args){

        Random random = new Random();
        int[] myArray = new int[10];

        System.out.println("\nmyArray: ");       
        
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(100);
            System.out.print(myArray[i] + " ");
        }

        // 1. Find the arithmetic mean of the smallest and largest elements in the array.

        System.out.println();
        double average = (Math.abs(myArray[0]) + Math.abs(myArray[myArray.length - 1]))/2;
        System.out.println("\nAverage at fist and last: " + average);

        // 2. Count the number of elements in the array whose value is greater than this mean.
        
        System.out.println("\nNumbers greater than average: ");
        for (int j = 0; j < myArray.length; j++) {
            if (myArray[j] > average) {
                System.out.print(myArray[j] + " ");
            }           
        }

        System.out.println();
        System.out.println("\nNumbers less than average: ");
        for (int x = 0; x < myArray.length; x++) {
            if (myArray[x] < average) {
                System.out.print(myArray[x] + " ");
            }
        }

        // 3. Print the ordinal numbers of these elements.

        System.out.println();
        System.out.println("\nOrdinal numbers greater than average: ");
        int[] ordersGreater = new int[myArray.length];
        for (int y = 0; y < myArray.length; y++) {
            if (myArray[y] > average) {
                ordersGreater[y] = myArray[y];                
            }
            // System.out.print(ordersGreater[y] + " ");          
        }

        System.out.println();
        int[] ordersGreaterNoZero = new int[myArray.length];
        int count = 0;
        for (int b = 0; b < myArray.length; b++) {
            if (ordersGreater[b] != 0) {
                ordersGreaterNoZero[count++] = myArray[b];
            }
        }
        int[] result1 = Arrays.copyOf(ordersGreaterNoZero, count);

        Arrays.sort(result1);
        for (int z = 0; z < result1.length; z++) {
            System.out.print(result1[z] + " ");
        }


        System.out.println("\nOrdinal numbers less than average: ");
        int[] ordersLess = new int[myArray.length];
        for (int w = 0; w < myArray.length; w++) {
            if (myArray[w] < average) {
                ordersLess[w] = myArray[w];                
            } 
            else { 
            // System.out.print(ordersLess[w] + " ");
        }
        }

        System.out.println();
        int[] ordersLessNoZero = new int[myArray.length];
        int count2 = 0;
        for (int a = 0; a < ordersLess.length; a++) {
            if (ordersLess[a] != 0) {
                ordersLessNoZero[count2++] = ordersLess[a];
            }
        }
        int[] result2 = Arrays.copyOf(ordersLessNoZero, count2);

        Arrays.sort(result2);
        for (int z = 0; z < result2.length; z++) {
            System.out.print(result2[z] + " ");
        }
    }
}
