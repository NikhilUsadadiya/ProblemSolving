import java.util.Arrays;

public class ContainerWithMostWater {

    public static void main(String[] args) {
        int temp, size;
//        int array[] = {10, 20, 25, 63, 96, 57};
        int array[] = {2, 8, 4, 6, 9, 15, 8};
        size = array.length;
//        System.out.println(size);

//        Arrays.sort(array);
//        int result = array[size - 2];
//        System.out.println("sorted list: " + Arrays.toString(array) + "\nsize: " + size);
//        System.out.println("2nd largest number is:: " + array[size-2] + "<<>>" + array[size-1]);
//        System.out.println("Third second largest number is:: " + array[(array.length) - 1] + "<<>>" + array[(array.length)]);

        getAreaForWater(array);
    }

    private static void getAreaForWater(int[] array) {

        int i = 0;
        int area = 0;
        int endpoint = array.length - 1;

        while (i < endpoint) {
            area = Math.max(area, Math.min(array[i], array[endpoint]) * (endpoint - i));

            if (array[i] < array[endpoint]) {
                i = i + 1;
            } else {
                endpoint = endpoint - 1;
            }
        }
        System.out.println(area);
    }

}
