import java.util.Arrays;

public class selectionSortAlgorithm {
    public static void main(String[] args) {
        int[] array = {5, 4, 1, 2, 3};
        selectionSort(array);

    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);

            int temp = arr[last];
            arr[last] = arr[maxIndex];
            arr[maxIndex] = temp;


        }
        System.out.println(Arrays.toString(arr));
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
}
