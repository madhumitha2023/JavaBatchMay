package Assignments.Assignment1;

import java.util.Arrays;

public class Student {
    private String name;
    private int rollNumber;
    private int age;
    private String course;
    private double[] grades;

    public Student(String name, int rollNumber, int age, String course, double[] grades) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
        this.course = course;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double[] getGrades() {
        return grades;
    }

    public void setGrades(double[] grades) {
        this.grades = grades;
    }

    public double calculateAverageGrade()
    {
        double sum = 0;
        for(double grade : grades)
        {
            sum += grade;
        }
        return sum/grades.length;
    }

    public void displayInfo()
    {
        System.out.println("Student's Name: "+ name);
        System.out.println("Student's Roll Number: "+ rollNumber);
        System.out.println("Student's Age: "+ age);
        System.out.println("Student's Course: "+ course);
        System.out.println("Student's average Grade: "+ calculateAverageGrade());
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                ", age=" + age +
                ", course='" + course + '\'' +
                ", grades=" + Arrays.toString(grades) +
                '}';
    }
}
