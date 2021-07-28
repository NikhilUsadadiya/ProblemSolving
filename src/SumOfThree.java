import java.util.HashSet;

public class SumOfThree {

    static int[] nums1 = new int[] {-2, 7, -5, 1, 0, -1, 3};
    static int lengthOfnums1 = 0;

    public static void main (String[] args) {
        lengthOfnums1 = nums1.length;
//        sumOfThreeSolution(nums1);
        sumOfThreeSolutionWithHash(nums1, lengthOfnums1);
    }

    private static void sumOfThreeSolutionWithHash(int[] nums1, int lengthOfnums1) {
        for (int i = 0; i < lengthOfnums1; i++) {
            HashSet<Integer> set = new HashSet<>();
            for (int j = i+1; j < lengthOfnums1; j++) {
                int value = -(nums1[i] + nums1[j]);
                System.out.println("Total value: " + value);
                if (set.contains(value)) {
                    System.out.println("ifEnter value found: " + nums1[i] + "<>" + nums1[j] + "<>" + value);
                } else {
                    set.add(nums1[j]);
                    System.out.println("No value found...");
                }
            }
        }
    }

    private static void sumOfThreeSolution(int[] nums1) {
//        for (int i = 0, j = i+1, k = j+1; i < nums1.length; i++, j++, k++) {
        for (int i = 0; i < nums1.length; i++) {
            for (int j = i+1; j < nums1.length; j++) {
                for (int k = j+1; k< nums1.length; k++) {
//                    System.out.println("PrintData" + nums1[i] + nums1[j] + nums1[k]);
                    if (nums1[i] + nums1[j] + nums1[k] == 0) {
                        System.out.println("Result: " + nums1[i] + "<>" + nums1[j] + "<>" + nums1[k]);
                    }
                }
            }
        }
    }

}
