import java.util.HashSet;

public class SumOfFour {

    static int[] nums1 = new int[]{1, 0, -1, 2, -2, 0};
    static int lengthOfnums1 = 0;

    public static void main(String[] args) {
        lengthOfnums1 = nums1.length;
        sumOfFourSolutionWithHash(nums1, lengthOfnums1);
    }

    private static void sumOfFourSolutionWithHash(int[] nums1, int lengthOfnums1) {
        for (int i = 0; i < lengthOfnums1; i++) {
            HashSet<Integer> set = new HashSet<>();
            for (int j = i + 1; j < lengthOfnums1; j++) {
                for (int k = j + 1; k < lengthOfnums1; k++) {
                    int value = -(nums1[i] + nums1[j] + nums1[k]);
                    System.out.println("Total value: " + value);
                    if (set.contains(value)) {
                        System.out.println("ifEnter value found: " + nums1[i] + "<>" + nums1[j]
                                + "<>" + nums1[k] + "<>" + value);
                    } else {
                        set.add(nums1[j]);
                        System.out.println("No value found...");
                    }
                }
            }
        }
    }

}
