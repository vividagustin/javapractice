/**
 *
 * @author vivid
 * 
 * Displaying Multiples of a Number 
 * to calculate the multiples of a given number using a for loop
 * 
 */

package com.example;

import java.util.Scanner;

public class DisplayMultiples {

    public static void main(String args[]) {
       Scanner userInput = new Scanner(System.in);
       int index;
       int number[] = new int[12];
       int multiples = 1;
       
       //Have the user enter a number, and then use a for loop to display all the multiples of that number from 1 to 12.  
       for(index = 0; index < 12; index++){         //loop 12 times
           number[index] = userInput.nextInt();     //Have the user enter a number
           multiples *= number[index];              //multiples of the entered number
       }
        System.out.println(multiples);              //display all the multiples of that 12 number
    }

}
