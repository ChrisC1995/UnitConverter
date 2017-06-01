import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by christiancampbell on 5/31/17.
 */
public class Length {
    private Scanner scanner = new Scanner(System.in);

    private int inches;
    private int inchesToFeet;
    private int remainingInches;

    public void lengthConverter(){
        try {
            System.out.println("How many inches do you want to convert to feet.");
            inches = scanner.nextInt();
            inchesToFeet = inches / 12; //gets the feet.
            remainingInches = inches % 12; // gets the remaining inches
            System.out.println(inchesToFeet + " FT. " + remainingInches + " Inches "); //displays the results.
        }catch(InputMismatchException e){ //catches any exception.
            System.out.println("Invalid input, only enter a whole integer. Try again.");
        }

    }


}
