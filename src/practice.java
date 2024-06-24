
import java.util.Arrays;

public class practice {
    public static void main(String[] args) {
        int[] array = {4,3,2,7,8,2,3,1};
    cycleSort(array);

    }

    public static void cycleSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] < arr.length && i != arr[i] - 1) {
                swap(arr, i, arr[i]-1);
            } else {
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
