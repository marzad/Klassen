package com.github.marzad.klassen;

import com.github.marzad.klassen.Student;

public class ComputerScienceStudent extends Student {
    String adress;

    // Immer einen leeren und einen Konstuktor mit Parametern angeben

    public ComputerScienceStudent() {
    }

    @Override
    public void getNoteMean() {
        float f = (float)Math.random()*3 +1;
        System.out.format("Notendurchschnitt: %.2f", f);
    }

    public ComputerScienceStudent(String fname, String lname, long id, String bday, String course, String adress) {
        super(fname, lname, id, bday, course);
        this.adress = adress;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return super.toString() + " und wohnt in " + this.adress;
    }
}
