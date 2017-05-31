import java.util.Scanner;

/**
 * Created by christiancampbell on 5/31/17.
 */
public class Time {
    private Scanner scanner = new Scanner(System.in);

    private int seconds;
    private int secondsToMinutes;
    private int remainingSeconds;


    public void timeConverter(){
        System.out.println("How many seconds do you want to convert to minutes.");
        seconds = scanner.nextInt();
        secondsToMinutes = seconds/60;
        remainingSeconds = seconds%60;

        System.out.println(secondsToMinutes + " Minutes " + remainingSeconds + " Seconds ");

    }
}
