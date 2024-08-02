
import java.util.Arrays;

public class practice {
    public static void main(String[] args) {
        int[] array = {5, 4, 3 ,2, 1};
        System.out.println(Arrays.toString(MergeSort(array)));
    }
    static int[] MergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = MergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = MergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        // merge the left and the right array
        return merge(left, right);
    }
    static int[] merge(int[] first, int[] second){
    int[] mix = new int[first.length + second.length];
    int i = 0;
    int j = 0;
    int k = 0;
    while(i < first.length && j < second.length){
        if (first[i] < second[j]) {
            mix[k] = first[i];
            i++;
        } else {
            mix[k] = second[j];
            j++;
        }
        k++;
    }
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }
        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
    }

    return mix;
    }
}