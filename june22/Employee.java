package june22;

public class Employee {
    private int empId;
    private String name;

    public Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    public void calculatePay()
    {
        System.out.println("Pay Calculation");
    }


}
