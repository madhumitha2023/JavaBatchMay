package Assignments.Assignment1;

public class StudentMain {
    public static void main(String[] args) {

        Student student1 = new Student("Madhu", 11, 22, "Java", new double[]{85.5, 90.0, 88.5});
        Student student2 = new Student("Milind", 12, 23, "Python", new double[]{92.0, 87.5, 91.0});
        Student student3 = new Student("Viaansh", 13, 20, "c++", new double[]{78.0, 83.5, 80.0});
        Student student4 = new Student("Rashmi", 14, 21, "c", new double[]{89.5, 97.0, 92});
        Student student5 = new Student("Mansi", 15, 23, "JavaScript", new double[]{85.5, 97.0, 62.5});

        StudentManager studentManager = new StudentManager(new Student[]{student1,student2,student3,student4,student5});
        studentManager.addStudent(student1);
        studentManager.addStudent(student2);
        studentManager.addStudent(student3);
        studentManager.addStudent(student4);
        studentManager.addStudent(student5);

        System.out.println("All Students Information: ");
        studentManager.displayAllStudents();

        int rollNumSearch = 13;
        System.out.println("Display of Rollnumber Search: "+ rollNumSearch );
        studentManager.findStudentByRollNumber(rollNumSearch);

        int rollNumRemove = 15;
        System.out.println("--------------------------------------");
        System.out.println("Student with rollNumber to be removed: "+rollNumRemove);
        studentManager.removeStudentByRollNumber(rollNumRemove);

        System.out.println("--------------------------------------");
        System.out.println("All Students Information after removing roll number: " + rollNumRemove);
        studentManager.displayAllStudents();

        studentManager.displayTopStudent();

    }
}
