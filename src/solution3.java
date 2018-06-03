import java.util.Arrays;

/**
 * Created by user on 30.05.2018.
 */
public class solution3 {
    public static void main(String[] args){
        int[] array = {1, 2, 3, 4, 5 ,6 ,7 ,8 ,9 ,10,11};
        System.out.println("The original Array");
        System.out.println(Arrays.toString(array));
        for(int i = 0; i < (int)array.length/2; i++)
        {
            int buffer;
            buffer = array[i];
            array[i] = array[array.length-i-1];
            array[array.length-i-1] = buffer;
        }
        System.out.println("Inver Array");
        System.out.println(Arrays.toString(array));
    }
}
