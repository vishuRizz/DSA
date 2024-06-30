package concepts;

public class FibonacciSeries {
    public static void main(String[] args) {

        System.out.println(fibonacci(7));
    }
    public static int fibonacci(int n){

        if(n<2){
            return n;
        }
        int ans = fibonacci(n-1)+ fibonacci(n-2);
        return ans;
    }
}
