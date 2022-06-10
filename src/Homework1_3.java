import java.util.Arrays;

public class Homework1_3 {
    public static void main (String[] args) {
        int[] array1 = new int[]{1, 2, 5, 7, 10};
        int[] array2 = new int[]{2, 3, 2, 17, 15};
        int[] array3 = new int[]{array1[0], array1[1], array1[2], array1[3], array1[4], array2[0], array2[1], array2[2], array2[3], array2[4], array1[0] * array2[0], array1[1] * array2[1], array1[2] * array2[2], array1[3] * array2[3], array1[4] * array2[4]};
        System.out.println(Arrays.toString(array3));
    }
}
