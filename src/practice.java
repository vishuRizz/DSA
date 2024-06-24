
import java.util.Arrays;

public class practice {
    public static void main(String[] args) {
        int[] array = {4,3,2,7,8,2,3,1};
    cycleSort(array);

    }

    public static void cycleSort(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        System.out.println(Arrays.toString(nums));
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
