

public class MedianOfFixedArray {

    static int[] numss1 = new int[] {2, 7, 11, 15};
    static int[] numss2 = new int[] {1, 3, 5, 12};

    public static void main(String[] args) {
        findMedianSortedArrays(numss1, numss2);
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int i = 0, j = 0;
        int length_of_num1 = nums1.length; // 4
        int length_of_num2 = nums2.length;   // 4
        double m1 = -1, m2 = -1, result = 0;

        if ((length_of_num1 + length_of_num2) % 2 == 1) {
            //total is odd
            for (int l = 0; l <= (length_of_num1 + length_of_num2) / 2; l++) {

                if (i != length_of_num1 && j != length_of_num2) {
                    m1 = (nums1[i] > nums2[j]) ? nums2[j++] : nums1[i++];

                } else if (i < length_of_num1) {
                    m1 = nums1[i++];

                } else {
                    m1 = nums2[j++];
                }
            }
            result = m1;

        } else {    //total is even
            for (int l = 0; l <= (length_of_num1 + length_of_num2) / 2; l++) {
                m2 = m1;

                if (i != length_of_num1 && j != length_of_num2) {
                    m1 = (nums1[i] > nums2[j]) ? nums2[j++] : nums1[i++];

                } else if (i < length_of_num1) {
                    m1 = nums1[i++];

                } else {
                    m1 = nums2[j++];
                }
            }
            result = (m1 + m2) / 2;
        }
        System.out.println(result);
        return result;
    }
}
