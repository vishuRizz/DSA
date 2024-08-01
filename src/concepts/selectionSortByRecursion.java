package concepts;

import java.util.Arrays;

public class selectionSortByRecursion {
    public static void main(String[] args) {
        int[] array = {30, 201, -1, -102, 5};
        System.out.println(Arrays.toString(selectionSorting(array, 0, 1, array.length)));

    }
    public static int[] selectionSorting(int[] arr, int maxIndex,int current, int r){
        if(r==1){
            return arr;
        }
        if(current < r){
            if(arr[current]>arr[maxIndex]){
                selectionSorting(arr, current, current+1, r);
            } else{
                selectionSorting(arr, maxIndex, current+1, r);
            }
        } else{
            swap(arr, r-1, maxIndex);
            selectionSorting(arr, 0, 0, r-1);
        }

        return arr;
    }
    public static void swap(int[] arr, int s, int e) {
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
}
