import java.util.Scanner;

public class rectangleInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double length = 0;
        double height = 0;
        double area = 0;
        double perimeter = 0;
        double diagonal = 0;

        do
        {
            System.out.println("What is your rectangle's length? ");
            length = in.nextDouble();
        }while(length < 0);

        do
        {
            System.out.println("What is your rectangle's height? ");
            height = in.nextDouble();
        }while(height < 0);

        area = length * height;
        System.out.println("Your rectangle's area is " + area);
        perimeter = (length * 2) + (height * 2);

        System.out.println("Your rectangle's perimeter is " + perimeter);

        diagonal = Math.sqrt(Math.pow(length,2) + (Math.pow(height,2)));
        System.out.println("Your rectangle's diagonal is " + diagonal);
        }
    }
