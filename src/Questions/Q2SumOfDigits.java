package Questions;

public class Q2SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(234));
    }

    public static int sumOfDigits(int n) {
        if(n/10 == 0){
            return n%10;
        }
        int digit = n % 10;
        int newDigit = n / 10;
        return digit + sumOfDigits(newDigit);
    }
}
