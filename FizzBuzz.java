import java.util.InputMismatchException;
import java.util.Scanner;

public class FizzBuzz
{
    public static void fizzBuzz(int number)
    {
        for(int i = 0; i < number + 1; i++)
        {
            StringBuilder answer = new StringBuilder();
            if((i % 3) == 0)
            {
                answer.append("Fizz");
            }
            if((i % 5) == 0)
            {
                answer.append("Buzz");
            }
            if(answer.length() == 0)
            {
                answer.append(i);
            }
            System.out.println(answer.toString());
        }
    }

    public static int enterNumber()
    {
        int number = 0;
        System.out.println("Please enter a number to test:");
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
        int number = 0;
        while(number <= 0)
        {
            if(number < 0)
            {
                System.out.println("Please enter a positive number!");
            }
            number = enterNumber();
        }
        fizzBuzz(number);
    }
}
