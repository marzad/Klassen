package org.example;

import java.util.ArrayList;
import java.util.List;

public class StudentDB {
    Student student = new Student();
    static List<Student> studentDB;

    public StudentDB(){
        studentDB = new ArrayList<>();
    }

    public void addStudent(Student student){
        this.studentDB.add(student);
    }

    public void removeStudent(long id){
        for(Student s:studentDB){
            if(s.getStudentID() == id){
                studentDB.remove(s);
            }
        }

    }

    public String toString(){
        String str = "";
        for(Student s:studentDB){
            str += s.toString() + "\n";
        }
        return str;
    }

    public static List<Student> getAllStudents(){
        return studentDB;
    }

    public Student randomStudent(){
        int random = (int)(Math.random()*(studentDB.size()));
        return studentDB.get(random);
    }

}
