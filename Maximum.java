import java.util.Scanner;

/**
 * This program decides the maximum 
 * value of the 3 values that the user inputs
 * @author Jordan Hunt
 * Math 130
 */

public class Maximum {
    public static void main(String[] args) {

        // Scanner object to get input from user
        Scanner input = new Scanner(System.in);

        // print out header fom sample output
        System.out.println("This program finds the maximum of three integer numbers");

        // prompt user to enter first integer
        System.out.print("Enter the 1st integer: ");
        int num1 = input.nextInt();

        // prompt user to enter the second integer
        System.out.print("Enter the 2nd integer: ");
        int num2 = input.nextInt();

        // prompt user to enter third integer
        System.out.print("Enter the 3rd integer: ");
        int num3 = input.nextInt();

        // declare max variable
        int max;

        // if else statements to find maximum
        // if num1 is larger than num2, check if num1 is also larger then num3
        if (num1 >= num2)
            // check if also larger than num3
            if (num1 >= num3)
                // if so, num1 is max
                max = num1;
            // if not, num3 is max
            else
                max = num3;
        // if num2 is larger than num1, check against num3
        else if (num2 >= num3)
            // if larger, then num2 is max
            max = num2;
        // if not, num3 is max
        else
            max = num3;

        // print out the maximum
        System.out.println("The maximum is " + max);

        // close Scanner
        input.close();


    }
}