/**
 *
 * @author vivid
 */

package problemset03;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ProblemSet03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Story = House to live a life
        
        //Properties (Variable)
        String programName  = "LiveALife";
        String hello        = "Hello, welcome to " + programName + 
                            "!\nIt's nice if we could live where we want, in old age live there, have a dream come true house," +
                            " and live a life you'll remember."
                            + "\nBefore you find your dream house, there are 10 questions that you have to answer.";
        String ask          = "Are you fine with that?";
        String[] weatherList= {"rainy", "cloudy", "sunny", "snowy", "hazy", "windy"};
        String fin          = "Finally, you can found the house that you really want to live in. Let's see how is your house.";
        String ask2         = "Do you happy with the house?";
        
        //Welcome
        JOptionPane.showMessageDialog(null,hello,programName,JOptionPane.PLAIN_MESSAGE);
        
        //Ask
        int asking = JOptionPane.showOptionDialog(null, ask, programName, 
                    JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,null,null);
            if(asking == JOptionPane.NO_OPTION){ 
                JOptionPane.showMessageDialog(null,"Okay, see you next time.",programName,JOptionPane.CLOSED_OPTION);
                System.exit(0); //jika memilih no maka keluar
            } 
        
        //question1
        String name = (String)JOptionPane.showInputDialog(null, "Write your nickname",
                    "question 1",JOptionPane.OK_CANCEL_OPTION,null,null,"Type your name");
        
        //question2
        String place = (String)JOptionPane.showInputDialog(null, "The place you want to visit?",
                    "question 2",2,null,null,"Type the place");
        
        //question3
        String transportation = (String)JOptionPane.showInputDialog(null,"The transportation taking you there?",
                                "question 3",2,null,null,"Type the transportation");
        
        //question4
        String num = (String) JOptionPane.showInputDialog(null,"Write a number",
                    "question 4",2,null,null,"Type the num");
        int number = Integer.parseInt(num);
        
        //question5
        String food = (String)JOptionPane.showInputDialog(null,"Food you like?",
                    "question 5",2,null,null,"Type the food");
        
        //question6
        String percent = (String)JOptionPane.showInputDialog(null,"How many percent you won't eat it? (0.1-99.9)?",
                        "question 6",2,null,null,"Type in range 0.1-99.9");
        double percents = Double.parseDouble(percent);

        //question7
        String scenery = (String)JOptionPane.showInputDialog(null,"The scenery you take picture of it?",
                        "question 7",2,null,null,"Type the scenery");
        
        //question8
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);
        Object weather = JOptionPane.showInputDialog(frame,"Your favorite weather?",
                        "question 8",2,null,weatherList,weatherList[0]);
        String weathers = weather.toString();
        
        //question9
        String color = (String)JOptionPane.showInputDialog(null,"Your favorite color?",
                    "question 9",2,null,null,"Type the color");
        
        //question10
        String thing = (String)JOptionPane.showInputDialog(null,"Thing you need to buy?",
                    "question 10",2,null,null,"Type the thing");
        
        //final
        JOptionPane.showMessageDialog(null,fin,programName,JOptionPane.PLAIN_MESSAGE);
        
        //Ask2
        int asking2 = JOptionPane.showConfirmDialog(null,ask2, programName,JOptionPane.YES_NO_OPTION);
            if(asking2 == JOptionPane.NO_OPTION){
                JOptionPane.showMessageDialog(null,"We can renovate the house or find another house.",programName,JOptionPane.CLOSED_OPTION);
                System.exit(0); //jika memilih no maka keluar
            }
    
        //calculate
        int totalPrice  = (int) ((number * (1 + percents)) * 100000);
        int time     = (int) Math.round(Math.pow(number, 3)/60);        
        
        //story
        String story = "After looking for a few weeks, " + name + " finally found the dream house.\n" + 
                "So, on this beautiful Sunday " + name + " decided just stay in house at " + place + " to enjoy the day.\n" +
                "This " + color + " house is so adorable, because the paint is the color that " + name + " likes.\n" +
                "There are " + num + " painting of " + scenery + " that cost " + totalPrice + " is hanging in the wall.\n" +
                "I bring the " + thing + " from the house before because it is suit with the house color.\n" +
                "If want to taste the " + food + " that is renowned here, you need to ride a " + transportation + " for " + time + 
                " minutes,\nbecause the house is far from the crowd and secluded so it takes time.\n" + 
                "It's perfect to eat it in this " + weathers + " day.\n"
                + name + " is very happy will enjoy the rest of life in the house that always dreamed of at an adore place.";
        JOptionPane.showMessageDialog(null, story, programName,JOptionPane.PLAIN_MESSAGE);
    }   
}
