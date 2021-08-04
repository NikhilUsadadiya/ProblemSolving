
public class SearchInRotatedArray {



    public static void main(String[] args) {
        int i = 0;
        int[] nums1 = { 4, 5, 6, 7, 8, 9, 1, 2, 3 };
        int value = 1;
        int length = nums1.length;
        int result = getIndexwithProperCode(nums1, 0, length - 1, value);
//        getIndex(nums1, value);
        System.out.println("Result: " + result);
    }

    private static int getIndexwithProperCode(int[] nums1, int start, int last, int value) {
        if (start > last)
            return -1;

        int mid = (start + last) / 2;
        if (value == nums1[mid]) {
            System.out.println("value equals to mid: " + mid);
            return mid;
        }

        if (nums1[start] <= nums1[mid]) {
            if (value >= nums1[start] && value <= nums1[mid]) {
                return getIndexwithProperCode(nums1, start, mid - 1, value);
            }
            return getIndexwithProperCode(nums1, mid + 1, last, value);
        }

        if (value >= nums1[mid] && value <= nums1[last]) {
            return getIndexwithProperCode(nums1, mid + 1, last, value);
        }
        return getIndexwithProperCode(nums1, last, mid - 1, value);
    }

    private static void getIndex(int[] nums1, int value) {
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] == value) {
                System.out.println("Index is: " + i);
            }
        }
    }

}
