package Questions;

public class DicePermutationsAndCombinations {
    public static void main(String[] args) {
     diceCombinations("", 4);
    }

    static void diceCombinations(String pro, int target){
        if(target == 0){
            System.out.println(pro);
            return;
        }
        //this for loop for i = 1 is going to work till (target - i) becomes 0 and the base condition is reached
        // and will continue to work
        for (int i = 1; i <= 6 && i <= target ; i++) {
            diceCombinations(pro + i, target - i);
        }
    }
}
