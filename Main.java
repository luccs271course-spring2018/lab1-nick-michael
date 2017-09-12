import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //variables:
        int input;
        int n = 1;
        Scanner kb = new Scanner(System.in);

        //PART 2
        //This code was written by Nick Taylor, Michael Woelfel, and Miguel Gonzales
        //This was added as of 9/11/2017 9:07 PM as a test update

        System.out.println("fizzBuzz a number:");
        input = kb.nextInt();
        while (input > 0) {
            if (n % 3 == 0)
            {
                System.out.print("Fizz ");
            }
            if (n % 5 == 0)
            {
                System.out.print("Buzz");
            }
            if (n % 3 != 0 && n % 5 != 0)
            {
                System.out.print(Integer.toString(n));
            }
            System.out.println();
            n++;
            input--;
        }
    }
}