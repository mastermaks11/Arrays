import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by user on 29.05.2018.
 */
public class solution1 {
    public static void main(String[] args) {
        int[] array = {1, 66, 73, 85, 15, 33, 39, -100, 23, 100};
        System.out.println(Arrays.toString(array));
        int minElementArray = array[0];
        int maxElementArray = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minElementArray)
                minElementArray = array[i];
            if (array[i] > maxElementArray)
                maxElementArray = array[i];
        }
        System.out.println(" min value = " + minElementArray);
        System.out.println(" max value = " + maxElementArray);

        for (int i = 0; i < array.length; i++) {
            if (array[i] == minElementArray)
                array[i] = 0;
            if (array[i] == maxElementArray)
                array[i] = 99;
        }
        System.out.print(Arrays.toString(array));
    }

}

