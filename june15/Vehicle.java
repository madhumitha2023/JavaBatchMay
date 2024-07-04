package june15;

public class Vehicle{
    String make;
    String model;
    String year;
    String color;
    String type;

    public Vehicle(String make, String model, String year, String color, String type)
    {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.type = type;
    }

    public void printCarDetails()
    {
        System.out.println("Make: "+ this.make);
        System.out.println("Model: "+ this.model);
        System.out.println("year: "+ this.year);
        System.out.println("Color: "+ this.color);
        System.out.println("Type: "+ this.type);
    }
}
