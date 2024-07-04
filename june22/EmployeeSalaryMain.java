package june22;

public class EmployeeSalaryMain {
    public static void main(String[] args) {
        PartTimeEmployee pt = new PartTimeEmployee(1, "Anitha");
        FullTimeEmployee ft = new FullTimeEmployee(2,"Babitha");


        pt.setHours(30,50);
        pt.calculatePay();
        ft.setHours(60,50);
        ft.calculatePay();

    }
}
