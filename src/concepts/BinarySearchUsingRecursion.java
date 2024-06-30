package concepts;

public class BinarySearchUsingRecursion {
    public static void main(String[] args) {
    int[] arr = {1,12,13,24,45,56,67,78};
    int target = 67;
        System.out.println(binarySearchByRecursion(arr, 0, arr.length, target));
    }
    public static int binarySearchByRecursion(int[] arr, int s, int e, int target){
       if(s>e){
           return -1;
       }
        int mid = s + (e-s)/2;
        if(arr[mid]==target){
            return mid;
        } else if(arr[mid]>target){
            return binarySearchByRecursion(arr, s, mid-1, target);
        }
            return binarySearchByRecursion(arr, mid+1, e, target);


    }
    }
