import java.util.Arrays;

/**
 * Created by user on 29.05.2018.
 */
public class Solution2 {
    public static void main(String[] args) {
        int[] numbers = {3, 0, 0, 3, 0, 0, 3, 0, 0, 3};
        int[][] dublicateNumbres = new int[2][ numbers.length / 2];
        for (int i = 1; i < numbers.length / 2; i++)
            dublicateNumbres[0][i] = numbers[i] - 100;
        int numberOfRepetitions = 0;
        int secondDublicat = 0;
        for (int i = 0; i < numbers.length; i++) {
            int countsDublicate = 1;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    countsDublicate++;
                }
            }
            if (countsDublicate != 1) {
                for (int k = 0; k < numbers.length / 2; k++)
                    if (numbers[i] == dublicateNumbres[0][k]) {
                        secondDublicat++;
                    }
                if (secondDublicat == 0) {
                    dublicateNumbres[0][numberOfRepetitions] = numbers[i];
                    dublicateNumbres[1][numberOfRepetitions] = countsDublicate;
                    countsDublicate = 1;
                    numberOfRepetitions++;
                }
                secondDublicat = 0;
            }
        }
        System.out.println("Source array");
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < numberOfRepetitions; i++)
            System.out.println("[" + dublicateNumbres[0][i] + "]" + " number of repetitions " + dublicateNumbres[1][i]);
    }
}
