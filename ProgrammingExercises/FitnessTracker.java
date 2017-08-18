/**
 * Created by jc428741 on 18/08/17.
 *
 */
import java.util.Scanner;
public class FitnessTracker {
    private String activity;
    private double minutes;
    private String date;
    Scanner inputDevice = new Scanner(System.in);
    public FitnessTracker()
    {
        activity = "running";
        minutes = 0;
        date = "January 1";
    }
    public FitnessTracker(String activity, double minutes, String date)
    {
        activity = inputDevice.nextLine();
        this.activity = activity;
        this.minutes = minutes;
        this.date = date;
    }
}
