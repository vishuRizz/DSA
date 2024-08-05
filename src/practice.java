
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int x = sc.nextInt();
            for (int j = 0; j < x; j++) {
                String a = sc.next();
                System.out.println(a);
            }
        }
    }
}