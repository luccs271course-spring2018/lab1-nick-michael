import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean cont;

        //PART 3
        //This code was written by Nick Taylor, Michael Woelfel, and Miguel Gonzales

        do {
            System.out.println("fizzBuzz a number");

            Scanner kb = new Scanner(System.in);
            int n = kb.nextInt();
            if (n <= 0)
            {
                System.out.println("Cannot test negative values or values equal to 0");
            }
            else
            {
                fizzBuzz(n);
                Object anArray[] = Main.fizzBuzz(n);
                Arrays.asList(anArray);
                for (int i = 0; i < anArray.length; i++)
                {
                    System.out.println(anArray[i]);
                }
            }
            System.out.println("Continue? Y/N");
            char test = kb.next().charAt(0);
            if (test == 'y' || test == 'Y')
            {
                cont = true;
            }
            else
            {
                cont = false;
            }
        } while (cont);
    }


    public static Object[] fizzBuzz(int fB)
    {
        Object[] array = new Object[fB];
        for(int i = 1; i <= array.length; i++)
        {
            if( i % 3 == 0)
            {
                if( i % 5 == 0) {
                    array[i-1] = "fizz buzz";
                }
                else {
                    array[i-1] = "fizz";
                }
            }
            else if(i % 5 == 0)
            {
                array[i-1] = "buzz";
            }
            else
            {
                array[i-1] = i;
            }
        }
        Arrays.asList(array);
        return array;
    }
}
