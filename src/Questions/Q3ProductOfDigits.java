package Questions;

public class Q3ProductOfDigits {
    public static void main(String[] args) {
            System.out.println(productOfDigits(234));
        }

        public static int productOfDigits(int n) {
            if(n/10 == 0){
                return n%10;
            }
            int digit = n % 10;
            int newDigit = n / 10;
            return digit * productOfDigits(newDigit);
        }
    }
