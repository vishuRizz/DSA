import java.util.Arrays;

public class practice {
    public static void main(String[] args) {
        int[] arr = {1, 200, 30, 10, 700, 9, 12};

        System.out.println(Arrays.toString(selectionSortByRecursion(arr)));
    }
    public static int[] selectionSortByRecursion(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int end = arr.length - i -1;
           int maxIndex = returnMaxIndex(arr, 0, end);
           swap(arr, end, maxIndex);
        }
        return arr;
    }
    public static int returnMaxIndex(int[] arr, int start, int end){
        int max = start;
        for (int i = start; i <= end; i++) {
            if(arr[max]< arr[i]){
                max = i;
            }
        }
        return max;
    }
    public static void swap(int[] arr, int s, int e){
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
}