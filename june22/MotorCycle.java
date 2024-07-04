package june22;

public class MotorCycle extends Vehicle{
    public MotorCycle(String make, String model, int year) {
        super(make, model, year);
    }

    private int numCylinders;

    public void setNumCylinders(int numCylinders) {
        this.numCylinders = numCylinders;
    }

    public int getNumCylinders() {
        return numCylinders;
    }

    @Override
    public String toString() {
        return "MotorCycle{" +
                "numCylinders=" + numCylinders +
                '}';
    }
}
