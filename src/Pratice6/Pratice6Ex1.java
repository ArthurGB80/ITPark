public class Pratice6Ex1 {
    public static void main(String[]args){

        System.out.println("myArray: ");

        int[] myArray = new int[30];
        for (int i=0; i < myArray.length; i++) {
            myArray[i] = i - Math.round(myArray.length / 2);
            System.out.print(myArray[i] + " ");
        }

        System.out.println();
        System.out.println("Odd Numbers: ");
        int[] odds = new int[myArray.length];
        for (int j = 0; j < myArray.length; j++) {
            if (myArray[j] % 2 != 0) {
                odds[j] = myArray[j];
                System.out.print(odds[j] + " ");
            }
        }

        System.out.println();
        System.out.println("Even Numbers: ");
        int[] evens = new int[myArray.length];
        for (int j = 0; j < myArray.length; j++) {
            if (myArray[j] % 2 == 0 && myArray[j] != 0) {
                evens[j] = myArray[j];
                System.out.print(evens[j] + " ");
            }
        }

        System.out.println();
        System.out.println("Postive Numbers: ");
        int[] positives = new int[myArray.length];
        for (int j = 0; j < myArray.length; j++) {
            if (myArray[j] > 0) {
                positives[j] = myArray[j];
                System.out.print(positives[j] + " ");
            }
        }

        System.out.println();
        System.out.println("Negative Numbers:");
        int[] negatives = new int[myArray.length];
        for (int j = 0; j < myArray.length; j++) {
            if (myArray[j] < 0) {
                negatives[j] = myArray[j];
                System.out.print(negatives[j] + " ");
            }
        }

        System.out.println("\nOne-digit elengts: ");
        for (int j = 0; j < myArray.length; j++) {
            if (Math.abs(myArray[j]) < 10) {
                System.out.print(myArray[j] + " ");
            }
        }
         
        System.out.println("\nTwo-digit elengts: ");
        for (int j = 0; j < myArray.length; j++) {
            if (Math.abs(myArray[j]) > 10) {
                System.out.print(myArray[j] + " ");
            }   

        }

    }
    
}
