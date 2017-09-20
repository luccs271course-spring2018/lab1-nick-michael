import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //PART 3 
        //This code was written by Nick Taylor, Michael Woelfel, and Miguel Gonzales

        System.out.println("fizzBuzz a number");

        //Scanner kb = new Scanner(System.in);
        //int n = kb.nextInt();
			n = Integer.parseInt(args[0]);
			if (n <= 0)
        {
            System.out.println("Cannot test negative values or values equal to 0");
        }
        else
        {
            fizzBuzz(n);
            Object anArray[] = Main.fizzBuzz(n);
            for (int i = 0; i < anArray.length; i++)
            {
                System.out.println(anArray[i]);
            }
        }
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
        return array;
    }
}