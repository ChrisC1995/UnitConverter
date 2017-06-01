import java.util.Scanner;

/**
 * Created by christiancampbell on 5/30/17.
 */
public class Converter {

    private static Scanner scanner = new Scanner(System.in); // Used to take user input.
    private static Boolean loopChoice = true;



    public static void main(String[] args){
        promptSelection(); //Made the main call the prompt selection method for easier looping out of the switch statement.
    }

    private static void promptSelection(){
        Time time = new Time(); //Instantiated these classes to use their methods to convert.
        Length length = new Length();
        String selection;
        
        while(loopChoice){
            System.out.println("Type length to convert inches to feet or type time to convert seconds to hours."); //Prompt to use with the scanner
            selection = scanner.nextLine(); // Sets selection equal to what is inputted into the scanner object.

            switch (selection.toLowerCase()){ //Switch statement to choose what the user wants to convert. Also ignores case.
                case "length":
                    length.lengthConverter(); //Length choice
                    break;
                case "time":
                    time.timeConverter(); // time choice
                    break;
                default:
                    System.out.println("Invalid command, please try again.");
                    promptSelection(); //
            }
            loopQuestion();
        }

    }

    private static void loopQuestion(){
        String loopInputSelection;
        System.out.println("Would you like to make another conversion. Input y if yes, input any other letter if no.");
        loopInputSelection = scanner.nextLine();
        switch (loopInputSelection.toLowerCase()){ //choice of whether to set looping condition to true or false
            case "y":
                loopChoice = true;
                break;
            default:
                loopChoice = false;
        }
    }

}
