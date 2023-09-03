import java.util.Scanner;

public class Pratice5Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a number to calculate if it is a perfect number: ");
            int number = Integer.parseInt(scanner.nextLine());
            int sum = 0;
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    sum += i;
                }
            }
            if (sum == number * 2) {
                System.out.println(String.format("%d is a perfect number", number));
            } else {
                System.out.println(String.format("%d is not a perfect number", number));
            }
        }
    }
}

// 6
// 28
// 496
// 8128
// 33550336
// 8589869056
// 137438691328
// 2305843008139952128
// 2658455991569831744654692615953842176
// 191561942608236107294793378084303638130997321548169216
// 13164036458569648337239753460458722910223472318386943117783728128
// 14474011154664524427946373126085988481573677491474835889066354349131199152128
// 235627234572673470657895489967099049884775478583926007101430275975063372831786


