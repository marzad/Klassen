package com.github.marzad.klassen;

import com.github.marzad.klassen.Student;

public class ComputerScienceStudent extends Student implements Citizen{
    private String city;
    private int identcardnumber;

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
        this.city = adress;
    }

    public ComputerScienceStudent(String fname, String lname, long id, String bday, String course, String adress, int identcardnumber) {
        super(fname, lname, id, bday, course);
        this.city = adress;
        this.identcardnumber = identcardnumber;
    }

    public String getAdress() {
        return city;
    }

    @Override
    public int getIdentityCardNumber() {
        return 0;
    }

    public void setAdress(String adress) {
        this.city = adress;
    }

    @Override
    public String toString() {
        return super.toString() + " und wohnt in " + this.city;
    }
}
