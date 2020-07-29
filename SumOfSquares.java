import java.util.InputMismatchException;
import java.util.Scanner;

public class SumOfSquares
{
    public static int squareCalculator(int numberA, int numberB)
    {
        int sum = 0;
        for(int i = numberA; i <= numberB; i++)
        {
            sum += i*i;
        }
        return sum;
    }

    public static int enterNumber()
    {
        int number = 0;
        System.out.println("Please a number:");
        Scanner textInput = new Scanner(System.in);
        try
        {
            number = textInput.nextInt();
        }
        catch (InputMismatchException e)
        {
            System.err.println("That isn't a number!");
        }
        return number;
    }

    public static void main(String[] args)
    {
        int numberA = 0;
        int numberB = 0;
        while(numberA == 0 || numberB == 0 || numberA > numberB)
        {
            if(numberA > numberB)
            {
                System.out.println("Please enter a higher second number!");
            }
            numberA = enterNumber();
            numberB = enterNumber();
        }
        int answer = squareCalculator(numberA, numberB);
        System.out.println("The sum of the squares between " + numberA + " and " + numberB + " is: " + answer);
    }
}
