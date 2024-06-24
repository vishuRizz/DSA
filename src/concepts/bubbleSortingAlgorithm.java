package concepts;

import java.util.Arrays;

public class bubbleSortingAlgorithm {
    public static void main(String[] args) {
        int[] arr = {30,201,-4,-102,5};
       bubbleSort(arr);

    }
    public static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            // the value of i will take a count of how many times the loop runs, so it can take a count of sorted values
         for (int j = 1; j < arr.length - i; j++){
           if(arr[j]<arr[j-1]){
               // swap
               int temp = arr[j];
               arr[j] = arr[j-1];
               arr[j-1] = temp;

           }
            }
        }
       System.out.println(Arrays.toString(arr));
    }

}
