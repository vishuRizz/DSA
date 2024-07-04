import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class randomPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        System.out.println(getNextZeroLessNumber(number));
    }

    public static int getNextZeroLessNumber(int number) {
        while (true) {
            number++;
            if (!containsZero(number)) {
                return number;
            }
        }
    }

    public static boolean containsZero(int number) {
        while (number > 0) {
            if (number % 10 == 0) {
                return true;
            }
            number /= 10;
        }
        return false;
    }
}