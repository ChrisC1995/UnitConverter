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
        System.out.println("How many inches do you want to convert to feet.");
        inches = scanner.nextInt();
        inchesToFeet = inches/12;
        remainingInches = inches%12;

        System.out.println(inchesToFeet + " FT. " + remainingInches + " Inches ");

    }


}
