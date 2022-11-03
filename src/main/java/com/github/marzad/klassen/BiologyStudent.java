package com.github.marzad.klassen;

public class BiologyStudent extends Student implements Citizen{
    private String city;
    private int identcardnumber;

    public BiologyStudent() {
    }


    public BiologyStudent(String fname, String lname, long id, String bday, String course, String city) {
        super(fname, lname, id, bday, course);
        this.city = city;
    }

    public BiologyStudent(String fname, String lname, long id, String bday, String course, String city, int identcardnumber) {
        super(fname, lname, id, bday, course);
        this.city = city;
        this.identcardnumber = identcardnumber;
    }

    @Override
    public String getAdress() {
        return city;
    }


    @Override
    public int getIdentityCardNumber() {
        return this.identcardnumber;
    }

    @Override
    public void getNoteMean() {
        float f = (float)Math.random()*3 +1;
        System.out.format("Notendurchschnitt: %.2f", f);
    }


}
