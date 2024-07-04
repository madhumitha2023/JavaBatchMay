package june22;

public class Car extends Vehicle {
    public Car(String make, String model, int year) {
        super(make, model, year);
    }

    private int numOfDoors;

    public int getNumOfDoors() {
        return numOfDoors;
    }
}
