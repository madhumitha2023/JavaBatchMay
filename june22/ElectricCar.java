package june22;

public class ElectricCar extends Car{

    public ElectricCar(String make, String model, int year) {
        super(make, model, year);
    }
    private int batteryCapacity;

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void batteryCapacity()
    {
        System.out.println("Battery Charging");
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "batteryCapacity=" + batteryCapacity +
                '}';
    }
}
