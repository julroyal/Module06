import java.util.Scanner;

public class metricConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double meter = 0;
        double mile = 0;
        double feet = 0;
        double inch = 0;

        do
        {
            System.out.println("What is the length in meters? ");
            meter = in.nextDouble();
        }while(meter < 0);

        mile = Math.round(meter / 1609.34 * 10.00 / 10.00);
        System.out.println("Your length in miles is " + mile);

        feet = Math.round(meter / 0.3048 * 10.00 / 10.00);
        System.out.println("Your length in feet is " + feet);

        inch = Math.round(meter / 0.0254 * 10.00 / 10.00);
        System.out.println("Your length in inches is " + inch);
        }
    }
