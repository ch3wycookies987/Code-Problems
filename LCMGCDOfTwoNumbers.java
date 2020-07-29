import java.util.InputMismatchException;
import java.util.Scanner;

public class LCMGCDOfTwoNumbers
{
    public static int findGCD(int numberA, int numberB)
    {
        if (numberA == 0)
            return numberB;
        return findGCD(numberB % numberA, numberA);
    }

    public static int findLCM(int numberA, int numberB)
    {
        return (numberA * numberB) / findGCD(numberA, numberB);
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
        while (numberA == 0 || numberB == 0)
        {
            numberA = enterNumber();
            numberB = enterNumber();
        }
        int lcm = findLCM(numberA, numberB);
        int gcd = findGCD(numberA, numberB);

        System.out.println("The LCM of " + numberA + " and " + numberB + " is " + lcm);
        System.out.println("The GCD of " + numberA + " and " + numberB + " is " + gcd);
    }
}
