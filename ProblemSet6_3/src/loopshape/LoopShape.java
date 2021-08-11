/**
 *
 * @author vivid
 * 
 * Programmatic ASCII Art 
 * a way to draw basic shapes programmatically in customizable sizes
 * rectangle & triangle
 */

package loopshape;

public class LoopShape {
    
    static void createRectangle(int width, int height){
        //Draw a Rectangle
        if(width > 0 && height > 0){                    //Refuse to draw shapes with any dimension less than 1
            int w , h;

            for (h = 0; h < height; h++) {              //looping height
                if(h != 0 && h != height-1){            //other than the first and the last row
                    for (w = 0; w < width; w++) {       //looping width
                        if(w > 0 && w < width-1){       //if other than the first and the last column
                            System.out.print(" ");
                        } else {                        //if the first and the last column
                            System.out.print("#");
                        }
                    }
                } else {                                //the first and the last row
                    for (w = 0; w < width; w++) {       //looping width
                        System.out.print("#");
                    }
                }
                
                System.out.println("");                 //to move to the next line/row
            }
        } else {                                        //if width & height less than 1
            System.out.println("Input number must >= 1");
        }
    }
    
    static void createTriangle(int leg){
        //Draw an Isosceles Right Triangle
        if(leg > 0){                                    //Refuse to draw shapes with any dimension less than 1
            int a , t;

            for (t = 0; t < leg; t++) {                 //looping height
                for (a = 0; a <= t; a++) {              //looping width
                    System.out.print("#");
                }
                System.out.println("");                 //to move to the next line/row
            }
        } else {                                        //if leg less than 1
            System.out.println("Input number must >= 1");
        }
        
    }
}
