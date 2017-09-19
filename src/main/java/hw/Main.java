package hw;
import java.util.Scanner;

public class Main {
  public static void main(final String[] args) {
    System.out.println("SUCCESS");

    //variables:
    int input = 30;
    int n = 1;
    //Scanner kb = new Scanner(System.in);

    //PART 2
    //This code was written by Nick Taylor, Michael Woelfel, and Miguel Gonzales
    //This was added as of 9/11/2017 9:07 PM as a test update
    //9/18/2017 8:300 attempting a resubmission

    System.out.println("FizzBuzz a number:");
    // WORKS UP TO HERE

    input = Integer.parseInt(args[0]);
    //input = kb.nextInt();
    while (input > 0)
    {
      if (n % 3 == 0)
      {
        if (n % 5 == 0)
        {
          System.out.println("Fizz buzz");
        }
        else
        {
          System.out.println("Fizz");
        }
      }
      else if (n % 5 == 0)
      {
        System.out.println("Buzz");
      }
      else
      {
        System.out.println(Integer.toString(n));
      }
      n++;
      input--;
    }
  }
}
