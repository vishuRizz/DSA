package Leetcode;

class Leetcode1342 {
    public static void main(String[] args) {
        int num = 8;
        System.out.println( numberOfSteps(num));
    }
    public static int numberOfSteps(int num) {
        int count = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                count++;
                num /= 2;
            }

            if(num%2!=0){
                count++;
                num--;
            }

        }
        return count;

    }
}