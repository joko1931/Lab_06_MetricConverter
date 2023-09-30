import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double meters = 0;
        double inches = 0;
        double feet = 0;
        double miles = 0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.println("Enter value in meters: ");
            if (in.hasNextDouble())
            {
                meters = in.nextDouble();
                inches = meters * 39.37;
                feet = meters * 3.281;
                miles = meters / 1609;
                System.out.println(meters + " in meters is " + inches + " in inches.");
                System.out.println(meters + " in meters is " + feet + " in feet.");
                System.out.println(meters + " in meters is " + miles + " in miles.");
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Please enter a valid value, not " + trash);
            }
        }while(!done);
    }
}