import java.util.Scanner;

public class CtoF {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int celsius = 0;
        int fahrenheit = 0;

        do
        {
            System.out.println("Please enter temperature in Celsius: ");
            celsius = in.nextInt();
            } while(celsius < -273);

        fahrenheit = (int) (1.8 * celsius + 32);
        System.out.println("The temperature in Fahrenheit is " + fahrenheit);
        }
    }