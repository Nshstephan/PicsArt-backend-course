package com.company;

public class University {
    private String nameSurname;
    private String studentID = "";
    private String department = "";
    private char gender;
    private int graduationYear = 2020;
    private double gpa = 4.0;
    private boolean isGpaGreaterThan2;

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(int graduationYear) {
        this.graduationYear = graduationYear;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public boolean isGpaGreaterThan2() {
        return isGpaGreaterThan2;
    }

    public void setGpaGreaterThan2(boolean gpaGreaterThan2) {
        isGpaGreaterThan2 = gpaGreaterThan2;
    }

    public void studentInfo(){
        System.out.println("Student " + nameSurname + " from " + department + " will graduate at year " + graduationYear + ".");
    }
}
