package com.github.marzad.klassen;

import java.util.Objects;

public class Student {
    private String firstname;
    private String lastname;

    private long studentID;
    private String birthday;
    private String course;

    //Konstruktor

    public Student(){

    }

    public Student(String fname, String lname, long id, String bday, String course){
        this.firstname = fname;
        this.lastname = lname;
        this.birthday = bday;
        this.course = course;
        this.studentID = id;
    }

    // static-keyword gelte nur für Methoden/Eigenschaften, die für alle Instanzen gleich ist.

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLastname(){
        return lastname;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBirthday() {
        return birthday;
    }

    public long getStudentID() {
        return studentID;
    }

    public void setStudentID(long studentID) {
        this.studentID = studentID;
    }

    @Override
    public String toString(){
        return (this.firstname + " " + this.lastname + " mit der ID " + this.studentID +
                " ist am " + this.birthday + " geboren, studiert " + this.course);

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (studentID != student.studentID) return false;
        if (!Objects.equals(firstname, student.firstname)) return false;
        if (!Objects.equals(lastname, student.lastname)) return false;
        if (!Objects.equals(birthday, student.birthday)) return false;
        return Objects.equals(course, student.course);
    }

    @Override
    public int hashCode() {
        int result = firstname != null ? firstname.hashCode() : 0;
        result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
        result = 31 * result + (int) (studentID ^ (studentID >>> 32));
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        result = 31 * result + (course != null ? course.hashCode() : 0);
        return result;
    }
}
