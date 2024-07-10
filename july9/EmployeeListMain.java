package july9;

import java.util.ArrayList;
import java.util.List;

public class EmployeeListMain {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();

        Employee employee1 = new Employee(101, 30, "Pragra", "Test", "pragra@gmail.com", "Toronto");
        Employee employee2 = new Employee(102, 32, "Madhu", "Mitha", "madhu@gmail.com", "Toronto");
        Employee employee3 = new Employee(103, 34, "Neha", "Sagar", "neha@gmail.com", "Quebec");
        Employee employee4 = new Employee(104, 40, "Seema", "Chandru", "seema@gmail.com", "Vancouver");
        Employee employee5 = new Employee(105, 45, "Sindhu", "Jyothi", "sindhu@gmail.com", "Calgary");

        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        list.add(employee4);
        list.add(employee5);

        //System.out.println(list);

        System.out.println("Find Employee by name");

       for(Employee i : list) {
           if (i.getFirstName().equals("Pragra")) {
               System.out.println("Name: " + i.getFirstName());
           }
       }
        System.out.println("Find Employee by age");

        for(Employee i : list)
        {
            if(i.getAge()>30)
            {
                System.out.println("Name: "+ i.getFirstName());
                System.out.println("Age: "+ i.getAge());
            }
        }

    }
}
