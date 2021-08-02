/**
 *
 * @author vivid
 */

package processingname;

import java.util.Scanner;


public class ProcessName {
        
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Type your name: ");

        // your code goes here
        //input disimpan di variabel name
        String name = console.nextLine();
        console.close();

        //indexOf space
        int spaceIndex = name.indexOf(' ');
        //get last name after space
        String lastName = name.substring(spaceIndex+1);
        //get initial of first name
        char firstInitial = name.charAt(0);
        //concat lastName & firstInitial
        String fullName = lastName + ", " + firstInitial + ".";
        String result = "Your name is: ".concat(fullName);
        System.out.println(result);
    }
}