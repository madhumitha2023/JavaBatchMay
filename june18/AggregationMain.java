package june18;

//Has-A relationship, Unidirectional association and one-way relationship

public class AggregationMain {

    public static void main(String[] args) {


        AggregationDepartment s1 = new AggregationDepartment("ECE", new AggregationStudent("Madhumitha", 1));
        AggregationDepartment s2 = new AggregationDepartment("CSE", new AggregationStudent("Aarthi", 2));
        AggregationDepartment s3 = new AggregationDepartment("ECE", new AggregationStudent("Sonal", 3));
        AggregationDepartment s4 = new AggregationDepartment("Mech", new AggregationStudent("Ankush", 4));
        AggregationDepartment s5 = new AggregationDepartment("ISE", new AggregationStudent("Divyesh", 5));

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
    }
}
