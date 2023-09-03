public class Test2 {
    public static void main(String[] args) {
        int[][] square1 = { { 2, 7, 6 }, { 9, 5, 1 }, { 4, 3, 8 } };
        int[][] square2 = { { 8, 1, 6 }, { 3, 5, 7 }, { 4, 9, 2 } };

        boolean isMagicSquare1 = isMagicSquare(square1);
        boolean isMagicSquare2 = isMagicSquare(square2);

        System.out.println("Square 1 is a magic square: " + isMagicSquare1);
        System.out.println("Square 2 is a magic square: " + isMagicSquare2);
    }

    public static boolean isMagicSquare(int[][] square) {
        int size = square.length;
        int targetSum = size * (size * size + 1) / 2;

        // Check rows and columns
        for (int i = 0; i < size; i++) {
            int rowSum = 0;
            int colSum = 0;
            for (int j = 0; j < size; j++) {
                rowSum += square[i][j];
                colSum += square[j][i];
            }
            if (rowSum != targetSum || colSum != targetSum) {
                return false;
            }
        }

        // Check diagonals
        int diagSum1 = 0;
        int diagSum2 = 0;
        for (int i = 0; i < size; i++) {
            diagSum1 += square[i][i];
            diagSum2 += square[i][size - 1 - i];
        }
        if (diagSum1 != targetSum || diagSum2 != targetSum) {
            return false;
        }

        return true;
    }
}
