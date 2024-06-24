public class randomPractice {
    public static void main(String[] args) {
        int[] array = {0,2,3};
        findMissingNum(array);
    }

    public static void findMissingNum(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && i != correct) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
     //   System.out.println(Arrays.toString(arr));
     int ans =   findValue(arr);
        System.out.println(ans);
    }


    public static void swap(int[] arr, int first, int second) {
        int temp = arr[second];
        arr[second] = arr[first];
        arr[first] = temp;
    }
    public static int findValue(int[] arr){
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if(i != arr[i]){
                ans = i;
            } else {
               ans = arr[i]+1;
            }
        }
        return ans;
    }

}
