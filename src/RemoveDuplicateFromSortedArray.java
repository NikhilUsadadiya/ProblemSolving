public class RemoveDuplicateFromSortedArray {


    static int[] nums1 = new int[]{1, 1, 2, 3, 4, 5, 5};
    static int lengthOfnums1 = 0;
    static int a = 0;

    public static void main(String[] args) {
        lengthOfnums1 = nums1.length;
        removeDuplicate(nums1, lengthOfnums1);
        //also using 2 loops but time complexity increases...
    }

    private static void removeDuplicate(int[] nums1, int lengthOfnums1) {
        if (lengthOfnums1 > 0) {
            for (int i = 1; i < lengthOfnums1; i++) {
                if (nums1[i] != nums1[a]) {
                    a++;
                    nums1[a] = nums1[i];
                }
            }
            for (int i = 0; i < nums1.length; i++) {
                System.out.println("For Nums1: " + nums1[i]);
            }
            System.out.println("Value a: " + a);
            System.out.println("Value+1: " + a + 1);
        }
    }
}
