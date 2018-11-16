package com.catzen;

public class Person {
    private String personName;
    private String personSurname;
    private int personAge;
    private int personWeight;
    private int personRise;

    public Person() {
    }

    public Person(String personName, String personSurname) {
        this.personName = personName;
        this.personSurname = personSurname;
    }

    public void setPersonAge(int personAge) {
        this.personAge = personAge;
    }

    public void setPersonWeight(int personWeight) {
        this.personWeight = personWeight;
    }

    public void setPersonRise(int personRise) {
        this.personRise = personRise;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personName='" + personName + '\'' +
                ", personSurname='" + personSurname + '\'' +
                ", personAge=" + personAge +
                ", personWeight=" + personWeight +
                ", personRise=" + personRise +
                '}';
    }
}
