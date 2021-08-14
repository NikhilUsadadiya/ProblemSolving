import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CombinationSum2 {

    public static void main(String[] args) {

        int[] candidates = {1, 1, 2, 4, 5, 6};
        int target = 12;
        callCombinationMethod(candidates, target);
    }

    private static void callCombinationMethod(int[] candidates, int target) {
        List<List<Integer>> results = new ArrayList<>();
        LinkedList<Integer> combination = new LinkedList<>();

        Arrays.sort(candidates);
        backtrack(candidates, combination, target, 0, results);
        System.out.println("callCombinationMethod: " + results);
    }

    private static void backtrack(int[] candidates,
                                  LinkedList<Integer> combination,
                                  int target,
                                  int index,
                                  List<List<Integer>> results) {
        if (target == 0) {
            results.add(new ArrayList<Integer>(combination));
            return;
        }

        for (int nextCurr = index; nextCurr < candidates.length; ++nextCurr) {
            if (nextCurr > index && candidates[nextCurr] == candidates[nextCurr - 1])
                continue;

            Integer pick = candidates[nextCurr];
            System.out.println("pick: " + pick);
            if (target - pick < 0)
                break;

            combination.addLast(pick);
            System.out.println("combination: " + combination);
            backtrack(candidates, combination, target - pick, nextCurr + 1, results);
            combination.removeLast();
        }
    }

}
