
public class SearchInRotatedArray {

    static int i = 0;
    static int[] nums1 = {3, 4, 5, 1, 2};
    static int value = -1;


    public static void main(String[] args) {

        getIndex(nums1, value);
    }

    private static void getIndex(int[] nums1, int value) {

        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] == value) {
                System.out.println("Index is: " + i);
            }
        }
    }

}
