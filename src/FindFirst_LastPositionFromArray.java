

public class FindFirst_LastPositionFromArray {

    public static void main(String[] args) {
//        int[] nums1 = {1, 3};
        int[] nums1 = {3, 4, 5, 5, 6, 7};
        int firstvalue = -1;
        int targetvalue = -1;
        int value = 1;
        int length = nums1.length;

        getIndexValue(nums1, value, firstvalue, targetvalue);
//        System.out.println("::>>FirstOccurance: " + first(nums1, length, targetvalue));
//        System.out.println("::>>FirstOccurance: " + last(nums1, length, targetvalue));
    }

    private static int first(int[] nums1, int length, int targetvalue) {
        int low = 0, high = length - 1,
                res = -1;
        while (low <= high)
        {
            // Normal Binary Search Logic
            int mid = (low + high) / 2;
            if (nums1[mid] > targetvalue)
                high = mid - 1;
            else if (nums1[mid] < targetvalue)
                low = mid + 1;

                // If arr[mid] is same as
                // x, we update res and
                // move to the left half.
            else
            {
                res = mid;
                high = mid - 1;
            }
        }
        return res;
    }

    private static int last(int[] nums1, int length, int targetvalue) {
        int low = 0, high = length - 1,
                res = -1;
        while (low <= high)
        {
            // Normal Binary Search Logic
            int mid = (low + high) / 2;
            if (nums1[mid] > targetvalue)
                high = mid - 1;
            else if (nums1[mid] < targetvalue)
                low = mid + 1;

                // If arr[mid] is same as x,
                // we update res and move to
                // the right half.
            else
            {
                res = mid;
                low = mid + 1;
            }
        }
        return res;
    }

    private static void getIndexValue(int[] nums1, int value, int firstvalue, int targetvalue) {
        int prev_i = -1;
        for (int i = 0; i < nums1.length; i++) {
            prev_i = i;
            if (i > 0) {
                prev_i = prev_i - 1;
            }
            if (nums1[i] == value) {
                if (prev_i == -1) {
                    firstvalue = i;
                    prev_i = 0;
                } else if (prev_i == 0) {
                    targetvalue = i;
                } else {
                    firstvalue = 0;
                    targetvalue = 0;
                }
//                System.out.println("Index is: " + i);
            } else {
                firstvalue = 0;
                targetvalue = 0;
            }
        }
        int arr[] = {firstvalue, targetvalue};
        System.out.println("Index array is: " + arr.toString() + "<>firstvalue: " + firstvalue
        + "<>targetvalue: " + targetvalue);
    }
}
