import java.util.Scanner;

/*
 * Jordan Hunt
 * Math 130
 * This program decides the maximum 
 * value that the user inputs
 * 
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

        int max;

        // if else statements to find maximum
        // if num1 is larger than num2 & num3 print out num1
        if (num1 >= num2)
            if (num1 >= num3)
                max = num1;
            else
                max = num3;
        if (num2 >= num3)
            System.out.println("The maximum is " + num2);
        else 
        System.out.println("The maximum is " + num3);

        // if num2 is larger than num3 & num1 print out num1
        // if (num2 >= num3)
        // System.out.print("The maximum is " + num2);
        // else
        // System.out.print("The maximum is " + num3);
    }
}