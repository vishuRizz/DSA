package Questions;

import java.util.ArrayList;

public class minMaxIndexOfChar {
    public static void main(String[] args) {
        String str = "abcdegaa";

        ArrayList<Integer> list = new ArrayList<>();
        findIndex(str, 0, list);
        int maxIndex = list.getLast();
        int minIndex = list.getFirst();
        System.out.println(maxIndex);
        System.out.println(minIndex);
    }

    static ArrayList<Integer> findIndex(String str, int i, ArrayList<Integer> list) {

        if (str.length() == i) {
            return list;
        }
        if (str.charAt(i) == 'a') {
            list.add(i);
        }
        findIndex(str, i + 1, list);
        return list;
    }
}
