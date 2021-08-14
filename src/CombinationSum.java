import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class CombinationSum {


    public static void main(String[] args) {
        int sum = 8;
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(4);
        arr.add(6);
        arr.add(8);

        ArrayList<ArrayList<Integer>> ans = combinationSum(arr, sum);

        if (ans.size() == 0) {
            System.out.println("Empty");
            return;
        }
    }

    private static ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> arr, int sum) {
        ArrayList<ArrayList<Integer> > ans = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();

        Set<Integer> set = new HashSet<>(arr);
        System.out.println("set: " + set);
        arr.clear();
        arr.addAll(set);
        System.out.println("arr: " + arr);
        Collections.sort(arr);
        System.out.println("collections: " + arr);

        findNumbers(ans, arr, sum, 0, temp);
        return ans;
    }

    private static void findNumbers(ArrayList<ArrayList<Integer>> ans,
                                    ArrayList<Integer> arr,
                                    int sum,
                                    int value,
                                    ArrayList<Integer> temp)
    {
        System.out.println("findNumbers sum: " + sum
                + "<>value: "+ value
                + "<>temp: " + temp
                + "<>ans: " + ans
                + "<>arr: " + arr);
        if (sum == 0) {
            // Adding deep copy of list to ans
            ans.add(new ArrayList<>(temp));
            System.out.println("findNumbers: " + ans);
            return;
        }

        for (int i = value; i < arr.size(); i++) {
            System.out.println("for-loop: " + arr.get(i));
            if ((sum - arr.get(i)) >= 0) {
                temp.add(arr.get(i));
                System.out.println("temp: " + temp);
                findNumbers(ans, arr, sum - arr.get(i), i, temp);
                temp.remove(arr.get(i));
                System.out.println("temp removed: " + temp);
            }
        }
    }

}
