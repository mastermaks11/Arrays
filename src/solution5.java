import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by user on 30.05.2018.
 */
public class solution5 {
    public static void main(String[] args) {
        int[] array = {1, 44, 48, 51, 10, 9, 31, 0, 50, 8};
        System.out.println("The original Array");
        System.out.println(Arrays.toString(array));
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] < array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        System.out.println("The sort Array");
        System.out.println(Arrays.toString(array));
    }
}
