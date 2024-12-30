//  subsets and subsequence pattern
// use when you need to create some patters of subsets by permutations and combinations

package Standards;
import java.util.ArrayList;
import java.util.List;

public class subsequenceOfString {
    public static void main(String[] args) {
        String str = "abc";
        ArrayList<String> list = new ArrayList<>();
        System.out.println(subSequenceByRecursion("", str, list));
        int[] array = {1, 2, 3};
        System.out.println(subsetByIteration(array));
    }

    static ArrayList<String> subSequenceByRecursion(String pro, String unPro, ArrayList<String> list){
        if(unPro.isEmpty()){
            list.add(pro);
            return list;
        }
        char firstChar = unPro.charAt(0);
        subSequenceByRecursion(pro + firstChar, unPro.substring(1), list);
        subSequenceByRecursion(pro, unPro.substring(1), list);
        return list;
    }
    static List<List<Integer>> subsetByIteration(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num : arr){
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }
}
