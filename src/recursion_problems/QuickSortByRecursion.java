package recursion_problems;

import java.util.Arrays;

public class QuickSortByRecursion {
    public static void main(String[] args) {
     int[] array = {5, 4, 3, 2, 1};
     quickSort(array, 0, array.length -1);
        System.out.println(Arrays.toString(array));
    }
    static void quickSort(int[] arr, int low, int high){
       if(low<high){
           return;
       }
        int start = low;
        int end = high;
        int mid = start + (end-start)/2;
        int pivot = arr[mid];
        while (start <= end) {
            while (arr[start] < pivot) {
                    start++;
                }
            while (pivot < arr[end]) {
                end--;
            }
            if(start <= end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        quickSort(arr, low, end);
        quickSort(arr, start, high);
    }
}
