
import java.util.Arrays;

public class practice {
    public static void main(String[] args) {
        System.out.println(countZeros(102034));
    }
    public static int countZeros(int n){
        if(n/10 == 0){
            return 0;
        }
        int count=0;
      if(n%10 == 0){
          count++;
         countZeros(n/10);
      } else{
          countZeros(n/10);
      }
        return count;
    }
}
