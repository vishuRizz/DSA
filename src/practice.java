import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        print();
    }
    static void print(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number again:");
        int n = sc.nextInt();
        if(n<100 && n > 10){
            System.out.println("yes your input is good");
            return;
        }

        print();
    }

}