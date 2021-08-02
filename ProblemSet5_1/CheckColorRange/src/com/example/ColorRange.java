/**
 *
 * @author vivid
 * 
 * Determining color in the visible spectrums
 * use Chaining if/else Constructs & Nested if Statements
 */

package com.example;

import java.util.Scanner;

public class ColorRange {

    public static void main(String args[]) {
        Scanner input   = new Scanner(System.in);
        String inPart   = "The color is ";
        String outPart  = "The entered wavelength is not a part of the visible spectrum";
        
        //to get input for color code
        System.out.println("Enter a color code");
        //user enter the wavelength, it should be of type double
        double colorCode = input.nextDouble();
        
        // to get the color that suit with given color code
        String color;
        if(colorCode >= 380 && colorCode <750){
            if(colorCode >= 380 && colorCode < 450){
                color = "Violet";
            } else if(colorCode >= 450 && colorCode < 495){
                color = "Blue";
            } else if(colorCode >= 495 && colorCode < 570){
                color = "Green";
            } else if(colorCode >= 570 && colorCode < 590){
                color = "Yellow";
            } else if(colorCode >= 590 && colorCode < 620){
                color = "Orange";
            } else {
                color = "Red";
            } 
            
            //print the color from given color code
            System.out.println(inPart + color);
        } else {
            //input value is not found on the visible spectrum then state that the wavelength is not within the visible spectrum.
            System.out.println(outPart);
        }        
        
    }
}
