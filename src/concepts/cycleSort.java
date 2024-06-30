package concepts;

import java.util.Arrays;

public class cycleSort {
    public static void main(String[] args) {
        int[] array = {1,2,2,4};
        sorting(array);
    }

    public static void sorting(int[] arr) {
        // index = value - 1;
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[second];
        arr[second] = arr[first];
        arr[first] = temp;
    }
}
