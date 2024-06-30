package concepts;

public class Recursion {
    public static void main(String[] args) {
        int n = 1;
        print(n);
    }
    static void print(int n){
      if(n==6){
          return;
      }
           System.out.println(n);
           n++;
           print(n);


    }
}
