package june18;

public class AggregationDepartment {
    private String deptName;
    private AggregationStudent students;

    public AggregationDepartment(String deptName, AggregationStudent students) {
        this.deptName = deptName;
        this.students = students;
    }

    public AggregationStudent getStudents() {
        return students;
    }


    @Override
    public String toString() {
        return "deptName= " + deptName + " , students= " + students;
    }
}
