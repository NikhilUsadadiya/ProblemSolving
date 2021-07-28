import java.util.Arrays;
import java.util.HashSet;

public class ClosestToSumOfThree {

//    static int[] nums1 = new int[]{-2, 7, -5, 1, 0, -1, 3};
    static int[] nums1 = new int[]  {-1,2,1,-4};
    static int lengthOfnums1 = 0;
    static int target = 2;
    static int final_total = Integer.MAX_VALUE;
    static int end = 0;

    public static void main(String[] args) {
        lengthOfnums1 = nums1.length;
        end = lengthOfnums1 - 1;
        sumOfThreeSolutionNearTarget(nums1, lengthOfnums1, target);
    }

    private static void sumOfThreeSolutionNearTarget(int[] nums1, int lengthOfnums1, int target) {
        Arrays.sort(nums1);
        for (int i = 0; i < lengthOfnums1; ++i) {
            if (final_total != 0) {
                int mid = i + 1;
                while (mid < end) {
                    int sum = nums1[i] + nums1[mid] + nums1[end];
                    if (Math.abs(target - sum) < Math.abs(final_total))
                        final_total = target - sum;

                    if (sum > target)
                        --end;
                    else
                        ++mid;
                }
            }
        }
        System.out.println("Diff: " + (target - final_total));
    }

}
