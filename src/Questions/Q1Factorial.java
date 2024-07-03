package Questions;

public class Q1Factorial {
    public static void main(String[] args) {

        int ans = factorial(5);
        System.out.println(ans);
    }
    public static int factorial(int n){
        if(n==1){
            return 1;
        }
        int sumofn = n * factorial(n-1);
        return sumofn;
    }
}
