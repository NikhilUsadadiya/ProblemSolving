import java.util.HashMap;
import java.util.Map;

public class SumOfTwo {

    static int[] numss = new int[] {2, 7, 11, 15};
    public static void main(String[] args) {
            System.out.println("Hello World");
            twoSum(numss, 9);
    }


   /* public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
        // In case there is no solution, we'll just return null
        return null;
    }*/

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                System.out.println(map.get(complement) + i);
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
            System.out.println(nums[i] + "<>" + i);
        }
        // In case there is no solution, we'll just return null
        return null;
    }

}
