/**
 *
 * @author vivid
 * 
 * Validate a Bank PIN
 * Use a while loop to repeat code until a valid PIN is entered
 */

package com.example;

import java.util.Scanner;

public class ValidatePin {
        
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String enter = "Enter 6 digits valid PIN: ";
        String invalid = "The PIN is incorrect!";
        String valid = "The PIN is correct! Now you have access to this account.";
        int validPIN = 723988;                      //Declare a valid integer PIN
        
        System.out.print(enter);                    //Prompt the user to enter the PIN
        int userEntered = input.nextInt();          //get input from user 
        //int lengthPIN = String.valueOf(userEntered).length(); //count digit that entered by the user
        
        
        if(validPIN == userEntered) {               //Compare the user-entered PIN with the already declared PIN
            System.out.println(valid);              //print if the condition true as the pin is valid
        } else {
            // Repeat the loop until the correct PIN is entered
            
            // doing loops when the condition the pin is invalid
            while (validPIN != userEntered) {       // If the entered PIN is not the same, 
                System.out.print(invalid + enter);  //Prompt the user to enter the PIN again
                userEntered = input.nextInt();      //user enter the PIN
                if (validPIN == userEntered) { 
                    break;                          // terminate loops when the condition the pin is valid
                }   
            }
            
            // Print a message confirming that the correct PIN has been entered and that the user now has access to their account
            System.out.println(valid);              //print if the condition of while false as the pin is valid
        }
   
    }
}
