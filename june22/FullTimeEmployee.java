package june22;

public class FullTimeEmployee extends Employee {

    private int hours;
    private int salary;
    public FullTimeEmployee(int empId, String name) {
        super(empId, name);
    }

    public void setHours(int salary, int hours) {
        this.salary = salary;
        this.hours = hours;
    }

    @Override
    public void calculatePay() {
        super.calculatePay();
        int pay = salary * hours;
        System.out.println("FullTime Salary: $"+ pay);
    }


}
