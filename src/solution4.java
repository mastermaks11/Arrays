import java.util.Scanner;

/**
 * Created by user on 30.05.2018.
 */
public class solution4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String number = scan.nextLine();
        int[] arrayNumbers = new int[number.length()];
        boolean  increasingSequence= true;
        for(int i=0; i < number.length(); i++)
        {
           arrayNumbers[i] = Character.getNumericValue(number.charAt(i));
        }
        for(int i=0; i < arrayNumbers.length-1; i++)
        {
          if(arrayNumbers[i]>=arrayNumbers[i+1])
              increasingSequence = false;
        }
       if (increasingSequence)
           System.out.println("the numbers form an increasing sequence");
         else
           System.out.println("the numbers not form an increasing sequence");
    }
}
