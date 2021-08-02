
public class RemoveElement {

    static int i = 0;
    static int[] nums1 = {3, 2, 2, 4};
    static int value = 40;

    public static void main(String[] args) {
        removeElement(nums1, value);
    }


    private static void removeElement(int[] nums1, int value) {
        for (int j = 0; j < nums1.length; j++) {
            if (nums1[j] != value) {
                nums1[i] = nums1[j];
                i++;
            } /*else {
                i = -1;
            }*/
        }

        /*for (int k=0; k<nums1.length; k++) {
            System.out.println("k= " + nums1[k]);
        }*/
        System.out.println("i:" + i);
    }

}
