package june22;

public class InheritanceMain {
    public static void main(String[] args) {
        MotorCycle mc = new MotorCycle("Indian","Suzuki",1991);
        mc.displayInfo();
        mc.start();
        System.out.println(mc);
        mc.stop();

        ElectricCar ec = new ElectricCar("KIA", "Hundai", 1997);
        ec.setBatteryCapacity(40);
        ec.start();
        ec.stop();
        System.out.println(ec);

    }
}
