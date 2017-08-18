/**
 * Created by jc428741 on 18/08/17.
 *
 */

public class FitnessTracker {
    private String activity;
    private double minutes;
    private String date;

    public FitnessTracker()
    {
        activity = "running";
        minutes = 0;
        date = "January 1";
    }
    public FitnessTracker(String activity, double minutes, String date)
    {
        this.activity = activity;
        this.minutes = minutes;
        this.date = date;
    }
}
