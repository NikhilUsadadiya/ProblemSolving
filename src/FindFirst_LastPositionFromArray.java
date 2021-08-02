

public class FindFirst_LastPositionFromArray {

    static int[] nums1 = {3, 4, 5, 1, 5, 2};
    static int firstvalue = -1;
    static int targetvalue = -1;
    static int value = 5;

    public static void main(String[] args) {

        getIndexValue(nums1, value);
    }

    private static void getIndexValue(int[] nums1, int value) {
        int prev_i = -1;
        for (int i = 0; i < nums1.length; i++) {
            /*prev_i = i;
            if (i > 0) {
                prev_i = prev_i - 1;
            }*/
            if (nums1[i] == value) {
                if (prev_i == -1) {
                    firstvalue = i;
                    prev_i = 0;
                } else if (prev_i == 0) {
                    targetvalue = i;
                }
//                System.out.println("Index is: " + i);
            }
        }
        int arr[] = {firstvalue, targetvalue};
        System.out.println("Index array is: " + arr.toString() + "<>firstvalue: " + firstvalue
        + "<>targetvalue: " + targetvalue);
    }

}
