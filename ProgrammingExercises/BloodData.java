/**
 * Created by jc428741 on 18/08/17.
 *
 */
import java.util.Scanner;
public class BloodData {
    private String bloodType;
    private String rhFactor;
    private boolean validInput;
    Scanner inputDevice = new Scanner(System.in);
    public BloodData()
    {
        bloodType = "O";
        rhFactor = "+";
    }
    public BloodData(String bloodType,String RhFactor)
    {
        
        bloodType = inputDevice.nextLine();
        this.bloodType = bloodType;
        this.rhFactor = RhFactor;
    }
}
