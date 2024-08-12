package concepts;
import java.util.Arrays;

public class mergeSortByRecursion {
    public static void main(String[] args) {
    int[] array = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(MergeSort(array)));
    }
    static int[] MergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid =  arr.length / 2;
        int[] left = MergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = MergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        // let's merge these arrays
       return merge(left, right);
    }
    static int[] merge(int[] left, int[] right){
        int[] mixed = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left.length && j < right.length){
            if(left[i] > right[j]){
                mixed[k] = right[j];
                j++;
            } else {
                mixed[k] = left[i];
                i++;
            }
            k++;
        }
        // when the above two condition won't fulfill at the same time then either on of them will
        // still some indexes might remain even after that cause either one array got ouy of bound
        while(i < left.length){
        mixed[k] = left[i];
        i++;
        k++;
        }
        while(j < right.length){
            mixed[k] = left[j];
            j++;
            k++;
        }
        return mixed;
    }
}
