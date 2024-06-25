package Leetcode;

import java.util.Arrays;

public class Leetcode645 {
    public static void main(String[] args) {
        int[] array = {1,1};
        System.out.println(Arrays.toString(findErrorNums(array)));
    }
    public static int[] findErrorNums(int[] nums) {
     cycleSort(nums);
        for (int i = 0; i < nums.length; i++) {
            if(i != nums[i]-1){
                return new int[] {nums[i], i+1};
            }
        }
      return new int[] {} ;
    }
    public static void cycleSort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i]-1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            } else{
                i++;
            }
        }
    }
    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
