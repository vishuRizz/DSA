package Standards;

import java.util.ArrayList;
import java.util.Objects;

public class PermutationsOfString {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(permutationOfString("", "abc", list));
        System.out.println(countOfPermutationsOfString("", "abc"));
    }
    static ArrayList<String> permutationOfString(String pro, String unPro, ArrayList<String> list){
        if(unPro.isEmpty()){
            list.add(pro);
            return list;
        }
        char firstChar = unPro.charAt(0);
        int n = pro.length();
        for (int i = 0; i <= n; i++) {
            String first = pro.substring(0, i);
            String second = pro.substring(i);
            permutationOfString(first + firstChar + second, unPro.substring(1), list);
        }

        return list;
    }
    static int countOfPermutationsOfString(String pro, String unPro){
        if(unPro.isEmpty()){
           return 1;
        }
        char firstChar = unPro.charAt(0);
        int n = pro.length();
        int count = 0;
        for (int i = 0; i <= n; i++) {
            String first = pro.substring(0, i);
            String second = pro.substring(i);
           count = count + countOfPermutationsOfString(first + firstChar + second, unPro.substring(1));
        }
 return count;
    }
}
