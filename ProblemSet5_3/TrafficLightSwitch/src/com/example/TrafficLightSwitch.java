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
        String stop = "The Traffic Light is currently ";
        String next = "Next Traffic Light is ";
        String invalid = "Invalid color";
        
        //user enter the value for the currentColor
        System.out.println("Enter a color code");
        int currentColor = in.nextInt();
        
        //next color
        switch(currentColor){
            case 1:
                System.out.println(stop + "red");
                String nextLight1 = light.nextColor(currentColor);
                System.out.println(next + nextLight1);
                break;
            case 2:
                System.out.println(stop + "green");
                String nextLight2 = light.nextColor(currentColor);
                System.out.println(next + nextLight2);
                break;
            case 3:
                System.out.println(stop + "yellow");
                String nextLight3 = light.nextColor(currentColor);
                System.out.println(next + nextLight3);
                break;
            default:
                System.out.println(invalid);
        }
    }
}
