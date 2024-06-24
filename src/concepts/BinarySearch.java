package concepts;

public class BinarySearch {
    public static void main(String[] args) {

        int[] intArray = new int[] {-32, -12, 1, 3, 4, 15, 16, 27, 38, 49, 120 };
        int target = 16;
       System.out.println(binarySearch(intArray, target));
    }
    public static int binarySearch(int[] arr,int target){
       int start = 0;
       int end = arr.length -1;
       while(start<=end){
           int mid = start + (end - start) /2;
           if(target>arr[mid]){
               start = mid+1;
           } else if(target<arr[mid]){
               end = mid;
           } else{
               return mid;
           }
       }
       return -1;
    }
}