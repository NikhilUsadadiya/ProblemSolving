

public class SearchInsertPosition {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 5, 6, 8, 9};
        int value = 7;
        int length = nums1.length;
        int result = getIndex(nums1, 0, length - 1, value);
        System.out.println("Result: " + result);
    }

    private static int getIndex(int[] nums1, int start, int last, int value) {

        while (start <= last) {
            int mid = (start + last) / 2;
            if (value == nums1[mid]) {
                return mid;
            } else if (nums1[mid] < value && value > nums1[start]) {
                start = mid + 1;
//            return getIndex(nums1, start + 1, mid, value);
            } else if (nums1[mid] > value && value < nums1[last]) {
                last = mid - 1;
//            return getIndex(nums1, mid, last - 1, value);
            }
        }
        return last + 1;
    }

}
