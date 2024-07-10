package Assignments.Assignment1;

public class StudentManager {
    private Student[] students;
    private int studentCount;

    public StudentManager(Student[] students) {
        this.students = students;
    }

    public void addStudent(Student student)
    {
        if(studentCount < students.length)
        {
            students[studentCount]=student;
            studentCount++;
        }
        else
        {
            System.out.println("Students list is full!");
        }
    }

    public void displayAllStudents()
    {
        for(int i=0;i<studentCount;i++)
        {
            students[i].displayInfo();
            System.out.println("--------------------------------------");
        }
    }

    public Student findStudentByRollNumber(int rollNumber)
    {
        for(int i=0;i<studentCount;i++)
        {
            if(students[i].getRollNumber() == rollNumber)
            {
                students[i].displayInfo();
            }
        }
        return null;
    }

    public void removeStudentByRollNumber(int rollNumber)
    {
        for(int i=0;i<studentCount;i++)
        {
            if(students[i].getRollNumber() == rollNumber)
            {
                for(int j=i;j<studentCount-1;j++)
                {
                    students[j]=students[j+1];
                }
                students[studentCount - 1] = null;
                studentCount--;
                System.out.println("Student removed successfully!");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public void displayTopStudent()
    {
        if(studentCount==0)
        {
            System.out.println("No Students Available!");
        }
        Student topstudent = students[0];
        for(int i=0;i<studentCount;i++)
        {
            if(students[i].calculateAverageGrade() > topstudent.calculateAverageGrade())
            {
                topstudent = students[i];
            }
        }
        System.out.println("Top Student: ");
        topstudent.displayInfo();

    }



}
