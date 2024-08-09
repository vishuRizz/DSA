package Questions;

public class removeAfromStr {
    public static void main(String[] args) {
        String str = "baccad";
        StringBuilder newStr = new StringBuilder();
        removeAByIteration(str, newStr);
        System.out.println(removeAByRecursion(str, 0, newStr));
        System.out.println(removeAByRecursionNoSb(str, 0));
    }

    static void removeAByIteration(String str, StringBuilder newString) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a') {
                continue;
            } else {
                newString.append(ch);
            }
        }
        System.out.println(newString);
    }

    static StringBuilder removeAByRecursion(String str, int i, StringBuilder newStr) {
        if (i == str.length()) {
            return newStr;
        }
        if (str.charAt(i) == 'a') {
            i = i + 1;
            removeAByRecursion(str, i, newStr);
        } else {
            newStr.append(str.charAt(i));
            i = i + 1;
            removeAByRecursion(str, i, newStr);
        }
        return newStr;
    }
    static String removeAByRecursionNoSb(String str, int i) {
        if (i == str.length()) {
            return "";
        }

        char ch = str.charAt(i);
        if (ch == 'a') {
            return removeAByRecursionNoSb(str, i + 1);
        } else {
            return ch + removeAByRecursionNoSb(str, i + 1);
        }
    }
}
