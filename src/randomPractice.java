import java.util.Arrays;
import java.util.Scanner;

public class randomPractice {
    public static void main(String[] args) {
   int[] array = {30, 201, -1, -102, 5};
     BubbleSortByRecursion(array, array.length-1,0);

    }

    public static void BubbleSortByRecursion(int[] arr, int i, int j) {
        if (i == 0) {
            return;
        }
        if (i < j) {
            if (arr[i] > arr[i+1]) {
                swap(arr, i, i - 1);
            }
            BubbleSortByRecursion(arr, i, j + 1);

        } else {
            i++;
            BubbleSortByRecursion(arr, i - 1, 0);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr, int s, int e) {
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
}