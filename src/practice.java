import java.util.Arrays;
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
      int[] array = {5, 4, 3, 2, 1};
      bubbleSort(array);

    }
    static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j]>arr[j-1]){
                    continue;
                } else{
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }


}