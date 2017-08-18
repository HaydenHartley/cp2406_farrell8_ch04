/**
 * Created by jc428741 on 18/08/17.
 *
 */
public class BloodData {
    private String bloodType;
    private String rhFactor;

    public BloodData()
    {
        bloodType = "O";
        rhFactor = "+";
    }
    public BloodData(String bloodType,String RhFactor)
    {
        this.bloodType = bloodType;
        this.rhFactor = RhFactor;
    }
}
