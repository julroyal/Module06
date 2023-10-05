import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double gallons = 0;
        double fuelEfficiency = 0;
        double gasPrice = 0;
        double fuelCost = 0;
        double totalDistance = 0;
        final double miles = 100;

        do
        {
            System.out.println("What is the total number of gallons of gas " +
                    "in the tank?" );
            gallons = in.nextDouble();
        }while(gallons < 0);

        do
        {
            System.out.println("What is the fuel efficiency in miles per gallon?" );
            fuelEfficiency = in.nextDouble();
        }while(fuelEfficiency >= 140);

        do
        {
            System.out.println("What is the price of gas per gallon?" );
            gasPrice = in.nextDouble();
        }while(gasPrice >= 7.00);

        fuelCost = miles / fuelEfficiency * gasPrice;
        System.out.println("Your total fuel cost will be " + fuelCost);

        totalDistance = gallons * fuelEfficiency;
        System.out.println("The furthest you can go is " + totalDistance + " miles.");
        }
    }
