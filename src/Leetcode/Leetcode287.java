package Leetcode;

public class Leetcode287 {
    public static void main(String[] args) {
        int[] array = {3,3,3,1,2,3};
        System.out.println(findDuplicate(array));

    }
    public static int findDuplicate(int[] nums){
        int i = 0;

        while(i < nums.length){
            int correct = nums[i]-1;
            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            } else{
                i++;
            }
        }
        return duplicateChecker(nums);
    }
    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static int duplicateChecker(int[] arr){
        int lastIndex = arr.length-1;
        if(arr[lastIndex] - 1  != arr[lastIndex-1]){
            return arr[lastIndex];
        }
        return -1;
    }
}

