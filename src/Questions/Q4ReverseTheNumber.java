package Questions;

public class Q4ReverseTheNumber {
    public static void main(String[] args) {
        System.out.println(ReverseTheNumber(1234));
    }
    public static int ReverseTheNumber(int n){
        if(n%10 == n){
            return n;
        }
         int numOfdigits = digitCounter(n);
       int power = (int)Math.pow(10, numOfdigits-1);
        int lastDigit = n % 10;
        int newDigit = n / 10;
        return lastDigit * power  +  ReverseTheNumber(newDigit);
    }
    public static int digitCounter(int n){
        int count = 0;
        while(n != 0){
            n /= 10;
            count++;
        }
        return count;
    }
}
