/**
 *
 * @author vivid
 */

package com.example;

import java.util.Random;
import java.util.Scanner;


public class ComputeMethods {
    public  double fToC(double degreesF){
        double celsius = 5/9.0 * (degreesF - 32);
        return celsius;
    }
    
    public  double hypotenuse(int a, int b){
        double c = Math.pow(a, 2) + Math.pow(b, 2);
        double lengthHypotenuse = Math.sqrt(c);
        return lengthHypotenuse;
    }
    
    public int roll(){
        Random randNum = new Random();
        int dice1 = randNum.nextInt(6) + 1;
        int dice2 = randNum.nextInt(6) + 1;
        int sum2Dice = dice1 + dice2;
        return sum2Dice;
    }
    
}

