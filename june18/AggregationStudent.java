package june18;

public class AggregationStudent {
    private String studentName;
    private int studentId;

    public AggregationStudent(String studentName, int studentId) {
        this.studentName = studentName;
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return "{ studentName= " + studentName + ", studentId=" + studentId + "}";
    }
}
