/**
 *
 * @author vivid
 * 
 * Validate a Bank PIN 
 */

package com.example;

import java.util.Scanner;

public class ValidatePin {
        
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String enter = "Enter 6 digits valid PIN: ";
        String invalid = "The PIN is incorrect!";
        String valid = "The PIN is correct! Now you have access to this account.";
        int validPIN = 723988; //Declare a valid integer PIN
        
        System.out.print(enter); //Prompt the user to enter the PIN
        int userEntered = input.nextInt(); //get input from user 
        //int lengthPIN = String.valueOf(userEntered).length(); //count digit that entered by the user
        
        
        if(validPIN == userEntered) {   //if the condition true as the pin is valid
            System.out.println(valid); //print
        } else {
            // doing loops when the condition the pin is invalid
            while (validPIN != userEntered) {
                System.out.print(invalid + enter); //Prompt the user to enter the valid PIN
                userEntered = input.nextInt(); //user enter the PIN
                if (validPIN == userEntered) { 
                    break; // terminate loops when the condition the pin is valid
                }   
            }
            System.out.println(valid); //print if the condition of while false as the pin is valid
        }
   
    }
}
