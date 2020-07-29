import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TipCalculator
{
    public static double tipCalculator(double billAmount, int tipRating)
    {
        return switch (tipRating) {
            case 1 -> billAmount * 0.05;
            case 2 -> billAmount * 0.1;
            case 3 -> billAmount * 0.15;
            case 4 -> billAmount * 0.2;
            default -> billAmount * 0.25;
        };
    }

    public static int enterTipRating()
    {
        int number = 0;
        System.out.println("Please rate the service from 1 to 5:");
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

    public static double enterBillAmount()
    {
        {
            double billAmount = 0;
            System.out.println("Please enter the bill amount:");
            Scanner textInput = new Scanner(System.in);
            try
            {
                billAmount = textInput.nextDouble();
            }
            catch (InputMismatchException e)
            {
                System.err.println("That isn't a number!");
            }
            return billAmount;
        }
    }

    public static void main(String[] args)
    {
        double billAmount = enterBillAmount();
        int tipRating = enterTipRating();
        double tipAmount = tipCalculator(billAmount, tipRating);
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("You should tip £" + df.format(tipAmount));
    }
}
