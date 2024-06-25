package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class leetcode442 {
    public static void main(String[] args) {
        int[] array = {4,3,2,7,8,2,3,1,1};
        System.out.println(findDuplicate(array));

    }
    public static List<Integer> findDuplicate(int[] nums){
        int i = 0;
        while(i < nums.length){
            int correct = nums[i]-1;
            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            } else{
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
// return the value while index != value-1;
        for (int j = 0; j < nums.length; j++) {
            if(j != nums[j]-1){
                ans.add(nums[j]);
            }
        }

        return ans;
    }
    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}