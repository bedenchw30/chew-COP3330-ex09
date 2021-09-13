import java.util.Scanner;
public class exerciseNine {
    /**
     *  UCF COP3330 Fall 2021 Assignment 1 Solution
     *  Copyright 2021 beden chew
     */
    public static void main (String[] args){
        Scanner input = new Scanner(System.in); //scanner object

        System.out.print("Enter Length: ");
        double Length = input.nextDouble();

        System.out.print("Enter Width: ");
        double Width = input.nextDouble();

        final double sqrFeetPerGallon = 350;
        double sqrFeet = Length*Width;
        int gallon = (int) Math.ceil(sqrFeet/sqrFeetPerGallon); // solves amount of gallons

        System.out.println("You will need to purchase "+ gallon + " gallons to cover " + sqrFeet + " square feet ");


    }
}
