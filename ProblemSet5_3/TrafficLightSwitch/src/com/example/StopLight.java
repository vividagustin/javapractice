/**
 *
 * @author vivid
 * 
 * Determining the next color for a stop light 
 * use if statement
 * for TrafficLightSwitch.java
 */

package com.example;

public class StopLight {
    public String nextColor(int code){
        String light1 = "red";
        String light2 = "green";
        String light3 = "yellow";
        String nextlight = null;
        
        if(code == 1){
            nextlight = light2;
        } 
        if (code == 2) {
            nextlight = light3;
        } 
        if (code == 3) {
            nextlight = light1;
        }
        return nextlight;
    }
}
