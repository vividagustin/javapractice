/**
 *
 * @author vivid
 * 
 * Determining the next color for a stop light using switch  
 */


package com.example;

import java.util.Scanner;

public class TrafficLightSwitch {

    public static void main(String args[]) {
        StopLight light = new StopLight();
        Scanner in = new Scanner(System.in);
        String next = "Next Traffic Light is ";
        String invalid = "Invalid color";
        
        //user enter the value for the currentColor
        System.out.println("Enter a color code");
        int currentColor = in.nextInt();
        
        //next color
        switch(currentColor){
            case 1:
                String nextLight1 = light.nextColor(currentColor);
                System.out.println(next + nextLight1);
                break;
            case 2:
                String nextLight2 = light.nextColor(currentColor);
                System.out.println(next + nextLight2);
                break;
            case 3:
                String nextLight3 = light.nextColor(currentColor);
                System.out.println(next + nextLight3);
                break;
            default:
                System.out.println(invalid);
        }
    }
}
