

public class FirstMissingPositiveNumber {

    public static void main(String[] args) {
//        int[] nums1 = {1, 2, -1, 5, 8, 9};
        int[] nums1 = {-1, 2, -1, 5, 8, 9};
        int size = nums1.length;
        getMissingElement(nums1, size);
    }

    private static void getMissingElement(int[] nums1, int size) {

        for (int i = 0; i < nums1.length; i++) {
            System.out.println("While::>>>nums[i]: " + nums1[i]);

            while (nums1[i] >= 1 && nums1[i] <= size && nums1[i] != nums1[nums1[i] - 1]) {
                int temp = nums1[nums1[i] - 1];
                nums1[nums1[i] - 1] = nums1[i];
                nums1[i] = temp;
                System.out.println("While::>>nums[i]: " + nums1[i] //+ "<>numsss: " + nums1[nums1[i] - 1]
                        + "<>temp: " + temp);
            }
        }

        // Finding which index has value less than n
        for(int i = 0; i < nums1.length; i++)
            if (nums1[i] != i + 1)
                System.out.println("if enter" + (i + 1));

//        return (n + 1);
    }

}
