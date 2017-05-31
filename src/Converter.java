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

        System.out.println("Type inch to convert inches to feet or type sec to convert seconds to hours.");
        selection = scanner.nextLine();

        if(selection.equalsIgnoreCase("inch")){
            length.lengthConverter();
        } else if (selection.equalsIgnoreCase("sec")) {
            time.timeConverter();
        }else{
            promptSelection();
        }
    }

}
