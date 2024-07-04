package Questions;

public class Q5CountZeros {
    public static void main(String[] args) {
        System.out.println(countZeros(102034));
    }
    public static int countZeros(int n){
        if(n/10 == 0){
            return 0;
        }
        int count = 0;
        while(n != 0){
          if(n%10 == 0){
              count++;
              n /= 10;
          } else {
              n /= 10;
          }

        }
        return count;
    }
}
