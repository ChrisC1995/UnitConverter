import java.util.Scanner;

/**
 * Created by christiancampbell on 5/30/17.
 */
public class Converter {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        promptSelection();
    }

    private static void promptSelection(){
        Time time = new Time();
        Length length = new Length();

        String selection;

        System.out.println("Type length to convert inches to feet or type time to convert seconds to hours.");
        selection = scanner.nextLine();

        switch (selection.toLowerCase()){
            case "length":
                length.lengthConverter();
                break;
            case "time":
                time.timeConverter();
                break;
            default:
                promptSelection();
        }
    }

}
