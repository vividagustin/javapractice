/**
 *
 * @author vivid
 * 
 * Determining the next color for a stop light 
 * use Chaining if/else Constructs
 */

package com.example;

import java.util.Scanner;


public class TrafficLightChecker {

    public static void main(String args[]) {
        StopLight light = new StopLight();
        Scanner in = new Scanner(System.in);
        String next = "Next Traffic Light is ";
        String invalid = "Invalid color";
        
        //user enter the value for the currentColor
        System.out.println("Enter a color code");
        int currentColor = in.nextInt();
        
        //next color
        if(currentColor == 1 || currentColor == 2 || currentColor == 3){
            String nextLight = light.nextColor(currentColor);
            System.out.println(next.concat(nextLight));
        } else {
            System.out.println(invalid);
        }
    }

}
