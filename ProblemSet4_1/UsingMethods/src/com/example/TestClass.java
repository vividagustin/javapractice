/**
 *
 * @author vivid
 */

package com.example;

import java.util.Scanner;

/**
 *
 * @author vivid
 */
public class TestClass {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //Create an instance of ComputeMethods, 
        ComputeMethods compute = new ComputeMethods();
        
        //invoke the 3 methods and display their results
        System.out.print("Temp in fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        double celsius = compute.fToC(fahrenheit);
        
        System.out.print("Leg 1: ");
        int leg1 = sc.nextInt();
        System.out.print("Leg 2: ");
        int leg2 = sc.nextInt();
        double hypotenuse = compute.hypotenuse(leg1, leg2);
        sc.close();
        
        int sum2Dice = compute.roll();
        
        System.out.println("Temp in celsius is " + celsius);
        System.out.println("Hypotenuse is " + hypotenuse);
        System.out.println("The sum of the dice values is " + sum2Dice);
        
    }
}
