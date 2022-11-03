package com.github.marzad.klassen;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();

        student1.setFirstname("Max");
        student1.setLastname("Muster");
        student1.setBirthday("12.04.2001");
        student1.setCourse("Informatik");
        student1.setStudentID(1);


        Student student2 = new Student("Maria", "Muster", 2, "23.06.2000", "BWL");

        Student student3 = new Student("Anton","Mustermann", 3, "04.07.2003", "Germanistik");

        StudentDB studentDB = new StudentDB();

        studentDB.addStudent(student1);
        studentDB.addStudent(student2);
        studentDB.addStudent(student3);

        //Ausgabe der DB
        System.out.println(studentDB.toString());

        //Ausgabe eines zufälligen Studenten
        System.out.println(studentDB.randomStudent());

        //Entfernen den Studenten mit der ID 2 und Ausgabe
        studentDB.removeStudent(2);
        System.out.println("\n" + studentDB.toString());

        ComputerScienceStudent student4 = new ComputerScienceStudent();

        student4.setFirstname("Mark");
        student4.setLastname("Mann");
        student4.setBirthday("13.05.2001");
        student4.setStudentID(4);
        student4.setCourse("Informatik");
        student4.setAdress("Hamburg");

        System.out.println(student4.toString());

    }
}